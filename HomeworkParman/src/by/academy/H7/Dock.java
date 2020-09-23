package by.academy.H7;

public class Dock {

	private int capasity = 0;

//за счет синхронизации в доке может находится только один корабль
	public synchronized void unload() {
		while (capasity >= 30) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		capasity++;
		System.out.println(
				Thread.currentThread().getName() + " UNLOAD 1 Container " + " \t\t\tPort capasity - " + capasity);

		notifyAll();

	}

	public synchronized void load() {
		while (capasity < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		capasity--;
		System.out.println(
				Thread.currentThread().getName() + " LOAD 1 Container " + " \t\t\tPort capasity - " + capasity);

		notifyAll();
	}

}
