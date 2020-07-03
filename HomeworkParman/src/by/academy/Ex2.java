package by.academy;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������� ��� ����������: ");
		String name = sc.nextLine();

		switch (name) {
		case ("int"): {
			System.out.print("������� ���������� ���� " + name + ": ");
			int x = sc.nextInt();
			System.out.println("������� �� ������� �� 2: " + x % 2);
			break;
		}
		case ("double"): {
			System.out.print("������� ���������� ���� " + name + ": ");
			double x = sc.nextDouble();
			System.out.println("70% �� ����� " + x * 70 / 100);
			break;
		}
		case ("float"): {
			System.out.print("������� ���������� ���� " + name + ": ");
			float x = sc.nextFloat();
			System.out.println("������� ����� �����: " + x * x);
			break;
		}
		case ("char"): {
			System.out.print("������� ���������� ���� " + name + ": ");
			int x = sc.nextInt();
			System.out.println("��� �������: " + (char) x);
			break;
		}
		case ("String"): {
			System.out.print("������� ���������� ���� " + name + ": ");
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
