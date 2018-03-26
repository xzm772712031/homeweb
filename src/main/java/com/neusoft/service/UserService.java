package com.neusoft.service;

import java.util.List;


import com.neusoft.pojo.PageBean;
import com.neusoft.pojo.User;

public interface UserService {
	public List<User>  searchAllUser();
	public int updateUser(User user);
	public User selectById(Integer user_Id);
	public User SearchUserById(int userId);
	public List<User>  selectUserByLike(String parameter);
	public PageBean<User> selectUSer(int currentPage,User user,int pageSize);
	public int deleteUser(int userId);
	

}
