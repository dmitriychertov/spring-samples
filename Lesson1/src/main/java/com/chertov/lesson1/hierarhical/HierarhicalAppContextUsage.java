package com.chertov.lesson1.hierarhical;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarhicalAppContextUsage {

	public static void main(String[] args) {
		GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
		parent.load("classpath:META-INF/spring/parent.xml");
		parent.refresh();

		GenericXmlApplicationContext child = new GenericXmlApplicationContext();
		child.load("classpath:META-INF/spring/app-context-xml-hier.xml");
		child.setParent(parent);
		child.refresh();

		SimpleTarget target1 = (SimpleTarget) child.getBean("target1");
		SimpleTarget target2 = (SimpleTarget) child.getBean("target2");
		SimpleTarget target3 = (SimpleTarget) child.getBean("target3");

		System.out.println(target1.getVal());
		System.out.println(target2.getVal());
		System.out.println(target3.getVal());

	}

}
