package by.academy.H7;

public class Port {
	
	public int capasity;
	
	
//за счет синхронизации на этом этапе емкость порта заполняется корректно
//при работе нескольких доков
	
	public synchronized void capasityUp() {
		capasity++;
	}

	public synchronized void capasityDown() {
		capasity--;
	}
}
