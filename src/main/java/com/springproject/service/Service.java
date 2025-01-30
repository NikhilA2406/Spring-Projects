package com.springproject.service;

import org.springframework.stereotype.Component;

@Component("ser")
public class Service 
{
	public Service() 
	{
		System.out.println("Service Bean is created");
	}
	
	public void logic()
	{
		System.out.println("Method of Service is called");
	}

}
