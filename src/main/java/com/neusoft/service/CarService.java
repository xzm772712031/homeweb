package com.neusoft.service;


import java.util.List;

import com.neusoft.pojo.Car;
import com.neusoft.pojo.Cartype;
import com.neusoft.pojo.PageBean;

public interface CarService {
	
	public PageBean<Car> selectCar(int currentPage,Car car,int pageSize,String flag);
	public int UpdateCar(Car car);
	public int addCar(Car car);
	public int addCarType(Cartype cartype);
	public List<Cartype> showCartype();
	public int delCar(int carId);
	public Car showById(int carId);
	public int deleteCarType(int carTypeId);
	public List<Car> selectCarByLike(String parameter);
    
}
