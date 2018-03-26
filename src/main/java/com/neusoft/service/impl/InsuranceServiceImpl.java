package com.neusoft.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.InsuranceMapper;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.InsuranceService;
@Transactional
@Service
public class InsuranceServiceImpl implements InsuranceService {
    @Autowired
     InsuranceMapper insuranceMapper;
	@Override
	public int addInsurance(Insurance insurance) {
		return insuranceMapper.insertSelective(insurance);
		
	}
	@Override
	public Insurance searchBespeakId(int BespeakId) {	
		 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		
		 Insurance insurance = insuranceMapper.selectByBespeakId(BespeakId);
		 if(insurance!=null){
		 insurance.setStrDate(f.format(insurance.getInsuranceDate()));	
		 
		 } 
		 return insurance;		
	}
	
	
	@Override
	public int updateByBespeakId(Insurance insurance) {
		
		return insuranceMapper.updateByBespeakIdSelective(insurance);
	}
	
	
	
	@Override
	public PageBean<Insurance> selectInsurance(int currentPage, Insurance insurance, int pageSize, String flag) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Insurance> pageBean = new PageBean<Insurance>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = insuranceMapper.count(insurance);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        map.put("insuranceState", insurance.getInsuranceState());
        //封装每页显示的数据
        List<Insurance> lists = insuranceMapper.selectInsurance(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 for (int i=0;i<lists.size();i++) { 
			 lists.get(i).setStrDate(f.format(lists.get(i).getInsuranceDate()));	 
			
		}
        pageBean.setLists(lists);  
        return pageBean;
	}
	
	
	@Override
	public int updateById(Insurance insurance) {
		System.out.println(insurance.getInsuranceCost());
		return insuranceMapper.updateByPrimaryKeySelective(insurance);
	}
	
	
	@Override
	public Insurance selectInsurance(int insuranceId) {
		
		
		Insurance insurance = new Insurance();
		
	    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
	   
	   
		insurance = insuranceMapper.selectByPrimaryKey(insuranceId);
		
		insurance.setStrDate(f.format(insurance.getInsuranceDate()));
		return insurance;
	}
	@Override
	public int deleteInsurance(int insuranceId) {
		
		return insuranceMapper.deleteByPrimaryKey(insuranceId);
	}
	
	
	@Override
	public List<Insurance> selectInsuranceLike(String parameter) {
		  List<Insurance> lists = insuranceMapper.selectInsuranceByLike(parameter);
	        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
			 for (int i=0;i<lists.size();i++) { 
				 lists.get(i).setStrDate(f.format(lists.get(i).getInsuranceDate()));	 		
		
	}	
			 return lists;
	}		
	

}


