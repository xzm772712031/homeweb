package com.neusoft.service;


import com.neusoft.pojo.News;
import com.neusoft.pojo.PageBean;

public interface NewsService {
	
	public PageBean<News> selectnews(int currentPage ,int pageSize);
	public PageBean<News> selectanswer(int currentPage ,int pageSize);
	public int deleteNews(int newsId);
	public int updateNews(News news);
	public int addnews(News news);
	

}
