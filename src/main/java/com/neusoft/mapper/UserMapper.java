package com.neusoft.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.neusoft.pojo.User;
import com.neusoft.pojo.UserExample;
@Service
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);
    
    List<User>  selectUserByLike(String parameter);

    List<User> selectByExample(UserExample example);
    
    List<User> selectUser(HashMap<String,Object> map);

    User selectByPrimaryKey(Integer userId);
    
    List<User> selectAll();
    
    int count();

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}