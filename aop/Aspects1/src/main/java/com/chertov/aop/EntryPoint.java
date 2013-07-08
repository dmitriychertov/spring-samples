package com.chertov.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chertov.aop.service.ShapeService;

public class EntryPoint {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",
				ShapeService.class);
		System.out.println(shapeService.getTriangle().getName());
	}

}
