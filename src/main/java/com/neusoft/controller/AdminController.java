package com.neusoft.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.pojo.Admin;
import com.neusoft.service.AdminService;


@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@RequestMapping("/login")
	public @ResponseBody Admin login(Admin admin,HttpSession session){
		admin=adminService.login(admin);
		session.setAttribute("admin", admin);
		return admin;	
	}
	
	@RequestMapping("/loginout")
	public String loginout (HttpSession session){
		session.removeAttribute("admin");
		return "index";	
	}
	
	/**
	 * 
	 * @param admin
	 * @param session
	 * @return
	 */
	@RequestMapping("/addAdmin")
	public @ResponseBody boolean addAdmin(Admin admin){
		adminService.addAdmin(admin);
		return true;	
	}
	
    /**
     * 
     * @param admin
     * @param session
     * @return
     */
	@RequestMapping("/updateAdmin")
	public @ResponseBody boolean updateAdmin(Admin admin){
		adminService.updateAdmin(admin);
		return true;	
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/AllAdmin")
	public String   deleteAdmin(Model model){
		model.addAttribute("alist", adminService.selectAllAdmin());
		return "AllAdminList";	
	}
			
}
