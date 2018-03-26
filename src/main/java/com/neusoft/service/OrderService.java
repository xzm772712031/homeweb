package com.neusoft.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.neusoft.pojo.Order;
import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.Orderepolyee;
import com.neusoft.pojo.PageBean;


public interface OrderService {
	public int addOrder(Order order) ;
	public int updateOrder(Order order);
	public PageBean<Order> selectOrder(int currentPage, Order Order, int pageSize, String flag);
	public Order showOrder(int orderId);
	public List<Ordercar> showOrdercars(int order_Id);
	public List<Orderepolyee> showOrderepolyees(int order_Id);
	public int delOrder(int order_Id);
	public List<Order> selectOrderByLike(HashMap<String,Object> map);
	
}