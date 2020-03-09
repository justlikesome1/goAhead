package com.woniu.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Car;
import com.woniu.pojo.Dept;
import com.woniu.pojo.Dispath;
import com.woniu.pojo.DispathExample;
import com.woniu.pojo.Driver;
import com.woniu.pojo.Emp;
import com.woniu.service.ICarService;
import com.woniu.service.IDeptService;
import com.woniu.service.IDispathService;
import com.woniu.service.IDriverService;
import com.woniu.service.IEmpService;

@Controller
@RequestMapping("dispath")
public class DispathController {

	@Autowired
	IDispathService dispathService;
	@Autowired
	IEmpService empService;
	@Autowired
	ICarService carService;
	@Autowired
	IDriverService driverService;
	@Autowired
	IDeptService deptService;
	
@RequestMapping("list")	
public String list(Model model,String enameLike,String addressLike) {
	DispathExample example = new DispathExample();
	
	if (enameLike != null && !enameLike.equals("")) {
		List<Emp> emp = empService.findDpidByNameLike(enameLike);
		List<Integer> eidList = new ArrayList<Integer>();
		
		for (Emp eid : emp) {
			int empId = eid.getEmpid();
			eidList.add(empId);
		}
		example.createCriteria().andEmpidIn(eidList);
	}
	
	if (addressLike != null && !addressLike.equals("")) {
		example.createCriteria().andAddressLike("%"+addressLike+"%");
	}
	
	List<Dispath> dispathList = dispathService.list(example);
	
	model.addAttribute("dispathList", dispathList);
	return "dispathList";
}

@RequestMapping("addForm")
public String toAddJsp(Model model) {
	List<Emp> empList = empService.findAllEmp();
	List<Driver> driverList = driverService.findAllDriver();
	List<Dept> deptList = deptService.findAllDept();	
	List<Car> carList = carService.findAllCar();
	model.addAttribute("empList", empList);
	model.addAttribute("driverList", driverList);
	model.addAttribute("deptList", deptList);
	model.addAttribute("carList", carList);
	for (Car car : carList) {
		
		System.out.println(car);
	}
	return "dispathAdd";
}

@RequestMapping("dispathAdd")
public String addDispathId(Dispath dispath) {
//	String disId = dispath.getStart();
	Date date = new Date();
	SimpleDateFormat dateformatGMT = new SimpleDateFormat("yyyy-MM-dd");
//	time = dateformatGMT.format(date);
	
	//将获得的时间转换为字符串病只取到空格前
	String dispathId = dispath.getStart().toLocaleString().replaceAll("-", "");
	dispathId = dispathId.substring(0, dispathId.indexOf(" "));
	dispathId = dispathId+dispath.getEmpid().toString()+dispath.getDriverid().toString()
			+dispath.getDeptid().toString()+Math.random()*100;
	dispathId = dispathId.substring(0,dispathId.indexOf("."));
	
	dispath.setDpid(dispathId);
	
	dispathService.add(dispath);
	return "redirect:list";
}


@RequestMapping("findOne")
public String toUpdateForm(Dispath disId,Model model) {
	List<Emp> empList = empService.findAllEmp();
	List<Driver> driverList = driverService.findAllDriver();
	List<Dept> deptList = deptService.findAllDept();	
	List<Car> carList = carService.findAllCar();
	model.addAttribute("empList", empList);
	model.addAttribute("driverList", driverList);
	model.addAttribute("deptList", deptList);
	model.addAttribute("carList", carList);
	Dispath dispath = dispathService.findOne(disId.getDpid());
	model.addAttribute("dispath", dispath);
	return "dispathUpd";
}


@RequestMapping("dispathUpd")
public String update(Dispath dispath,String disid) {
	DispathExample example = new DispathExample();
	example.createCriteria().andDpidEqualTo(disid);
	dispathService.update(dispath, example);
	return "redirect:list";
}


@RequestMapping("delete")
public String delete(String[] dispathId) {
	DispathExample example = new DispathExample();
	for (String string : dispathId) {
		example.createCriteria().andDpidEqualTo(string);
	}
	dispathService.delete(example);
	return "redirect:list";
}

	
}
