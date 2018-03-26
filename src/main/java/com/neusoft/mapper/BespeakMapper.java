package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.BespeakExample;
@Service
public interface BespeakMapper {
    long countByExample(BespeakExample example);

    int deleteByExample(BespeakExample example);

    int deleteByPrimaryKey(Integer bespeakId);

    int insert(Bespeak record);

    int insertSelective(Bespeak record);

    List<Bespeak> selectByExample(BespeakExample example);

    Bespeak selectByPrimaryKey(Integer bespeakId);
    
    List<Bespeak> selectBespeak (HashMap<String,Object> map);
    
    List<Bespeak> selectBespeakByLike(HashMap<String,Object> map);
    
    List<Bespeak> monthschart();
     
    int count(Bespeak bespeak);
    
    List<Bespeak> countstatistics();
    
    int updateByExampleSelective(@Param("record") Bespeak record, @Param("example") BespeakExample example);

    int updateByExample(@Param("record") Bespeak record, @Param("example") BespeakExample example);

    int updateByPrimaryKeySelective(Bespeak record);

    int updateByPrimaryKey(Bespeak record);
}