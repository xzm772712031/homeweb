package com.neusoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.pojo.Feedbacktype;
import com.neusoft.pojo.FeedbacktypeExample;

public interface FeedbacktypeMapper {
    long countByExample(FeedbacktypeExample example);

    int deleteByExample(FeedbacktypeExample example);

    int deleteByPrimaryKey(Integer feedbackTypeId);

    int insert(Feedbacktype record);

    int insertSelective(Feedbacktype record);

    List<Feedbacktype> selectByExample(FeedbacktypeExample example);

    Feedbacktype selectByPrimaryKey(Integer feedbackTypeId);

    int updateByExampleSelective(@Param("record") Feedbacktype record, @Param("example") FeedbacktypeExample example);

    int updateByExample(@Param("record") Feedbacktype record, @Param("example") FeedbacktypeExample example);

    int updateByPrimaryKeySelective(Feedbacktype record);

    int updateByPrimaryKey(Feedbacktype record);
}