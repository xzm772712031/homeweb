package com.neusoft.service;

import java.util.List;

import com.neusoft.pojo.Feedback;
import com.neusoft.pojo.PageBean;


public interface FeedBackService {
	public PageBean<Feedback> selectInsurance(int currentPage,Feedback feedback ,int pageSize,String flag);
	public int updateFeedBack(Feedback feedback);
	public Feedback showByInsuanceById (int feedbackId);
	public int delFeedback(int feedbackId);
	public List<Feedback> selectByLike(String parameter);

}
