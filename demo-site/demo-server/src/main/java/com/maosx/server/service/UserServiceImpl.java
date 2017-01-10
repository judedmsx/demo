package com.maosx.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maosx.api.UserService;
import com.maosx.entity.User;
import com.maosx.server.dao.UserDao;
@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly=false)
	public void save(User user) {
		userDao.save(user);
	}

	@Transactional(readOnly=false)
	public void delete(User user) {
		userDao.delete(user);
	}

	@Transactional(readOnly=false)
	public void update(User user) {
		userDao.update(user);
	}

	public List<User> getUsers() {
		return userDao.getUsers();
	}

}
