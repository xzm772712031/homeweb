package com.neusoft.service;


import java.util.HashMap;
import java.util.List;

import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.PageBean;
import com.neusoft.pojo.Servicetype;

public interface BespeakService {
	
	public PageBean<Bespeak> selectBespeak(int currentPage,Bespeak bespeak,int pageSize);
	public int updateBespeak(Bespeak bespeak);
	public Bespeak searchByBespeakId(int bespeakId);
	public List<Bespeak> selectBespeakByLike(HashMap<String,Object> map);
	public List<Servicetype> selectType();
	public int deleteBespeak(int bespeakId);
	public int bespeakcount(Bespeak bespeak);
	public List<Bespeak> countstatistics();
	public List<Bespeak> monthschart();

}
