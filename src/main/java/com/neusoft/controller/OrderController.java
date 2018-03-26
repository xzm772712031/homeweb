package com.neusoft.controller;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.Car;
import com.neusoft.pojo.Epolyee;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.Order;
import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.Orderepolyee;
import com.neusoft.pojo.User;
import com.neusoft.service.BespeakService;
import com.neusoft.service.CarService;
import com.neusoft.service.EpolyeeService;
import com.neusoft.service.InsuranceService;
import com.neusoft.service.OrderDetailService;
import com.neusoft.service.OrderService;
import com.neusoft.service.UserService;
@Controller
public class OrderController {
	@Autowired
	CarService carService;
	@Autowired
	EpolyeeService epolyeeService;
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetailService orderDetailService;
	@Autowired
	InsuranceService insuranceService;
	@Autowired
	BespeakService bespeakService;
	@Autowired
	UserService userService;
	
	/**
	 * 创建订单
	 * @param carId
	 * @param epolyeeId
	 * @param order
	 * @return
	 */
	@RequestMapping("/addOrder")
	public  @ResponseBody boolean addOrder(int[] carId,int[] epolyeeId,Order order){
		System.out.println(carId);
		//获取订单预约编号
		int bespeakId = order.getBespeak_Id();
		//根据预约编号查看保险的信息
		Insurance insurance = insuranceService.searchBespeakId(bespeakId);
		//创建预约对象实例
		Bespeak bespeak = new Bespeak();
		//系统的当前时间
		Date date = new Date();
		//将时间放入对象中
		order.setOrderDate(date);
		//设置订单的初始状态
		order.setOrderState(0);
		//返回订单的编号（新增时返回的最后插入的主键）
		int count = orderService.addOrder(order);
		bespeak.setBespeakId(order.getBespeak_Id());
		bespeak.setBespeakState(2);
		bespeakService.updateBespeak(bespeak);
		//车辆的分配
		if(count!=0){
			if(carId!=null){
				for (int i : carId) {
					Ordercar ordercar = new Ordercar();
					Car car = new Car();
					car.setCarId(i);
					car.setCarState(1);
					carService.UpdateCar(car);
					ordercar.setCar_Id(i);
					ordercar.setOrder_Id(order.getOrderId());
					orderDetailService.AddCar(ordercar);				
				}
			}
			//人员的分配
			if(epolyeeId!=null)
			{
				for (int i : epolyeeId) {
					Orderepolyee orderepolyee = new Orderepolyee();
					Epolyee epolyee = new Epolyee();
					epolyee.setEpolyeeId(i);
					epolyee.setEpolyeeState(1);
					epolyeeService.UpdateEpolyee(epolyee);
					orderepolyee.setEpolyee_Id(i);
					orderepolyee.setOrder_ID(order.getOrderId());
					orderDetailService.AddEpolyee(orderepolyee);
				}
				
			}
			//保险的状态的更改
			if(insurance!=null){	
				insurance.setOrderId(order.getOrderId());
				insurance.setInsuranceState(1);
				insurance.setBespeak_Id(bespeakId);
				insuranceService.updateByBespeakId(insurance);
			}
		}
			
		return true;
	}
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showOrder")
	public String showOrder(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Epolyee epolyee = new Epolyee();
		    epolyee.setEpolyeeState(0);
		    String flag= null;
		    int pageSize = 1000; 
		    model.addAttribute("EpolyeeMsg", epolyeeService.selectEpolyee(currentPage, epolyee, pageSize,flag));    
		    Car car = new Car();
		    car.setCarState(0);
		    model.addAttribute("CarMsg", carService.selectCar(currentPage, car, pageSize,flag));  
		return "OrderInfo";
	}
	
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showOrderList")
	public String showOrderList(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Order  order = new Order();
		    order.setOrderState(null);
		    String flag= "ok";
		    int pageSize = 5; 
		    model.addAttribute("OrderMsg", orderService.selectOrder(currentPage, order, pageSize,flag));  
		    model.addAttribute("olist", orderService.selectOrder(currentPage, order, pageSize,flag).getLists()); 
		return "OrderList";
	}
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showOrderListOK")
	public String showOrderListOK(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Order order = new Order();
		    order.setOrderState(1);
		    String flag= "ok";
		    int pageSize = 5; 
		    model.addAttribute("OrderMsg", orderService.selectOrder(currentPage, order, pageSize,flag));  
		    
		return "OrderOK";
	}
	
	/**
	 * 
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping("/showOrderListIng")
	public String showOrderListIng(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Order  order = new Order();
		    order.setOrderState(2);
		    String flag= "ok";
		    int pageSize = 5; 
		    model.addAttribute("OrderMsg", orderService.selectOrder(currentPage, order, pageSize,flag));   
		return "OrderIng";
	}
	
	
	@RequestMapping("/showOrdercreated")
	public String showOrdercreated(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model){
		    Order  order = new Order();
		    order.setOrderState(0);
		    String flag= "ok";
		    int pageSize = 5; 
		    model.addAttribute("OrderMsg", orderService.selectOrder(currentPage, order, pageSize,flag));   
		return "Ordercreated";
	}
	
	/**
	 * 
	 * @param model
	 * @param orderID
	 * @param userId
	 * @param bespeakId
	 * @return
	 */
	
	
	/**
	 * 
	 * @param model
	 * @param orderID
	 * @return
	 */
	@RequestMapping("/completeOrder")
	
	public String completeOrder(Model model,int orderID){
		List<Ordercar> ordercarlist = orderService.showOrdercars(orderID);
		if(ordercarlist!=null){
		for (Ordercar ordercar : ordercarlist) {
			Car car = new Car();
			car.setCarId(ordercar.getCar_Id());
			car.setCarState(0);
			carService.UpdateCar(car);
			
		}}

		List<Orderepolyee> orderepolyeeList = orderService.showOrderepolyees(orderID);
		if(orderepolyeeList!=null){
		for (Orderepolyee orderepolyee : orderepolyeeList) {
			Epolyee epolyee = new Epolyee();
			epolyee.setEpolyeeId(orderepolyee.getEpolyee_Id());
			System.out.println(orderepolyee.getEpolyee_Id());
			epolyee.setEpolyeeState(0);
			epolyeeService.UpdateEpolyee(epolyee);
		}	
		
		}	
		
		Order order = new Order();
		order.setOrderId(orderID);	
		order.setOrderState(1);
		orderService.updateOrder(order);
		return "forward:/showOrderListIng";
	}
	
	@RequestMapping("/delOrder")
	public @ResponseBody boolean delOrder(int orderId){
		Order order = new Order();
		order= orderService.showOrder(orderId);
		if(0==order.getOrderState()){
		List<Ordercar> ordercarlist = orderService.showOrdercars(orderId);
		if(ordercarlist!=null){
		for (Ordercar ordercar : ordercarlist) {
			Car car = new Car();
			car.setCarId(ordercar.getCar_Id());
			car.setCarState(0);
			carService.UpdateCar(car);
			
		}}

		List<Orderepolyee> orderepolyeeList = orderService.showOrderepolyees(orderId);
		if(orderepolyeeList!=null){
		for (Orderepolyee orderepolyee : orderepolyeeList) {
			Epolyee epolyee = new Epolyee();
			epolyee.setEpolyeeId(orderepolyee.getEpolyee_Id());
			System.out.println(orderepolyee.getEpolyee_Id());
			epolyee.setEpolyeeState(0);
			epolyeeService.UpdateEpolyee(epolyee);
		}	
		
		}
		Bespeak bespeak = new Bespeak();
		bespeak.setBespeakId(order.getBespeak_Id());
		bespeak.setBespeakState(1);
		bespeakService.updateBespeak(bespeak);
		orderService.delOrder(orderId);
		return true;
		}else{
			orderService.delOrder(orderId);	
			return true;	
		}
		
	}
	
	@RequestMapping("/showOrderBefore")
	public String showOrderBefore(
			@RequestParam(value = "currentPage", defaultValue = "1", required = false) int currentPage, Model model) {
		Bespeak bespeak = new Bespeak();
		int pageSize = 4;
		bespeak.setBespeakState(1);
		model.addAttribute("BespeakAllMsg", bespeakService.selectBespeak(currentPage, bespeak, pageSize));
		return "OrderBefore";
	}
	
	
	
	@RequestMapping("/startorder")
	public @ResponseBody boolean startorder(Order order) {
		orderService.updateOrder(order);
		return true;
	}
	
	
	@RequestMapping("/cancleorder")
	public @ResponseBody boolean cancleorder(Order order) {
		int orderId = order.getOrderId();
		order= orderService.showOrder(orderId);
		order.setOrderState(3);
		if(null!=order.getOrderState()){
		List<Ordercar> ordercarlist = orderService.showOrdercars(orderId);
		if(ordercarlist!=null){
		for (Ordercar ordercar : ordercarlist) {
			Car car = new Car();
			car.setCarId(ordercar.getCar_Id());
			car.setCarState(0);
			carService.UpdateCar(car);
			
		}}
		
		List<Orderepolyee> orderepolyeeList = orderService.showOrderepolyees(orderId);
		if(orderepolyeeList!=null){
		for (Orderepolyee orderepolyee : orderepolyeeList) {
			Epolyee epolyee = new Epolyee();
			epolyee.setEpolyeeId(orderepolyee.getEpolyee_Id());
			System.out.println(orderepolyee.getEpolyee_Id());
			epolyee.setEpolyeeState(0);
			epolyeeService.UpdateEpolyee(epolyee);
		}		
		}
		orderService.updateOrder(order);
		return true;
		}else{
			orderService.updateOrder(order);
			return true;	
		}
	}
	
	
	@RequestMapping("/showOrderDetail")
	public String showOrderDetail(Model model,int orderID,int userId,int bespeakId){
		//通过用户的Id获取相应的用户信息
		User user= userService.SearchUserById(userId);
	    //通过预约编号获取相应的预约信息
		Bespeak bespeak = bespeakService.searchByBespeakId(bespeakId);
		//通过相应的订单Id获取安排车辆
		List<Ordercar> ordercarlist = orderService.showOrdercars(orderID);
		//通过相应的订单Id获取安排工作人员
		List<Orderepolyee> orderepolyeeList = orderService.showOrderepolyees(orderID);
		////通过相应的预约Id获取相应的保险信息
		Insurance insurance = insuranceService.searchBespeakId(bespeakId);
		model.addAttribute("userme", user);
		model.addAttribute("bespeak", bespeak);
		model.addAttribute("carlist", ordercarlist);
		model.addAttribute("epolyeelist", orderepolyeeList);
        model.addAttribute("order",orderService.showOrder(orderID));
        model.addAttribute("insurance", insurance);
		return "OrderDetail";	
	}
	
		@RequestMapping("/selectOrderByLike")
		public String selectOrderByLike(Model model ,String order,String begin,String end) {
			HashMap<String,Object> map = new HashMap<String, Object>();
			map.put("check_begin_date",begin);
			map.put("check_end_date",end);
			map.put("str",order);
		    model.addAttribute("olist",orderService.selectOrderByLike(map) ); 
			return "OrderList";
		}
		
		
		private InputStream excelFile;
		@RequestMapping("/ExcelExportOrder")
		public String ExcelExportOrder() throws Exception {
			Order order = new Order();
			//查询所有预约，传入状态null值
			order.setOrderState(null);	
			  String flag= null;
			List<Order> list = new ArrayList<Order>();
		    list = orderService.selectOrder(1, order, 1000,flag).getLists();
			Workbook workbook = new HSSFWorkbook();
			Sheet sheet = workbook.createSheet("客户订单信息");
			Row row = sheet.createRow(0);
			row.createCell(0).setCellValue("订单编号");
			row.createCell(1).setCellValue("客户编号");
			row.createCell(2).setCellValue("预约编号");
			row.createCell(3).setCellValue("创建时间");
			row.createCell(4).setCellValue("订单金额(元)");
			
			CellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			for (int i = 1; i <= list.size(); i++) {
			order = list.get(i - 1);
				row = sheet.createRow(i);
				row.createCell(0).setCellValue(order.getOrderId());
				row.createCell(1).setCellValue(order.getUser_Id());
				row.createCell(2).setCellValue(order.getBespeak_Id());
				row.createCell(3).setCellValue(order.getStrDate());
				row.createCell(4).setCellValue(order.getOrderPrice());		
			}
			  FileOutputStream fout = null;
		        try{
		            //用流将其写到D盘
		            fout = new FileOutputStream("D:/客户订单信息.xls");
		            workbook.write(fout);
		            fout.close();
		        }catch (Exception e){
		            e.printStackTrace();
		        }

			return "forward:/showOrder";
		}
	
		
}
