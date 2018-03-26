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
import com.neusoft.pojo.Cartype;
import com.neusoft.pojo.Insurance;
import com.neusoft.service.CarService;

@Controller
public class CarController {
	@Autowired
	CarService carService;
	
	/**
	 * 显示车辆列表
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showCar")
	public String showCar(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Car car = new Car();
		    car.setCarState(null);
		    String flag= null;
		    int pageSize = 1000; 
		    model.addAttribute("carlist", carService.selectCar(currentPage, car, pageSize,flag)); 
		    model.addAttribute("car", carService.selectCar(currentPage, car, pageSize,flag).getLists()); 
		return "CarInfo";	
		}
	
	@RequestMapping("/showOrderCar")
	public String shoeOrderCar(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Car car = new Car();
		    car.setCarState(1);
		    String flag= null;
		    int pageSize = 1000; 
		    model.addAttribute("carlist", carService.selectCar(currentPage, car, pageSize,flag)); 
		   
		return "CarInfo";	
		}
	
	/**
	 * 更新车辆信息
	 * @param carId
	 */
	@RequestMapping("/UpdateCar")	 
	public void UpdateCar (int[] carId ){
	for (int i : carId) {
		Car car = new Car();
		car.setCarId(i);
		car.setCarState(1);
		carService.UpdateCar(car);
	}
			
	}
	
	
	
	/**
	 * 添加车辆
	 * @param car
	 * @return
	 */
	@RequestMapping("/addCar")	 
	public @ResponseBody boolean addCar (Car car ){
		
		
		car.setCarState(0);
		carService.addCar(car);	
		
		return true;
	}
	
	/**
	 * 新增车辆类别
	 * @param cartype
	 * @return
	 */
	@RequestMapping("/addCarType")	 
	public @ResponseBody String addCarType (Cartype cartype ){
		int count = carService.addCarType(cartype);
		if(count!=0){	
			return "新增成功";
		}	
		else{
			return "新增失败";
		}
	}
	
	/**
	 * 显示车辆类别
	 * @param model
	 * @return
	 */
	@RequestMapping("/showCarType")	 
	public  String showCarType (Model model){
		model.addAttribute("cartype", carService.showCartype());
     	return "AddCar";
	}
	
	
	@RequestMapping("/CarType")	 
	public  String CarType (Model model){
		model.addAttribute("cartype", carService.showCartype());
     	return "CarType";
	}
	
	
	@RequestMapping("/selectCarById")	 
	public  String selectCarById (Model model,int carId){
		model.addAttribute("cartype", carService.showCartype());
		model.addAttribute("car", carService.showById(carId));	
     	return "UpdateCar";	
	}
	
	
	/**
	 * 删除车辆信息
	 * @param carId
	 * @return
	 */
	
	
	@RequestMapping("/delCar")	 
	public @ResponseBody boolean delCar (int carId ){
		int count = carService.delCar(carId);
		if(count!=0){	
			return true;
		}	
		else{
			return false;
		}
	}	
	
	@RequestMapping("/delCarType")	 
	public @ResponseBody boolean delCarType (int carTypeId ){
	 carService.deleteCarType(carTypeId);
			return true;
		
	}	

	@RequestMapping("/updateCar")
	public @ResponseBody String updateCar (Car car ){
		carService.UpdateCar(car);
			return "车辆修改成功";	
	}
	
	
	@RequestMapping("/updateCarState")
	public @ResponseBody String updateCarState (Car car ){
		carService.UpdateCar(car);
			return "车辆修改成功";
	}
	
	
	

	@RequestMapping("/selectCarByLike")
	public   String selectCarByLike(String  parameter,Model model) {
		model.addAttribute("car", carService.selectCarByLike(parameter));
		return "CarInfo";
		
	}
	
	private InputStream excelFile;
	@RequestMapping("/ExcelExportCar")
	public String ExcelExportOrder() throws Exception {
		Car car = new Car();
		List<Car> list = new ArrayList<Car>();
	    list =carService.selectCar(1, car, 10000,null).getLists();
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("车辆信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("车辆编号");
		row.createCell(1).setCellValue("车辆名称");
		row.createCell(2).setCellValue("车辆类型");
		row.createCell(3).setCellValue("车辆牌照");
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		for (int i = 1; i <= list.size(); i++) {
			car = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(car.getCarId());
			row.createCell(1).setCellValue(car.getCarName());
			row.createCell(2).setCellValue(car.getCartype().getCarTypeName());
			row.createCell(3).setCellValue(car.getCarClient());	
		}
		
		  FileOutputStream fout = null;
	        try{
	            //用流将其写到D盘
	            fout = new FileOutputStream("D:/车辆信息.xls");
	            workbook.write(fout);
	            fout.close();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		return "forward:/showCar";
	}
	
}
