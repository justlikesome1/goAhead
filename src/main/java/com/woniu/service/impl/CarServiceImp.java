package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.CarMapper;
import com.woniu.pojo.Car;
import com.woniu.service.ICarService;
@Service
@Transactional
public class CarServiceImp implements ICarService {

	@Autowired
	CarMapper carMapper;
	
	@Override
	public List<Car> findAllCar() {
		// TODO Auto-generated method stub
		return carMapper.selectByExample(null);
	}

}
