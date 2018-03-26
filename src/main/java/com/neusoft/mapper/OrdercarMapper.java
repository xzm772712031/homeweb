package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.OrdercarExample;
@Service
public interface OrdercarMapper {
    long countByExample(OrdercarExample example);

    int deleteByExample(OrdercarExample example);

    int deleteByPrimaryKey(Integer orderCarId);

    int insert(Ordercar record);

    int insertSelective(Ordercar record);

    List<Ordercar> selectByExample(OrdercarExample example);
    
    List<Ordercar> selectOrder (HashMap<String,Object> map);

    Ordercar selectByPrimaryKey(Integer orderCarId);
    
    List<Ordercar> selectByOrderId(int Order_Id);
   

    int updateByExampleSelective(@Param("record") Ordercar record, @Param("example") OrdercarExample example);

    int updateByExample(@Param("record") Ordercar record, @Param("example") OrdercarExample example);

    int updateByPrimaryKeySelective(Ordercar record);

    int updateByPrimaryKey(Ordercar record);
}