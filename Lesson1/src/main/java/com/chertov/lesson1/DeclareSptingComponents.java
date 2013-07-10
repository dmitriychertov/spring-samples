package com.chertov.lesson1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSptingComponents {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
		System.out.println(messageProvider.getMessage());
	}

}
