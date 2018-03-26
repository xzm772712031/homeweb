package com.neusoft.service.impl;

import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.CarMapper;
import com.neusoft.mapper.CartypeMapper;
import com.neusoft.pojo.Car;
import com.neusoft.pojo.Cartype;
import com.neusoft.pojo.PageBean;
import com.neusoft.service.CarService;
@Transactional
@Service
public class CarServiceImpl implements CarService {
   @Autowired
   CarMapper carMapper;
   @Autowired
   CartypeMapper cartypeMapper;
	@Override
	public PageBean<Car> selectCar(int currentPage, Car car, int pageSize, String flag) {
		HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Car> pageBean = new PageBean<Car>();
        //封装当前页数
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = carMapper.count(car);
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        map.put("carState", car.getCarState());
        map.put("flag", flag);
        //封装每页显示的数据
        List<Car> lists = carMapper.selectCar(map);
        pageBean.setLists(lists);  
        return pageBean;
	}
	@Override
	public int UpdateCar(Car car) {
		
		return carMapper.updateByPrimaryKeySelective(car);
	}
	@Override
	public int addCar(Car car) {
		
		return carMapper.insertSelective(car);
	}
	@Override
	public int addCarType(Cartype cartype) {
	
		return cartypeMapper.insert(cartype);
	}
	@Override
	public List<Cartype> showCartype() {
		
		return cartypeMapper.showALl();
	}
	@Override
	public int delCar(int carId) {
		
		return carMapper.deleteByPrimaryKey(carId);
	}
	@Override
	public Car showById(int carId) {
		
		return carMapper.selectByPrimaryKey(carId);
	}
	@Override
	public int deleteCarType(int carTypeId) {
		
		return cartypeMapper.deleteByPrimaryKey(carTypeId);
	}
	
	@Override
	public List<Car> selectCarByLike(String parameter) {
	
		return carMapper.selectCarByLike(parameter);
	}
	


}
