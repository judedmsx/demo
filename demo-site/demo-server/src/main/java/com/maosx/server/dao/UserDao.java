package com.maosx.server.dao;

import java.util.List;

import com.maosx.entity.User;
public interface UserDao {
	public List<User> getUsers();
	public void save(User user);
	public void update(User user);
	public void delete(User user);
}
