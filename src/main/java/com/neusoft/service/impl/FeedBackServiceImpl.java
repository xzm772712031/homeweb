package com.neusoft.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.FeedbackMapper;
import com.neusoft.pojo.Feedback;
import com.neusoft.pojo.Insurance;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.FeedBackService;
@Transactional
@Service
public class FeedBackServiceImpl implements FeedBackService {
@Autowired
FeedbackMapper feedbackMapper;
	@Override
	public PageBean<Feedback> selectInsurance(int currentPage, Feedback feedback, int pageSize, String flag) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Feedback> pageBean = new PageBean<Feedback>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = feedbackMapper.count(feedback);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        map.put("feedbackState", feedback.getFeedbackState());
        //封装每页显示的数据
        List<Feedback> lists = feedbackMapper.selectFeedback(map);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		 for (int i=0;i<lists.size();i++) { 
			 lists.get(i).setStrDate(f.format(lists.get(i).getFeedbackDate()));	 
			
		}
        pageBean.setLists(lists);  
        return pageBean;
	}
	@Override
	public int updateFeedBack(Feedback feedback) {
		
		return feedbackMapper.updateByPrimaryKeySelective(feedback);
	}
	@Override
	public Feedback showByInsuanceById(int feedbackId) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
		Feedback feedback = feedbackMapper.selectByPrimaryKey(feedbackId);
		feedback.setStrDate(f.format(feedback.getFeedbackDate()));
		return feedbackMapper.selectByPrimaryKey(feedbackId);
	}
	
	
	@Override
	public int delFeedback(int feedbackId) {
		return feedbackMapper.deleteByPrimaryKey(feedbackId);
	}
	
	
	@Override
	public List<Feedback> selectByLike(String parameter) {
		  List<Feedback> lists = feedbackMapper.selectFeedbackLike(parameter);
	        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
			 for (int i=0;i<lists.size();i++) { 
				 lists.get(i).setStrDate(f.format(lists.get(i).getFeedbackDate()));	 
			 }
		return lists;
	}
	
	
}
