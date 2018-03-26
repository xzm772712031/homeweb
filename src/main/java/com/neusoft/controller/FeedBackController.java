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

import com.neusoft.pojo.Car;
import com.neusoft.pojo.Feedback;
import com.neusoft.service.FeedBackService;

@Controller
public class FeedBackController {
	@Autowired
	FeedBackService feedBackService;
	
	@RequestMapping("/selectAllFeedBack")
	public String selectAllFeedBack(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Feedback feedback = new Feedback();
		feedback.setFeedbackState(null);
		int pageSize = 4;
		model.addAttribute("FeedBackAllMsg",feedBackService.selectInsurance(currentPage, feedback, pageSize, null));
		model.addAttribute("fklist",feedBackService.selectInsurance(currentPage, feedback, pageSize, null).getLists() );
		return "FeedBackAll";
	}
	
	
	@RequestMapping("/selectBeforeFeedBack")
	public String selectBeforeFeedBack(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Feedback feedback = new Feedback();
		feedback.setFeedbackState(0);
		int pageSize = 4;
		model.addAttribute("FeedBackAllMsg",feedBackService.selectInsurance(currentPage, feedback, pageSize, null));
		model.addAttribute("fklist",feedBackService.selectInsurance(currentPage, feedback, pageSize, null).getLists() );
		return "FeedBackBefore";
	}
	
	
	@RequestMapping("/deleteFeedBack")
	public @ResponseBody boolean deleteFeedBack(int feedbackId) {
		feedBackService.delFeedback(feedbackId);
		return true;
	}
	
	
	@RequestMapping("/showFeedbackbyId")
	public  String showFeedbackbyId(int feedbackId,Model model) {
		model.addAttribute("fb", feedBackService.showByInsuanceById(feedbackId));
		return "FeedBackhandle";
	}
	
	@RequestMapping("/feedbackhandle")
	public  @ResponseBody String feedbackhandle(Feedback feedback) {
		feedback.setFeedbackState(1);
		feedBackService.updateFeedBack(feedback);
		return "客户反馈回复成功，可以关闭本窗口进行其他操作";
	}
	
	
	@RequestMapping("/selectFeedBackByLike")
	public   String selectFeedBackByLike(String  parameter,Model model) {
		
		model.addAttribute("fklist", feedBackService.selectByLike(parameter));
		return "FeedBackAll";
	}
	
	private InputStream excelFile;
	@RequestMapping("/ExcelExportFeedback")
	public String ExcelExportOrder() throws Exception {
		Feedback feedback = new Feedback();
		
		List<Feedback> list = new ArrayList<Feedback>();
	    list =feedBackService.selectInsurance(1, feedback, 1000, null).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("客户反馈信息");
		Row row = sheet.createRow(0);
		
		row.createCell(0).setCellValue("反馈编号");
		row.createCell(1).setCellValue("反馈标题");
		row.createCell(2).setCellValue("反馈内容");
		row.createCell(3).setCellValue("提交时间");
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
			feedback = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(feedback.getFeedbackId());
			row.createCell(1).setCellValue(feedback.getFeedbackTitle());
			row.createCell(2).setCellValue(feedback.getFeedbackContent());
			row.createCell(3).setCellValue(feedback.getStrDate());	
		}
		
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/客户反馈信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		return "forward:/selectAllFeedBack";
	}
	
	
	
	
}
