package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.AdminMapper;
import com.neusoft.pojo.Admin;
import com.neusoft.service.AdminService;
@Transactional
@Service
public class AdminServiceImpl implements AdminService {
@Autowired
AdminMapper adminMapper;
	@Override
	public Admin login(Admin admin) {
		
		return adminMapper.login(admin);
	}
	@Override
	public int addAdmin(Admin admin) {
		
		return adminMapper.insertSelective(admin);
	}
	@Override
	public int updateAdmin(Admin admin) {
		
		return  adminMapper.updateByPrimaryKeySelective(admin);
	}
	@Override
	public int delAdmin(int adminId) {
		
		return adminMapper.deleteByPrimaryKey(adminId);
	}
	@Override
	public List<Admin> selectAllAdmin() {
	
		return adminMapper.selectAllAdmin();
	}
	
	
	
}
