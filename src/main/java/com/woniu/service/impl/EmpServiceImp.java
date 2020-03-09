package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.woniu.mapper.DispathMapper;
import com.woniu.mapper.EmpMapper;
import com.woniu.pojo.Emp;
import com.woniu.pojo.EmpExample;
import com.woniu.service.IEmpService;
@Service
@Controller
public class EmpServiceImp implements IEmpService {

	@Autowired
	EmpMapper empMapper;
	@Autowired
	DispathMapper dispathMapper;
	
	@Override
	public List<Emp> findDpidByNameLike(String ename) {
		// TODO Auto-generated method stub
		List<Emp> list = null;
		if (ename != null && !ename.equals("")) {
			EmpExample example = new EmpExample();
			example.createCriteria().andEnameLike("%"+ename+"%");
			
			list = empMapper.selectByExample(example);
		}
		return list;
	}

	@Override
	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return empMapper.selectAllEmp();
	}

}
