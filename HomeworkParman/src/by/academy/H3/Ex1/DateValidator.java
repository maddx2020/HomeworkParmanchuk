package by.academy.H3.Ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {
	Scanner sc = new Scanner(System.in);
	private Pattern p = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}");

	public boolean isValid(String str) {
		Matcher m = p.matcher(str);
		return !m.find();
	}

	public String validation() {
		System.out.print("Введите дату в формате: dd-MM-yyyy: ");
		String line = sc.nextLine();
		while (isValid(line)) {
			System.out.print("Введена некорректная дата. Введите заново: ");
			line = sc.nextLine();
		}
		return line;
	}
}
