package com.maosx.server;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maosx.api.UserService;
import com.maosx.server.service.UserServiceImpl;

public class Main {
	/*private static ApplicationContext ctx;

	static{
		ctx = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml","classpath:META-INF/server-provider.xml");
	}
	*/
	public static void main(String[] args) throws IOException {
//		UserService userService = (UserService) ctx.getBean(UserServiceImpl.class);
//		int size = userService.getUsers().size();
//		System.out.println(size);
//		com.alibaba.dubbo.container.Main.main(args);
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml","classpath:META-INF/server-provider.xml");
		ctx.start();
		
		System.in.read();
	}
}
