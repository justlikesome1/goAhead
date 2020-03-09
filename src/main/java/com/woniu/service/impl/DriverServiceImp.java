package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.woniu.mapper.DriverMapper;
import com.woniu.pojo.Driver;
import com.woniu.service.IDriverService;
@Service
@Controller
public class DriverServiceImp implements IDriverService {

	@Autowired
	DriverMapper driverMapper;

	@Override
	public List<Driver> findAllDriver() {
		// TODO Auto-generated method stub
		return driverMapper.selectAllDriver();
	}
	

}
