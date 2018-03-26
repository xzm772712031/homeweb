package com.neusoft.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.OrderMapper;
import com.neusoft.pojo.Order;
import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.Orderepolyee;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.OrderService;
@Transactional
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
OrderMapper orderMapper;

	@Override
	public int addOrder(Order order) {
	       return orderMapper.insert(order);
	}

	@Override
	public int updateOrder(Order order) {
		
		return orderMapper.updateByPrimaryKeySelective(order);
	}

	@Override
	public PageBean<Order> selectOrder(int currentPage, Order Order, int pageSize, String flag) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Order> pageBean = new PageBean<Order>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = orderMapper.count(Order);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());        
        map.put("orderState",Order.getOrderState());
        map.put("flag", flag);
        //封装每页显示的数据
        
        List<Order> lists = orderMapper.selectOrder(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 for (int i=0;i<lists.size();i++) { 
			 lists.get(i).setStrDate(f.format(lists.get(i).getOrderDate()));	 

		}
        pageBean.setLists(lists);
        return pageBean;
	}

	@Override
	public Order showOrder(int orderId) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Order order = orderMapper.selectByPrimaryKey(orderId);
		order.setStrDate(f.format(order.getOrderDate()));
		return order;
	}

	@Override
	public List<Ordercar> showOrdercars(int order_Id) {

		return orderMapper.selectOrderCar(order_Id);
	}

	@Override
	public List<Orderepolyee> showOrderepolyees(int order_Id) {

		return orderMapper.selectOrderEpolyee(order_Id);
	}

	@Override
	public int delOrder(int order_Id) {
		
		return orderMapper.deleteByPrimaryKey(order_Id);
	}

	@Override
	public List<Order> selectOrderByLike(HashMap<String, Object> map) {
		
		 List<Order> lists = orderMapper.selectOrderByLike(map);
		  SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
			 for (int i=0;i<lists.size();i++) { 
				 lists.get(i).setStrDate(f.format(lists.get(i).getOrderDate()));	 

			}
		return lists;
	}

}
