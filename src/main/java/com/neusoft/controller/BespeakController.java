package com.neusoft.controller;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
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
import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.Servicetype;
import com.neusoft.service.BespeakService;
import com.neusoft.service.InsuranceService;

@Controller
public class BespeakController {
	@Autowired
	BespeakService bespeakService;
	@Autowired
	InsuranceService insuranceService;	
    /**
     * 显示全部预约,此页面中可以查询指定的预约
     * @param currentPage
     * @param model
     * @return
     */
	@RequestMapping("/selectAllbespeak")
	public String showAllbespeak(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		//创建预约对象的实例
		Bespeak bespeak = new Bespeak();
		//查询所有预约，传入状态null值
		bespeak.setBespeakState(null);
		//定义分页的页数
		int pageSize = 4;
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		model.addAttribute("bklist", bespeakService.selectBespeak(currentPage, bespeak, pageSize).getLists());
		return "bespeakAll";
	}
	/**
	 * 确认的预约列表
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showOKbespeak")
	public String showOKbespeak(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(1);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "AddOrder";
	}

	/**
	 * 未确认的预约列表
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showbespeak")
	public String showbespeak(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(0);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "AddOrder";
	}
	
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showbespeakOK")
	public String showbespeakOK(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(1);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "showBespeakOK";
	}
	
	/***
	 * 分配服务或完成服务的预约
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showbespeakComplete")
	public String showbespeakComplete(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(2);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "showbespeakComplete";
	}
	
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showbespeakBefore")
	public String showbespeakBefore(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(0);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "showbespeakBefore";
	}
	
	/**
	 * 确认预约
	 * @param bespeak
	 * @param model
	 * @return
	 */
	@RequestMapping("/confirmBespeak")
	public String confirmBespeak(Bespeak bespeak,Model model){
		bespeak.setBespeakState(1);
	    model.addAttribute("bespeak", bespeak);
		bespeakService.updateBespeak(bespeak);
		return "forward:/showbespeakBefore";
	}
	@RequestMapping("/createOrder")
	public String createOrder(Bespeak bespeak,Model model,int user_Id){
	    model.addAttribute("bespeak", bespeak);	
		return "forward:/showOrder";
	}	
	@RequestMapping("/confirmBespeakB")
	public String confirmBespeakB(Bespeak bespeak,Model model){
		bespeak.setBespeakState(1);
	    model.addAttribute("bespeak", bespeak);
		bespeakService.updateBespeak(bespeak);	
		return "forward:/showbespeakBefore";
	}
	/**
	 * 显示预约详情
	 * @param bespeakId
	 * @param model
	 * @return
	 */
	@RequestMapping("/showBespeakDetail")
	public String showBespeakDetail(int bespeakId,Model model){
		Bespeak bespeak = new Bespeak();
		Insurance insurance = new Insurance();
		bespeak = bespeakService.searchByBespeakId(bespeakId);	
		insurance = insuranceService.searchBespeakId(bespeakId);
		List<Servicetype> list = bespeakService.selectType();
		model.addAttribute("b", bespeak);
		model.addAttribute("i", insurance);	
		model.addAttribute("l", list);
		return "BespeakDetail";		
	}
	
	/**
	 * 按照条件查询预约
	 * @param model
	 * @param bespeak
	 * @return
	 */
	@RequestMapping("/selectBespeakByLike")
	public String selectBespeakByLike(Model model ,String bespeak,String begin,String end) {
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("check_begin_date",begin);
		map.put("check_end_date",end);
		map.put("str",bespeak);
		System.out.println(bespeak);
		System.out.println(begin);
		System.out.println(end);
		
			 model.addAttribute("bklist", bespeakService.selectBespeakByLike(map)); 
		return "bespeakAll";
	}
	
	/**
	 * 修改预约
	 * @param model
	 * @param bespeak
	 * @return
	 */
	@RequestMapping("/updateBespeak")
	public @ResponseBody boolean updateBespeak(Model model ,Bespeak bespeak) {
		int count = bespeakService.updateBespeak(bespeak);
		if(count !=0){
			return true;
		}
		else{		
			return false;	
		}	
	}
	
	
	@RequestMapping("/updateBespeakState")
	public @ResponseBody boolean updateBespeakState(Bespeak bespeak) {
		int count = bespeakService.updateBespeak(bespeak);
		if(count !=0){
			return true;
		}
		else{		
			return false;	
		}	
	}
	
	
	
	/**
	 * 修改预约
	 * @param model
	 * @param bespeak
	 * @return
	 */
	@RequestMapping("/deleteBespeak")
	public @ResponseBody boolean deleteBespeak(Model model ,int bespeakId) {
		int count = bespeakService.deleteBespeak(bespeakId);
		if(count !=0){
			return true;
		}
		else{		
			return false;	
		}	
	}
	@RequestMapping("/bespeakcount")
	public @ResponseBody int bespeakcount() {
		Bespeak bespeak = new Bespeak();
		bespeak.setBespeakState(0);
		return bespeakService.bespeakcount(bespeak);

	}
	@RequestMapping("/bespeakcount1")
	public @ResponseBody int bespeakcount1() {
		Bespeak bespeak = new Bespeak();
		bespeak.setBespeakState(1);
		return bespeakService.bespeakcount(bespeak);

	}
	@RequestMapping("/countstatistics")
	public @ResponseBody List<Bespeak> countstatistics() {
		return bespeakService.countstatistics();
	}
	@RequestMapping("/monthschart")
	public @ResponseBody List<Bespeak> monthschart() {
		return bespeakService.monthschart();
	}
	private InputStream excelFile;
	@RequestMapping("/ExcelExport")
	public String ExcelExport() throws Exception {
		Bespeak bespeak = new Bespeak();
		//查询所有预约，传入状态null值
		bespeak.setBespeakState(null);	
		List<Bespeak> list = new ArrayList<Bespeak>();
	    list = bespeakService.selectBespeak(1, bespeak, 1000).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("客户预约信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("预约编号");
		row.createCell(1).setCellValue("客户姓名");
		row.createCell(2).setCellValue("搬迁城市");
		row.createCell(3).setCellValue("搬出地");
		row.createCell(4).setCellValue("搬入地");
		row.createCell(5).setCellValue("联系电话");
		row.createCell(6).setCellValue("物品类型");
		row.createCell(7).setCellValue("服务类型");
		row.createCell(8).setCellValue("服务时间");
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
			bespeak = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(bespeak.getBespeakId());
			row.createCell(1).setCellValue(bespeak.getBespeakAtten());
			row.createCell(2).setCellValue(bespeak.getBespeakCity());
			row.createCell(3).setCellValue(bespeak.getBespeakOut());
			row.createCell(4).setCellValue(bespeak.getBespeakIn());
			row.createCell(5).setCellValue(bespeak.getBespeakTel());
			row.createCell(6).setCellValue(bespeak.getGoodsType());
			row.createCell(7).setCellValue(bespeak.getServicetype().getServiceTypeName());
			row.createCell(8).setCellValue(bespeak.getStrDate());
			
		}
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/客户预约信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }

		return "forward:/selectAllbespeak";
	}
}


