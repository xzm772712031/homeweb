package com.neusoft.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.EpolyeeMapper;
import com.neusoft.mapper.JobMapper;
import com.neusoft.pojo.Epolyee;
import com.neusoft.pojo.Job;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.EpolyeeService;
@Transactional
@Service
public  class EpolyeeServiceImpl implements EpolyeeService {
   @Autowired
   EpolyeeMapper epolyeeMapper;
   @Autowired
   JobMapper jobMapper; 
	@Override
	public PageBean<Epolyee> selectEpolyee(int currentPage, Epolyee epolyee, int pageSize, String flag) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Epolyee> pageBean = new PageBean<Epolyee>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = epolyeeMapper.count(epolyee);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());        
        map.put("epolyeeState", epolyee.getEpolyeeState());
        map.put("flag", flag);
        //封装每页显示的数据
        List<Epolyee> lists = epolyeeMapper.selectEpolyee(map);
        pageBean.setLists(lists);
        return pageBean;
	}
	@Override
	public int UpdateEpolyee(Epolyee epolyee) {
		return epolyeeMapper.updateByPrimaryKeySelective(epolyee);
	}
	
	
	@Override
	public int addEpolyee(Epolyee epolyee) {
		return epolyeeMapper.insertSelective(epolyee);
	}
	@Override
	public List<Job> selectJob() {
		return jobMapper.selectjob();
	}
	
	
	@Override
	public Epolyee selectById(int epolyeeId) {
	
		return epolyeeMapper.selectByPrimaryKey(epolyeeId);
	}
	
	
	@Override
	public int deleteEpolyee(int epolyeeId) {		
		return epolyeeMapper.deleteByPrimaryKey(epolyeeId);
	}
	@Override
	public List<Epolyee> selectEpolyeeByLike(String parameter) {
		
		return epolyeeMapper.selectEpolyeeByLike(parameter);
	}

}
