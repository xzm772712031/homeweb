package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Cartype;
import com.neusoft.pojo.CartypeExample;
@Service
public interface CartypeMapper {
    long countByExample(CartypeExample example);

    int deleteByExample(CartypeExample example);

    int deleteByPrimaryKey(Integer carTypeId);

    int insert(Cartype record);

    int insertSelective(Cartype record);

    List<Cartype> selectByExample(CartypeExample example);
    
    
    List<Cartype> showALl();
    

    Cartype selectByPrimaryKey(Integer carTypeId);

    int updateByExampleSelective(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByExample(@Param("record") Cartype record, @Param("example") CartypeExample example);

    int updateByPrimaryKeySelective(Cartype record);

    int updateByPrimaryKey(Cartype record);
}