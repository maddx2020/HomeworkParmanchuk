package by.academy;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double x = 0;
		double fsumm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������� ����������: ");
		int age = sc.nextInt();
		System.out.print("������� ����� �������: ");
		double summ = sc.nextDouble();

//		if (summ > 0 && summ < 100) {
//			fsumm = summ - summ * 5 / 100;
//		} else {
//			if (summ >= 100 && summ < 200) {
//				fsumm = summ - summ * 7 / 100;
//			} else {
//				if (summ >= 200 && summ < 300) {
//					if (age <= 18) {
//						fsumm = summ - summ * 9 / 100;
//					} else {
//						fsumm = summ - summ * 16 / 100;								//������ ������� �������
//					}
//				} else {
//					if (summ >= 300 && summ < 400) {
//						fsumm = summ - summ * 15 / 100;
//					} else {
//						if (summ >= 400) {
//							fsumm = summ - summ * 20 / 100;
//						} else {
//							System.out.println("�������� � �������� �����!");
//							return;
//						}
//					}
//
//				}
//			}
//		}

		if (summ >= 0 && summ < 100) {
			x = 5;
		} else {
			if (summ >= 100 && summ < 200) {
				x = 7;
			} else {
				if (summ >= 200 && summ < 300) {
					x = 12;
					if (age <= 18) {
						x -= 3;
					} else {
						x += 4; // ������ ������� �������
					}
				} else {
					if (summ >= 300 && summ < 400) {
						x = 15;
					} else {
						if (summ >= 400) {
							x = 20;
						} else {
							System.out.println("�������� � �������� �����!");
							return;
						}
					}

				}
			}
		}
		System.out.println("������ = " + x);
		fsumm = summ - summ * x / 100;
		System.out.println("�������� ����� ������� � ������ ������: " + fsumm);
	}

}
