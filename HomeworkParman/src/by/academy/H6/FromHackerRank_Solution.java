//You are given  lines. In each line there are zero or more integers. You need to answer
//a few queries where you need to tell the number located in  position of  line.
//Take your input from System.in.
//---Input Format
//The first line has an integer n. In each of the next n lines there will be an integer d 
//denoting number of integers on that line and then there will be d space-separated integers. 
//In the next line there will be an integer q denoting number of queries. Each query will 
//consist of two integers x and y.
//---Output Format
//In each line, output the number located in  position of  line. If there is no such position, 
//just print "ERROR!"

package by.academy.H6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FromHackerRank_Solution {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		int n, d, q, x, y;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество рядов:\t");
		n = sc.nextInt();
		ArrayList[] container = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			container[i] = new ArrayList();

			System.out.print("Введите количество элементов в " + (i + 1) + " ряду:\t");
			d = sc.nextInt();
			container[i].add(d);
			System.out.println("Заполните этот ряд: ");
			for (int j = 0; j < d; j++) {
				container[i].add(sc.nextInt());
			}
		}
		System.out.println("Содержание контейнера - " + Arrays.asList(container) + "\n");

		System.out.println("Введите количество запросов для получения результата: ");
		q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Запрос №" + (i + 1));
			System.out.print("X= ");
			x = sc.nextInt();
			System.out.println("\r");
			System.out.print("Y= ");
			y = sc.nextInt();
			try {
				System.out.println("Результат - " + container[x - 1].get(y));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR !");
			}
		}

		sc.close();
	}

}
