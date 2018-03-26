package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Epolyee;
import com.neusoft.pojo.EpolyeeExample;
@Service
public interface EpolyeeMapper {
    long countByExample(EpolyeeExample example);

    int deleteByExample(EpolyeeExample example);

    int deleteByPrimaryKey(Integer epolyeeId);

    int insert(Epolyee record);

    int insertSelective(Epolyee record);

    List<Epolyee> selectByExample(EpolyeeExample example);

    Epolyee selectByPrimaryKey(Integer epolyeeId);
    
    List<Epolyee> selectEpolyee(HashMap<String,Object> map);
   
    int  count(Epolyee epolyee);
    
    List<Epolyee> selectEpolyeeByLike(String parameter);
    
    int updateByExampleSelective(@Param("record") Epolyee record, @Param("example") EpolyeeExample example);

    int updateByExample(@Param("record") Epolyee record, @Param("example") EpolyeeExample example);

    int updateByPrimaryKeySelective(Epolyee record);

    int updateByPrimaryKey(Epolyee record);
}