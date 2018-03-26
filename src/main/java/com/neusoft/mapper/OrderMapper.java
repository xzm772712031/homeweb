package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.pojo.Order;
import com.neusoft.pojo.OrderExample;
import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.Orderepolyee;

public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);
    
    int count(Order order);

    List<Order> selectByExample(OrderExample example);
    
    List<Order> selectOrder(HashMap<String,Object> map);
    
    List<Order> selectOrderByLike(HashMap<String,Object> map);

    Order selectByPrimaryKey(Integer orderId);
    
    List<Order> selectOrderByUserId(int userId);
    
    List<Ordercar> selectOrderCar(int orderId);
    
    List<Orderepolyee> selectOrderEpolyee(int orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}