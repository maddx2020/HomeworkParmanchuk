package by.academy;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите тип переменной: ");
		String name = sc.nextLine();

		switch (name) {
		case ("int"): {
			System.out.print("¬ведите переменную типа " + name + ": ");
			int x = sc.nextInt();
			System.out.println("остаток от делени€ на 2: " + x % 2);
			break;
		}
		case ("double"): {
			System.out.print("¬ведите переменную типа " + name + ": ");
			double x = sc.nextDouble();
			System.out.println("70% от числа " + x * 70 / 100);
			break;
		}
		case ("float"): {
			System.out.print("¬ведите переменную типа " + name + ": ");
			float x = sc.nextFloat();
			System.out.println("квадрат числа равен: " + x * x);
			break;
		}
		case ("char"): {
			System.out.print("¬ведите переменную типа " + name + ": ");
			int x = sc.nextInt();
			System.out.println("код символа: " + (char) x);
			break;
		}
		case ("String"): {
			System.out.print("¬ведите переменную типа " + name + ": ");
			String x = sc.nextLine();
			System.out.println("Hello " + x);
			break;
		}
		default: {
			System.out.println("Unsupported type");
			break;
		}
		}

	}

}
