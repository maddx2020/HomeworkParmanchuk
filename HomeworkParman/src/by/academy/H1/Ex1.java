package by.academy.H1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double x = 0;
		double fsumm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ââĺäčňĺ âîçđŕńň ďîęóďŕňĺë˙: ");
		int age = sc.nextInt();
		System.out.print("Ââĺäčňĺ ńóěěó ďîęóďęč: ");
		double summ = sc.nextDouble();
		sc.close();
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
						x += 4; 
					}
				} else {
					if (summ >= 300 && summ < 400) {
						x = 15;
					} else {
						if (summ >= 400) {
							x = 20;
						} else {
							System.out.println("Âîđîâŕňü â ěŕăŕçčíĺ ďëîőî!");
							return;
						}
					}

				}
			}
		}
		System.out.println("ńęčäęŕ = " + x);
		fsumm = summ - summ * x / 100;
		System.out.println("Čňîăîâŕ˙ ńóěěŕ ďîęóďęč ń ó÷ĺňîě ńęčäęč: " + fsumm);

	}

}
