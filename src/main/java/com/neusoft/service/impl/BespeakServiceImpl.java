package com.neusoft.service.impl;

import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.BespeakMapper;
import com.neusoft.mapper.ServicetypeMapper;
import com.neusoft.pojo.Bespeak;
import com.neusoft.pojo.PageBean;
import com.neusoft.pojo.Servicetype;
import com.neusoft.service.BespeakService;
@Transactional
@Service
public class BespeakServiceImpl implements BespeakService {
    @Autowired
    BespeakMapper bespeakMapper;
    @Autowired
    ServicetypeMapper servicetypeMapper;

	@Override
	public PageBean<Bespeak> selectBespeak(int currentPage,Bespeak bespeak,int pageSize) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Bespeak> pageBean = new PageBean<Bespeak>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = bespeakMapper.count(bespeak);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        map.put("bespeakState", bespeak.getBespeakState());
        //封装每页显示的数据
        List<Bespeak> lists = bespeakMapper.selectBespeak(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 for (int i=0;i<lists.size();i++) { 
			 lists.get(i).setStrDate(f.format(lists.get(i).getBespeakDate()));	 
			 lists.get(i).setStrDate2(f.format(lists.get(i).getDate()));
		}
        pageBean.setLists(lists);  
        return pageBean;
	}

	@Override
	public int updateBespeak(Bespeak bespeak) {
		
		return bespeakMapper.updateByPrimaryKeySelective(bespeak);
	}

	@Override
	public Bespeak searchByBespeakId(int bespeakId) {
		
		 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd ");  
		 Bespeak bespeak = bespeakMapper.selectByPrimaryKey(bespeakId);
		 bespeak.setStrDate(f2.format(bespeak.getBespeakDate()));
		 bespeak.setStrDate2(f.format(bespeak.getDate()));
		 return bespeak;
	}

	@Override
	public List<Bespeak> selectBespeakByLike(HashMap<String,Object> map) {
		
		 List<Bespeak> lists = bespeakMapper.selectBespeakByLike(map);
		 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 for (int i=0;i<lists.size();i++) { 
			 lists.get(i).setStrDate(f.format(lists.get(i).getBespeakDate()));	 
		}
		return lists;
	}

	@Override
	public List<Servicetype> selectType() {
		
		return servicetypeMapper.selectType();
	}

	@Override
	public int deleteBespeak(int bespeakId) {
		
		return bespeakMapper.deleteByPrimaryKey(bespeakId);
	}

	@Override
	public int bespeakcount(Bespeak bespeak) {
		
		return bespeakMapper.count(bespeak);
	}

	@Override
	public List<Bespeak> countstatistics() {
	
		return bespeakMapper.countstatistics();
	}

	@Override
	public List<Bespeak> monthschart() {
		
		return bespeakMapper.monthschart();
	}
	
}
