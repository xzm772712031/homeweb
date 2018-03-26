package com.neusoft.service;


import java.util.List;

import com.neusoft.pojo.Epolyee;
import com.neusoft.pojo.Job;
import com.neusoft.pojo.PageBean;

public interface EpolyeeService {
	public PageBean<Epolyee> selectEpolyee(int currentPage,Epolyee epolyee,int pageSize,String flag);
	public int UpdateEpolyee(Epolyee epolyee);
	public int addEpolyee(Epolyee epolyee);
	public List<Job> selectJob();
	public Epolyee selectById(int epolyeeId);
	public int deleteEpolyee(int epolyeeId);
	public List<Epolyee> selectEpolyeeByLike(String parameter);
	

}


