package by.academy.H1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число от 1 до 10: ");
		int number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.print(number * i +" ");
		}
	sc.close();
	}

}
