package by.academy.H1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int counts1 = 0;
		int counts2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������:");
		String s1 = sc.nextLine();
		System.out.println("������� ������ ������:");
		String s2 = sc.nextLine();

		if (s1.length() != s2.length()) {
			System.out.println("False");
			return;
		}

		char array1[] = s1.toCharArray();
		char array2[] = s2.toCharArray();

		for (int i = 0; i < array1.length; i++) { 			// ������ ���������� ���� � ������ �����(����������)
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					counts1++;
				}
			}
			for (int z = 0; z < array2.length; z++) { 		// ���������� i-�� ����� ������� ����� � ������� ������� �����
				if (array1[i] == array2[z]) { 				// � ������� ���������� ����������
					counts2++;
				}
			}
			if (counts1 != counts2) { 						// �������� ���������� ���� ������� ����� � ���������� ����������
				System.out.println("False"); 				// �� ������ ������
				return;
			}
			counts2 = 0;
			counts1 = 0;
		}
		System.out.println("True");
		sc.close();
	}

}
