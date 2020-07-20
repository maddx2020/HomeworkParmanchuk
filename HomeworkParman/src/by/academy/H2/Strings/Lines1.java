package by.academy.H2.Strings;

import java.util.Scanner;

public class Lines1 {

	public static void main(String[] args) {

		String line = new String();
		String minLine = new String();
		String maxLine = new String();
		int maxLength = 0;
		int minLength = 0;

		Scanner str = new Scanner(System.in);
		System.out.println("Введите n строк (окончание - пустая строка)");
		do {
			System.out.print("Введите строку: ");
			line = str.nextLine();

			if (line.length() > maxLength) {
				maxLength = line.length();
				maxLine = line;
			} else if (line.length() != 0) {
				minLength = line.length();
				minLine = line;
			}
		} while (line.length() != 0);
		System.out.println("Самая длинная строка - " + maxLine + ", " + maxLength + " символов.");
		System.out.println("Самая короткая строка - " + minLine + ", " + minLength + " символов.");
		str.close();
	}

}
