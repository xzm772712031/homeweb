package com.neusoft.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.neusoft.mapper.UserMapper;
import com.neusoft.pojo.PageBean;
import com.neusoft.pojo.User;
import com.neusoft.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	
	@Override
	public List<User> searchAllUser() {
		
		List<User> userslist = userMapper.selectAll();
		 SimpleDateFormat f = new SimpleDateFormat("yyyy年MM日dd日"); 
		 
		 for (int i=0;i<userslist.size();i++) { 
			 if(null!=userslist.get(i).getUserBirthday()){
			 userslist.get(i).setStrDate(f.format(userslist.get(i).getUserBirthday()));	 
			 }
		}
		return userslist;
		
	}
	
		
	@Override
	public int updateUser(User user) {
		
		return userMapper.updateByPrimaryKeySelective(user);
	}
	@Override
	public User selectById(Integer user_Id) {
		User user = userMapper.selectByPrimaryKey(user_Id);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM日dd日"); 
		if(null!=user.getUserBirthday()){
		user.setStrDate(f.format(user.getUserBirthday()));}
		return user;
	}

	@Override
    public User SearchUserById(int userId) {	
		return userMapper.selectByPrimaryKey(userId);
	}
	@Override
	public List<User>  selectUserByLike(String parameter){	
	    List<User> lists = userMapper.selectUserByLike(parameter);
	    SimpleDateFormat f = new SimpleDateFormat("yyyy年MM日dd日"); 
        for (int i=0;i<lists.size();i++) { 
			 if(null!=lists.get(i).getUserBirthday()){
				 lists.get(i).setStrDate(f.format(lists.get(i).getUserBirthday()));	 
			 }}
		
		return lists;
		
	}

	@Override
	public PageBean<User> selectUSer(int currentPage, User user, int pageSize) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<User> pageBean = new PageBean<User>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = userMapper.count();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<User> lists = userMapper.selectUser(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy年MM日dd日"); 
        for (int i=0;i<lists.size();i++) { 
			 if(null!=lists.get(i).getUserBirthday()){
				 lists.get(i).setStrDate(f.format(lists.get(i).getUserBirthday()));	 
			 }}
        pageBean.setLists(lists);  
        
        return pageBean;
	}


	@Override
	public int deleteUser(int userId) {
		
		return userMapper.deleteByPrimaryKey(userId);
	}
	

}
