package by.academy.H2.OOP.Ex8;

public class Dog extends Animal {

	private String name;

	public Dog() {
		super();
	}

	public Dog(String food, String location, String name) {
		super(food, location);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void makeNoise() {
		System.out.println(name + " громко лает");
	}

	@Override
	public void eat() {
		System.out.println(name + " грызет косточку");
	}

}
