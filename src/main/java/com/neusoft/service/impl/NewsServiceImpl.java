package com.neusoft.service.impl;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.mapper.NewsMapper;
import com.neusoft.pojo.News;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsMapper  newsMapper;
	@Override
	public PageBean<News> selectnews(int currentPage, int pageSize) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<News> pageBean = new PageBean<News>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = newsMapper.count();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());  
        //封装每页显示的数据
        List<News> lists = newsMapper.selectnews(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
    		 for (int i=0;i<lists.size();i++) { 
    			 lists.get(i).setStrDate(f.format(lists.get(i).getNewsDate()));	 
    			
    		}
        pageBean.setLists(lists);  
        return pageBean;
	}
	
	
	@Override
	public int deleteNews(int newsId) {	
		return newsMapper.deleteByPrimaryKey(newsId);
	}

	
	@Override
	public int updateNews(News news) {
		return newsMapper.updateByPrimaryKey(news);
	}
	
	

	@Override
	public int addnews(News news) {
		return newsMapper.insertSelective(news);
	}

	@Override
	public PageBean<News> selectanswer(int currentPage, int pageSize) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<News> pageBean = new PageBean<News>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = newsMapper.count2();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());  
        //封装每页显示的数据
        List<News> lists = newsMapper.selectanswer(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
    		 for (int i=0;i<lists.size();i++) { 
    			 lists.get(i).setStrDate(f.format(lists.get(i).getNewsDate()));	 
    			
    		}
        pageBean.setLists(lists);  
        return pageBean;
	}

}
