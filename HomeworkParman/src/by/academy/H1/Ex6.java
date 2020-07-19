package by.academy.H1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int counts1 = 0;
		int counts2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первую строку:");
		String s1 = sc.nextLine();
		System.out.println("Введите вторую строку:");
		String s2 = sc.nextLine();
		sc.close();
		if (s1.length() != s2.length()) {
			System.out.println("False");
			return;
		}

		char array1[] = s1.toCharArray();
		char array2[] = s2.toCharArray();

		for (int i = 0; i < array1.length; i++) { // узнаем повторение букв в первом слове(количество)
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					counts1++;
				}
			}
			for (int z = 0; z < array2.length; z++) { // сравниваем i-ую букву первого слова с буквами второго слова
				if (array1[i] == array2[z]) { // и считаем количество совпадений
					counts2++;
				}
			}
			if (counts1 != counts2) { // проверка повторения букв первого слова и количества совпадений
				System.out.println("False"); // со вторым словом
				return;
			}
			counts2 = 0;
			counts1 = 0;
		}
		System.out.println("True");
	}

}
