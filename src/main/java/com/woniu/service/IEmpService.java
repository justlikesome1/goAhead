package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Emp;

public interface IEmpService {

	List<Emp> findDpidByNameLike(String ename);
	
	List<Emp> findAllEmp();
}
