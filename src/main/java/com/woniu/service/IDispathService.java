package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Dispath;
import com.woniu.pojo.DispathExample;
import com.woniu.pojo.Emp;
import com.woniu.pojo.EmpExample;

public interface IDispathService {
	
	List<Dispath> list(DispathExample example);

	void add(Dispath dispath);
	
	List<Dispath> toAddForm(DispathExample example);

	Dispath findOne(String dpid);
	
	void update(Dispath dispath,DispathExample example);
	
	void delete(DispathExample example);

}
