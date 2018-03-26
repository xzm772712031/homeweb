package com.neusoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.mapper.OrdercarMapper;
import com.neusoft.mapper.OrderepolyeeMapper;
import com.neusoft.pojo.Ordercar;
import com.neusoft.pojo.Orderepolyee;
import com.neusoft.service.OrderDetailService;
@Transactional
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
@Autowired
OrdercarMapper ordercarMapper;
@Autowired
OrderepolyeeMapper orderepolyeeMapper;

	@Override
	public int AddCar(Ordercar car) {
		
		return ordercarMapper.insert(car);
	}

	@Override
	public int AddEpolyee(Orderepolyee epolyee) {
		
		return orderepolyeeMapper.insert(epolyee);
	}

}
