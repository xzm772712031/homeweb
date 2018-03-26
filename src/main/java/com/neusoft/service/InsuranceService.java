package com.neusoft.service;



import java.util.List;

import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.PageBean;

public interface InsuranceService {
	
	public int addInsurance(Insurance insurance);
	public Insurance searchBespeakId(int BespeakId);
	public int  updateByBespeakId(Insurance insurance);
	public PageBean<Insurance> selectInsurance(int currentPage,Insurance insurance ,int pageSize,String flag);
	public int  updateById(Insurance insurance);
	public Insurance selectInsurance(int insuranceId);
	public int deleteInsurance(int insuranceId); 
    public List<Insurance> selectInsuranceLike(String parameter);
	
	
	
}
