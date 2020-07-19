package by.academy.H2.OOP.Ex5.professions;

import by.academy.H2.OOP.Ex2.Person;

public class Driver {

	private String fullName;
	private int experience;
	private Person person;

	public Driver() {
		super();
	}

	public Driver(String fullName, int experience) {
		super();
		this.fullName = fullName;
		this.experience = experience;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Person getPerson() {
		return person;
	}

}
