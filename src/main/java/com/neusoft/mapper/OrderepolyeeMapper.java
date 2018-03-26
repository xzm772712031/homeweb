package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Orderepolyee;
import com.neusoft.pojo.OrderepolyeeExample;
@Service
public interface OrderepolyeeMapper {
    long countByExample(OrderepolyeeExample example);

    int deleteByExample(OrderepolyeeExample example);

    int deleteByPrimaryKey(Integer orderdEpolyeeId);

    int insert(Orderepolyee record);

    int insertSelective(Orderepolyee record);

    List<Orderepolyee> selectByExample(OrderepolyeeExample example);

    Orderepolyee selectByPrimaryKey(Integer orderdEpolyeeId);

    int updateByExampleSelective(@Param("record") Orderepolyee record, @Param("example") OrderepolyeeExample example);

    int updateByExample(@Param("record") Orderepolyee record, @Param("example") OrderepolyeeExample example);

    int updateByPrimaryKeySelective(Orderepolyee record);

    int updateByPrimaryKey(Orderepolyee record);
}