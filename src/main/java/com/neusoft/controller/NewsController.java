package com.neusoft.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.News;
import com.neusoft.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	NewsService newsService;
	@RequestMapping("/selectAllnews")
	public String selectAllInsurance(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		int pageSize = 10000;
		model.addAttribute("NewsAllMsg",newsService.selectnews(currentPage, pageSize));
		model.addAttribute("nklist", newsService.selectnews(currentPage, pageSize).getLists());
		return "newslist";
	}
	
	@RequestMapping("/selectAllanswer")
	public String selectAllanswer(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		int pageSize = 10000;
		model.addAttribute("answerAllMsg",newsService.selectanswer(currentPage, pageSize));
		model.addAttribute("aklist", newsService.selectanswer(currentPage, pageSize).getLists());
		return "answerlist";
	}
	
	
	@RequestMapping("/addnews")
	public @ResponseBody boolean addnews(News news){
		Date date = new Date();
		news.setNewsDate(date);
		newsService.addnews(news);
		return true;		
	}
	
	

	@RequestMapping("/delnews")
	public @ResponseBody boolean delnews(int newsId){
		newsService.deleteNews(newsId);
		return true;		
	}
	
	
	 @ResponseBody
	    @RequestMapping(value = "/uploadFile")
	    public String uploadFile(HttpServletRequest request,@Param("file") MultipartFile file) throws IOException {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
	        String res = sdf.format(new Date());
	        //服务器上使用
	       // String rootPath =request.getServletContext().getRealPath("/resource/uploads/");//target的目录
	        //本地使用
	        String rootPath ="D:\\test\\";
	        //原始名称
	        String originalFilename = file.getOriginalFilename();
	        //新的文件名称
	        String newFileName = res+originalFilename.substring(originalFilename.lastIndexOf("."));
	        //创建年月文件夹
	        Calendar date = Calendar.getInstance();
	        File dateDirs = new File(date.get(Calendar.YEAR)
	                + File.separator + (date.get(Calendar.MONTH)+1));
	        //新文件
	        File newFile = new File(rootPath+File.separator+dateDirs+File.separator+newFileName);
	        //判断目标文件所在的目录是否存在
	        if(!newFile.getParentFile().exists()) {
	            //如果目标文件所在的目录不存在，则创建父目录
	            newFile.getParentFile().mkdirs();
	        }
	        System.out.println(newFile);
	        //将内存中的数据写入磁盘
	        file.transferTo(newFile);
	        //完整的url
	        String fileUrl =  "/pic/"+date.get(Calendar.YEAR)+ "/"+(date.get(Calendar.MONTH)+1)+ "/"+ newFileName;
	        Map<String,Object> map = new HashMap<String,Object>();
	        Map<String,Object> map2 = new HashMap<String,Object>();
	        map.put("code",0);//0表示成功，1失败
	        map.put("msg","上传成功");//提示消息
	        map.put("data",map2);
	        map2.put("src",fileUrl);//图片url
	        map2.put("title",newFileName);//图片名称，这个会显示在输入框里
	        String result = new JSONObject(map).toString();
	        return result;
	    }
	
	 
}
