package com.springproject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproject.config.Password;
import com.springproject.service.Service;

public class LaunchMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Password pass=context.getBean(Password.class);
		pass.passwordGenerated();
		
		Service service=(Service) context.getBean("ser");
		service.logic();
		

	}

}
