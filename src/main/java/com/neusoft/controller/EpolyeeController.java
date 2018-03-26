package com.neusoft.controller;



import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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

import com.neusoft.pojo.Epolyee;
import com.neusoft.pojo.User;
import com.neusoft.service.EpolyeeService;

@Controller
public class EpolyeeController {
	@Autowired
	EpolyeeService epolyeeService;
	@RequestMapping("/showOrderEpolyee")
	public String showOrderEpolyee(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Epolyee epolyee = new Epolyee();
		    epolyee.setEpolyeeState(0);
		    String flag= "ok";
		    int pageSize = 1000; 
		    model.addAttribute("EpolyeeMsg", epolyeeService.selectEpolyee(currentPage, epolyee, pageSize,flag));    
		return "EpolyeeInfo";
	}
	/**显示人员列表
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showEpolyee")
	public String showEpolyee(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Epolyee epolyee = new Epolyee();
		    epolyee.setEpolyeeState(null);
		    String flag= "ok";
		    int pageSize = 1000; 
		    model.addAttribute("EpolyeeMsg", epolyeeService.selectEpolyee(currentPage, epolyee, pageSize,flag));  
		    model.addAttribute("Epolyee", epolyeeService.selectEpolyee(currentPage, epolyee, pageSize,flag).getLists());    
		return "EpolyeeInfo";
	}
	
	/**
	 * 职位列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/showjob")
	public String showjob( Model model){
         
		    model.addAttribute("joblist",epolyeeService.selectJob());    
		return "AddEpolyee";
	}
	
	/**
	 * 添加人员 
	 * @param epolyee
	 * @return
	 */
	@RequestMapping("/addEpolyee")
	public @ResponseBody boolean addEpolyee(Epolyee epolyee){   	
		epolyee.setEpolyeeState(0);
		epolyeeService.addEpolyee(epolyee);
		return true;	
	}
	@RequestMapping("/showEpolyeeById")
	public  String showEpolyeeById(int epolyeeId,Model model){  
		model.addAttribute("e", epolyeeService.selectById(epolyeeId));
		model.addAttribute("job",epolyeeService.selectJob());    
			return "EpolyeeDetail";
	}
	
	
	@RequestMapping("/delEpolyee")
	public @ResponseBody boolean delEpolyee(int epolyeeId){   	
		epolyeeService.deleteEpolyee(epolyeeId);
		return true;	
	}
	
	
	@RequestMapping("/updateEpolyee")
	public @ResponseBody String updateEpolyee(Epolyee epolyee){ 
		System.out.println(epolyee.getEpolyeeId());
		epolyeeService.UpdateEpolyee(epolyee);
		return "员工信息更改成功，可以关闭本窗口";	
	}
	
	@RequestMapping("/updateEpolyeeState")
	public @ResponseBody boolean updateEpolyeeState(Epolyee epolyee){
		System.out.println(epolyee.getEpolyeeId());
		epolyeeService.UpdateEpolyee(epolyee);
		return true;	
	}
	
	
	
	
	@RequestMapping("/selectEpolyeeByLike")
	public   String selectEpolyeeByLike(String  parameter,Model model) {
		model.addAttribute("Epolyee", epolyeeService.selectEpolyeeByLike(parameter));
		return "EpolyeeInfo";
		
	}
	
	private InputStream excelFile;
	@RequestMapping("/ExcelExportEpolyee")
	public String ExcelExportOrder() throws Exception {
		Epolyee epolyee = new Epolyee();
		
		List<Epolyee> list = new ArrayList<Epolyee>();
	    list = epolyeeService.selectEpolyee(1, epolyee, 1000,null).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("员工信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("员工编号");
		row.createCell(1).setCellValue("客户姓名");
		row.createCell(2).setCellValue("员工职位");
		row.createCell(3).setCellValue("员工性别");
		row.createCell(4).setCellValue("员工年龄");
		row.createCell(5).setCellValue("员工电话");
	
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
			epolyee = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(epolyee.getEpolyeeId());
			row.createCell(1).setCellValue(epolyee.getEpolyeeName());
			row.createCell(2).setCellValue(epolyee.getJob().getJobName());
			row.createCell(3).setCellValue(epolyee.getEpolyeeSex());
			row.createCell(4).setCellValue(epolyee.getEpolyeeAge());	
			row.createCell(5).setCellValue(epolyee.getEpolyeeTel());
		}
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/员工信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		return "forward:/showEpolyee";
	}
	
	
	
}
