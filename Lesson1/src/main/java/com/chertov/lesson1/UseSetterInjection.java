package com.chertov.lesson1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class UseSetterInjection {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx.refresh();
		
		MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		messageRenderer.render(); 
	}

}
