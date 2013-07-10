package com.chertov.lesson1.simpleInjects;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {

	private String name;

	private int age;

	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	private boolean programmer;

	private Long ageInSeconds;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();

		InjectSimple injectSimple = (InjectSimple) ctx.getBean("injectSimple");
		System.out.println(injectSimple);

	}

	@Override
	public String toString() {
		return "InjectSimple [name=" + name + ", age=" + age + ", height="
				+ height + ", programmer=" + programmer + ", ageInSeconds="
				+ ageInSeconds + "]";
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
