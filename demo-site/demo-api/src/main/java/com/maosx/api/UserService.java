package com.maosx.api;

import java.util.List;

import com.maosx.entity.User;

public interface UserService {
	public List<User> getUsers();
	public void save(User user);
	public void update(User user);
	public void delete(User user);
}
