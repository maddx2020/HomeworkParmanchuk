package by.academy.H2.OOP.Ex5.professions;

public class Driver {
	
	private String fullName;
	private int experience;
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
	
	

}
