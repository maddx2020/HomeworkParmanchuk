package by.academy.H7;

public class Port {
	public static void main(String[] args) {

		Dock dock = new Dock();

		Ship ship1 = new Ship(dock);
		Ship ship2 = new Ship(dock);
		Ship ship3 = new Ship(dock);

		ship1.start();
		ship2.start();
		ship3.start();

	}
}
