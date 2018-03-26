package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Servicetype;
import com.neusoft.pojo.ServicetypeExample;
@Service
public interface ServicetypeMapper {
    long countByExample(ServicetypeExample example);

    int deleteByExample(ServicetypeExample example);

    int deleteByPrimaryKey(Integer serviceTypeId);

    int insert(Servicetype record);

    int insertSelective(Servicetype record);

    List<Servicetype> selectByExample(ServicetypeExample example);
    
    List<Servicetype>  selectType();

    Servicetype selectByPrimaryKey(Integer serviceTypeId);

    int updateByExampleSelective(@Param("record") Servicetype record, @Param("example") ServicetypeExample example);

    int updateByExample(@Param("record") Servicetype record, @Param("example") ServicetypeExample example);

    int updateByPrimaryKeySelective(Servicetype record);

    int updateByPrimaryKey(Servicetype record);
}