package com.karmanov.spring.jdbc.demo.model;

public class Circle {

	private int id;

	private String name;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Circle(int id, String name) {
		setId(id);
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

}
