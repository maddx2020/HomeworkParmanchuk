//Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//   a) dd/MM/yyyy
//   b) dd-MM-yyyy 

package by.academy.H2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
	public static void main(String[] args) {

		String[] array1 = { "01/02/9999", "00/50/0000", "15/18/2019", "20/12/2020" };
		String[] array2 = { "01-02-9999", "20-12-2020", "15-18-2019", "00-50-0000" };

		for (String a : array1) {
			Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])/([0]?[1-9]|1[0-2])/\\d{4}");
			Matcher m1 = p1.matcher(a);
			if (m1.find()) {
				System.out.println(m1.group());
			} else {
				System.out.println("Неверная дата");
			}
		}
		System.out.println();

		for (String a : array2) {
			Pattern p2 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])-([0]?[1-9]|1[0-2])-\\d{4}");
			Matcher m2 = p2.matcher(a);
			if (m2.find()) {
				System.out.println(m2.group());
			} else {
				System.out.println("Неверная дата");
			}
		}
	}

}
