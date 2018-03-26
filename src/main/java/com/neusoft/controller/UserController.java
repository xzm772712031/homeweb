package com.neusoft.controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.Order;
import com.neusoft.pojo.User;
import com.neusoft.service.UserService;


@Controller
public class UserController {
	@Autowired
	UserService  userService;
	@RequestMapping("/searchAlluser")
	public String searchAlluser(Model model) {
		List<User> userlist = userService.searchAllUser();
		model.addAttribute("userlist", userlist);
		return "UserInfo";
	}
	
	/**
	 * 客户信息更改
	 * @param user
	 * @param add1
	 * @param add2
	 * @param add3
	 * @return
	 */
	@RequestMapping("/updateUser")
	public @ResponseBody String  updateUser(User user, String province, String city, String area) {	
		if(null!=city&&null!=province&&null!=area){
		String add1= province.substring(0,province.indexOf("_",province.indexOf("_")));
		String add2= city.substring(0,city.indexOf("_",city.indexOf("_")));
		//拼接前台传回的联动地址选择，拼接成完整的地址信息
		String user_Address = add1 + add2 + area + "";
		//将完整的地址传入用户对象中
		user.setUserAddress(user_Address);
		}
		//判断更新操作是否成功，成功后返回值为1，失败则返回0
		int count = userService.updateUser(user);
		if(count!=0){
			return "修改成功，可以关闭窗口。";
		}
		return "修改失败，请关闭本窗口后重试！";
	}
	
	
	@RequestMapping("/selectUserById")
	public String selectUserById(Integer user_Id, Model model) {
		User user = userService.selectById(user_Id);
		model.addAttribute("user", user);
		return "UpdateUser";
	}
	/**
	 * 用户信息查询
	 * @param parameter
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectUserByLike")
	public String selectUserByLike(String parameter, Model model) {
		//可以通过多个条件进行相应的查询，查询结果返回数组，传回页面显示
	    List<User> userlist = userService.selectUserByLike(parameter);
		model.addAttribute("userlist", userlist);
		return "UserInfo";
	}
	
	/**
	 * 用户列表
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectAllUser")
	public String selectAllUser(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		//分页显示的页数
		int pageSize = 4;
		//创建用户对象实例
		User user = new User();
		model.addAttribute("UserAllMsg", userService.selectUSer(currentPage, user, pageSize));
		model.addAttribute("userlist", userService.selectUSer(currentPage, user, pageSize).getLists());
		return "UserInfo";
	}
	
	@RequestMapping("/deleteUser")
	public @ResponseBody String deleteUser(int userId) {
		int count = userService.deleteUser(userId);
		if(count != 0){
			return "Success";
		}
		else{
		return "Fail";
		}
	}
	
	
	private InputStream excelFile;
	@RequestMapping("/ExcelExportUser")
	public String ExcelExportOrder() throws Exception {
		User user = new User();
		
		List<User> list = new ArrayList<User>();
	    list = userService.selectUSer(1, user, 1000).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("客户信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("客户编号");
		row.createCell(1).setCellValue("客户姓名");
		row.createCell(2).setCellValue("客户生日");
		row.createCell(3).setCellValue("客户邮箱");
		row.createCell(4).setCellValue("客户电话");
		row.createCell(5).setCellValue("客户地址");
		row.createCell(6).setCellValue("客户性别");
		row.createCell(7).setCellValue("客户身份证");
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
		user = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(user.getUserId());
			row.createCell(1).setCellValue(user.getUserName());
			row.createCell(2).setCellValue(user.getStrDate());
			row.createCell(3).setCellValue(user.getUserEmail());
			row.createCell(4).setCellValue(user.getUSerSex());	
			row.createCell(5).setCellValue(user.getUserAddress());
			row.createCell(6).setCellValue(user.getUSerSex());
			row.createCell(7).setCellValue(user.getUserPersonId());	
		}
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/客户信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		return "forward:/selectAllUser";
	}
	
}
