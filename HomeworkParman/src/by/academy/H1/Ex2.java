package by.academy.H1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите тип переменной: ");
		String name = sc.nextLine();

		switch (name) {
		case ("int"): {
			System.out.print("Введите переменную типа " + name + ": ");
			int x = sc.nextInt();
			System.out.println("остаток от деления на 2: " + x % 2);
			break;
		}
		case ("double"): {
			System.out.print("Введите переменную типа " + name + ": ");
			double x = sc.nextDouble();
			System.out.println("70% от числа " + x * 70 / 100);
			break;
		}
		case ("float"): {
			System.out.print("Введите переменную типа " + name + ": ");
			float x = sc.nextFloat();
			System.out.println("квадрат числа равен: " + x * x);
			break;
		}
		case ("char"): {
			System.out.print("Введите переменную типа " + name + ": ");
			String x = sc.nextLine();
			char y = x.charAt(0);
			System.out.println("код символа: " + (int) y);
			break;
		}
		case ("String"): {
			System.out.print("Введите переменную типа " + name + ": ");
			String x = sc.nextLine();
			System.out.println("Hello " + x);
			break;
		}
		default: {
			System.out.println("Unsupported type");
			break;
		}
		}
		sc.close();
	}

}
