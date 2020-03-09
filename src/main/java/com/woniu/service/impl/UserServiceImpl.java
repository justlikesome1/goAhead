package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.woniu.mapper.UserMapper;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper um;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String where = "login";
		User loginUser = um.selectByNameAndPwd(user);
		if (loginUser != null) {
			where = "index";
		}
		return loginUser;
	}

}
