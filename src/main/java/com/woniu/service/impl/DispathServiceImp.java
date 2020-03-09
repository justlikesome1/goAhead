package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.CarMapper;
import com.woniu.mapper.DeptMapper;
import com.woniu.mapper.DispathMapper;
import com.woniu.mapper.DriverMapper;
import com.woniu.mapper.EmpMapper;
import com.woniu.pojo.Dispath;
import com.woniu.pojo.DispathExample;
import com.woniu.pojo.Emp;
import com.woniu.service.IDispathService;
@Service
@Transactional
public class DispathServiceImp implements IDispathService {
	
	@Autowired
	DispathMapper dispathMapper;

	
	@Override
	public List<Dispath> list(DispathExample dispath) {
		
		List<Dispath> dispathList = dispathMapper.selectByExample(dispath);
		
		return dispathList;
	}
	
	

	@Override
	public Dispath findOne(String dpid) {
		// TODO Auto-generated method stub
		return (Dispath) dispathMapper.selectOne(dpid);
	}

	@Override
	public void add(Dispath dispath) {
		// TODO Auto-generated method stub
		dispathMapper.insert(dispath);
	}



	@Override
	public List<Dispath> toAddForm(DispathExample example) {
		// TODO Auto-generated method stub
		
		return dispathMapper.selectByExample(example);
	}



	@Override
	public void update(Dispath dispath,DispathExample example) {
		// TODO Auto-generated method stub
		dispathMapper.updateByExampleSelective(dispath, example);
	}



	@Override
	public void delete(DispathExample example) {
		// TODO Auto-generated method stub
		dispathMapper.deleteByExample(example);
	}


}
