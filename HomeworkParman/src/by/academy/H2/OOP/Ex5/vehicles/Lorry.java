package by.academy.H2.OOP.Ex5.vehicles;

import by.academy.H2.OOP.Ex5.details.Engine;
import by.academy.H2.OOP.Ex5.professions.Driver;

public class Lorry extends Car {
	
	private int carrying;

	public Lorry() {
		super();

	}

	public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine,int carrying) {
		super(marka, carClass, weight, driver, engine);
		this.carrying=carrying;

	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

}
