package com.maosx.server;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maosx.api.UserService;
import com.maosx.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestService {
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Test
	public void testGetUsers() {
		int size = userService.getUsers().size();
		assertEquals(1, size);
	}
	
	@Test
	public void testSaveUser(){
		for(int i = 0;i<5;i++){
			User user = new User();
			user.setName("test_"+i);
			user.setSex("F");
			userService.save(user);
		}
	}
	
	@Test
	public void testUpdateUser(){
		User user = new User();
		user.setId(1);
		user.setName("maosx");
		user.setSex("F");
		userService.update(user);
	}
	
	@Test
	public void testDeleteUser(){
		User user = new User();
		user.setId(1);
		userService.delete(user);
	}
}
