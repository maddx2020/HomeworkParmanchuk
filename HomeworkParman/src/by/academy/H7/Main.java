package by.academy.H7;

public class Main {

	public static void main(String[] args) {
		
		Port port = new Port();
		
		Dock dock = new Dock(port);
		Dock dock1 = new Dock(port);
		
		Ship ship1 = new Ship(dock);
		Ship ship2 = new Ship(dock);
		Ship ship3 = new Ship(dock);
		Ship ship11 = new Ship(dock1);
		Ship ship21 = new Ship(dock1);
		Ship ship31 = new Ship(dock1);



		ship1.start();
		ship2.start();
		ship3.start();
		ship11.start();
		ship21.start();
		ship31.start();
	}

}
