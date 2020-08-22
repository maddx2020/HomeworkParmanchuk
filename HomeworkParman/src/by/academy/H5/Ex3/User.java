package by.academy.H5.Ex3;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1664409403678884802L;
	private String name;
	private String surName;
	private int age;

	public User() {
		super();
	}

	public User(String name, String surName, int age) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSurName() {
		return surName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
