package by.academy.H2.OOP.Ex8;

public class Animal {

	private String food;
	private String locstion;

	public Animal() {
		super();
	}

	public Animal(String food, String locstion) {
		super();
		this.food = food;
		this.locstion = locstion;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocstion() {
		return locstion;
	}

	public void setLocstion(String locstion) {
		this.locstion = locstion;
	}

	public void makeNoise() {

	}

	public void eat() {

	}

	public void sleep() {
		System.out.println("cладко спит");
	}

}
