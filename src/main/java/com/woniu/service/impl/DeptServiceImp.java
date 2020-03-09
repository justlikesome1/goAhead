package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.DeptMapper;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImp implements IDeptService{

	@Autowired
	DeptMapper deptMapper;
	
	public Dept findNameById(Integer deptid) {
		Dept dname = deptMapper.selectByPrimaryKey(deptid);
		return dname;
	}

	@Override
	public List<Dept> findAllDept() {
		// TODO Auto-generated method stub
		return deptMapper.selectAllDept();
	}
	
	
	
}
