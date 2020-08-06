package by.academy.H3.Ex1;

import java.text.ParseException;
import java.util.Date;

public class MainDate {

	public static void main(String[] args) throws ParseException {

		DateValidator dateVal = new DateValidator();

		MyCustomDate zeroDate = new MyCustomDate();
		zeroDate.setDate(dateVal.validation());
		System.out.println(zeroDate.toString() + "\n");

		MyCustomDate firstDate = new MyCustomDate(dateVal.validation());
		System.out.println("День недели - " + firstDate.dayOfWeek() + "\n");

		MyCustomDate secondDate = new MyCustomDate(6, 8, 2020);
		System.out.println("Високосный год - " + secondDate.isLeapYear() + "\n");

		System.out.print("C " + firstDate.getDate() + " по " + secondDate.getDate() + " прошло ");
		System.out.println(daysBetween(firstDate, secondDate) + " дней!");

	}

	public static int daysBetween(MyCustomDate oldDate, MyCustomDate newDate) throws ParseException {

		Date date1, date2;
		date1 = MyCustomDate.sdf.parse(oldDate.getDate());
		date2 = MyCustomDate.sdf.parse(newDate.getDate());

		long secPast = date1.getTime() - date2.getTime();
		int dayPast = (int) secPast / 1000 * 60 * 60 * 24;
		return dayPast;

	}

}
