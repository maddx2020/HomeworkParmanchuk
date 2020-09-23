package by.academy.H7;

public class Ship extends Thread {

	private Dock dock;

	Ship(Dock dock) {
		super();
		this.dock = dock;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			dock.unload();
		}

		for (int i = 1; i <= 5; i++) {
			dock.load();
		}

	}

}
