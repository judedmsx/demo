package com.maosx.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maosx.api.UserService;
import com.maosx.entity.User;
import com.maosx.server.dao.UserDao;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> getUsers() {
		return userDao.getUsers();
	}

}
