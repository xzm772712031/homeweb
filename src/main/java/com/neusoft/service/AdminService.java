package com.neusoft.service;

import java.util.List;

import com.neusoft.pojo.Admin;

public interface AdminService {
     public Admin login(Admin admin);
     public int addAdmin(Admin admin);
     public int updateAdmin(Admin admin);
     public int delAdmin(int adminId);
     public List<Admin> selectAllAdmin();
}
