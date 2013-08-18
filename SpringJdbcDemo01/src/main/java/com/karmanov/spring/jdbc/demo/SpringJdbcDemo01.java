package com.karmanov.spring.jdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.karmanov.spring.jdbc.demo.dao.CircleDaoImpl;
import com.karmanov.spring.jdbc.demo.dao.JdbcDaoImpl;
import com.karmanov.spring.jdbc.demo.model.Circle;

public class SpringJdbcDemo01 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"META-INF/spring/app-context.xml");

		JdbcDaoImpl daoImpl = applicationContext.getBean("jdbcDaoImpl",
				JdbcDaoImpl.class);

		System.out.println(daoImpl.getCircleCount());
		
//		System.out.println(daoImpl.getCircleName(1));

//		System.out.println(daoImpl.getCircleForId(2).getName());
		
//		daoImpl.insertCircle(new Circle(3, "Third Circle"));
		
//		daoImpl.advanceInsertCircle(new Circle(2, "Second Circle"));
		
//		System.out.println(daoImpl.getAllCircles().size());
		
//		daoImpl.createTriangleTable();
		
		CircleDaoImpl circleDao = applicationContext.getBean("circleDaoImpl", CircleDaoImpl.class);
		System.out.println(circleDao.getCircleCount());
		
	}

}
