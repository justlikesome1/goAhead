package com.woniu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.User;
import com.woniu.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	IUserService us;
	
	@RequestMapping("login")
	public String login(User user,Model model) {
		String where = "login";
		User loginUser = us.login(user);
		if (loginUser != null) {
			where = "index";
		}		
		model.addAttribute("loginUser", loginUser);
		return where;
	}
	

}
