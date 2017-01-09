package com.maosx.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maosx.api.UserService;
import com.maosx.server.service.UserServiceImpl;

public class Main {
	private static ApplicationContext ctx;

	static{
		ctx = new ClassPathXmlApplicationContext(
				"config/applicationContext.xml");
	}
	
	public static void main(String[] args) {
		UserService userService = (UserService) ctx.getBean(UserServiceImpl.class);
		int size = userService.getUsers().size();
		System.out.println(size);
		
	}
}
