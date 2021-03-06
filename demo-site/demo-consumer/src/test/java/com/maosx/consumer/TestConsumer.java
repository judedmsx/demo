package com.maosx.consumer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maosx.api.UserService;
import com.maosx.entity.User;

public class TestConsumer {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:META-INF/demo-consumer.xml");
		UserService userService = (UserService)ctx.getBean("userService");
		List<User> userList = userService.getUsers();
		for(User user:userList){
			System.out.println(user.getName()+"----"+user.getSex());
		}
	}

}
