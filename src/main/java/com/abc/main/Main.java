package com.abc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.rab3.Driver;
import com.abc.rab3.Vehicle;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

		Driver d1 = (Driver) ctx.getBean("driver1");
		System.out.println(d1.toString());

		Vehicle v1 = (Vehicle) ctx.getBean("veh1");
		System.out.println(v1.toString());
		
		Vehicle v2 = (Vehicle) ctx.getBean("veh2");
		System.out.println(v2.toString());

	}
}
