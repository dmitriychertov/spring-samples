package com.chertov.lesson1.simpleInjects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimpleAnnotation {

	@Value("John")
	private String name;

	@Value("35")
	private int age;

	@Value("1.78")
	private float height;

	@Value("true")
	private boolean programmer;

	@Value("123890123089012")
	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context-inject-simple-annotation.xml");
		ctx.refresh();
		
		InjectSimpleAnnotation injectSimple = (InjectSimpleAnnotation) ctx.getBean("injectSimple");
		System.out.println(injectSimple);
	}
	

	@Override
	public String toString() {
		return "InjectSimpleAnnotation [name=" + name + ", age=" + age
				+ ", height=" + height + ", programmer=" + programmer
				+ ", ageInSeconds=" + ageInSeconds + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return programmer;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public Long getAgeInSeconds() {
		return ageInSeconds;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

}
