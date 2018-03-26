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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.Servicetype;
import com.neusoft.pojo.User;
import com.neusoft.service.InsuranceService;

@Controller
public class InsuranceController {
	@Autowired
    InsuranceService insuranceService;
	@RequestMapping("/InsuranceAdd")
	public @ResponseBody boolean InsuranceAdd(Insurance insurance){
		insurance.setInsuranceState(1);
		System.out.println(insurance.getInsuranceCost());
		int  count = insuranceService.updateById(insurance);
		if(count!=0){
			return true;
		}
		else{
		return false;
		}
	}
	
	@RequestMapping("/selectAllInsurance")
	public String selectAllInsurance(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Insurance insurance = new Insurance();
		insurance.setInsuranceState(null);
		int pageSize = 1000;
		model.addAttribute("InsuranceAllMsg",insuranceService.selectInsurance(currentPage, insurance, pageSize, null));
		model.addAttribute("iklist", insuranceService.selectInsurance(currentPage, insurance, pageSize, null).getLists());
		return "InsuranceAll";
	}
	
	
	
	@RequestMapping("/showInsuranceDetail")
	public String showBespeakDetail(int insuranceId,Model model){
		Insurance insurance = new Insurance();
		insurance = insuranceService.selectInsurance(insuranceId);
		model.addAttribute("i", insurance);	
		return "UpdateInsurance";			
	}
	
	
	@RequestMapping("/deleteInsurance")
	public @ResponseBody boolean deleteInsurance(int insuranceId){
		insuranceService.deleteInsurance(insuranceId);
		return true;
	}
	
	@RequestMapping("/updateInsurance")
	public  @ResponseBody String updateInsurance(Insurance insurance){
		System.out.println(insurance.getInsuranceId());
		System.out.println(insurance.getInsuranceCost());
		System.out.println(insurance.getInsuranceState());
		insuranceService.updateById(insurance);
		return "修改成功，可以关闭本窗口";
	}
	
	
	@RequestMapping("/selectInsuranceByLike")
	public   String selectInsuranceByLike(String  parameter,Model model) {
		
		model.addAttribute("iklist", insuranceService.selectInsuranceLike(parameter));
		return "InsuranceAll";
		
	}
	private InputStream excelFile;
	@RequestMapping("/ExcelExportInsurance")
	public String ExcelExportOrder() throws Exception {
		Insurance insurance = new Insurance();
		List<Insurance> list = new ArrayList<Insurance>();
	    list =insuranceService.selectInsurance(1, insurance, 1000, null).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("保险信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("保险编号");
		row.createCell(1).setCellValue("客户编号");
		row.createCell(2).setCellValue("预约编号");
		row.createCell(3).setCellValue("受益人");
		row.createCell(4).setCellValue("身份证");
		row.createCell(5).setCellValue("保额");
		row.createCell(6).setCellValue("保险收费");
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
		insurance = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(insurance.getInsuranceId());
			row.createCell(1).setCellValue(insurance.getUser_Id());
			row.createCell(2).setCellValue(insurance.getBespeak_Id());
			row.createCell(3).setCellValue(insurance.getInsuranceOwner());
			row.createCell(4).setCellValue(insurance.getOwnerIdentify());	
			row.createCell(5).setCellValue(insurance.getInsurancePrice().doubleValue());
			row.createCell(6).setCellValue(insurance.getInsuranceCost().doubleValue());
			
		}
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/客户保险信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		return "forward:/selectAllInsurance";
	}
	
	@RequestMapping("/updateinsuranceState")
	public @ResponseBody  boolean updateinsuranceState (Insurance insurance) {
		insuranceService.updateById(insurance);
		return true;
		
	}
	
}

