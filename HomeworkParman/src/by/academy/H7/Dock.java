package by.academy.H7;

public class Dock {


	private Port port;

	Dock(Port port) {
		this.port = port;
	}

//за счет синхронизации на этом этапе в доке может находится только один корабль
	public synchronized void unload() {
		while (port.getCapasity() >= 60) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		port.capasityUp();
		System.out.println(
				Thread.currentThread().getName() + " UNLOAD 1 Container " + " \t\t\tPort capasity - " + port.getCapasity());

		notify();

	}

	public synchronized void load() {
		while (port.getCapasity() < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		port.capasityDown();
		System.out.println(
				Thread.currentThread().getName() + " LOAD 1 Container " + " \t\t\tPort capasity - " + port.getCapasity());

		notify();
	}


}
