package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptService {

	Dept findNameById(Integer deptid);
	
	List<Dept> findAllDept();
}
