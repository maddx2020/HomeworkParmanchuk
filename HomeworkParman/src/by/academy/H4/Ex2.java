package by.academy.H4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {

		int maxValue = -1;
		int someValue;
		List<Integer> spisok = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			spisok.add((int) (Math.random() * 10));
		}
		System.out.println(spisok);

		Iterator<Integer> iterator = spisok.iterator();

		while (iterator.hasNext()) {
			someValue = iterator.next();
			if (someValue > maxValue) {
				maxValue = someValue;
			}
		}
		System.out.println(maxValue);

	}

}
