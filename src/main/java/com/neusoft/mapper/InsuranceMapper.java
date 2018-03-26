package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.InsuranceExample;

public interface InsuranceMapper {
    long countByExample(InsuranceExample example);

    int deleteByExample(InsuranceExample example);

    int deleteByPrimaryKey(Integer insuranceId);

    int insert(Insurance record);

    int insertSelective(Insurance record);

    List<Insurance> selectByExample(InsuranceExample example);

    Insurance selectByPrimaryKey(Integer insuranceId);
    
    int count(Insurance insurance);
    
    List<Insurance> selectInsuranceByLike(String parameter);
    
    Insurance  selectByBespeakId(int bespeakId);
    
    List<Insurance> selectInsurance(HashMap<String,Object> map);
    

    int updateByExampleSelective(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByExample(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByPrimaryKeySelective(Insurance record);
    
    int updateByBespeakIdSelective(Insurance record);

    int updateByPrimaryKey(Insurance record);
}