package by.academy.H3.Ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

	private String strDate;
	private Pattern p = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])-([0]?[1-9]|1[0-2])-\\d{4}");

	public Date() {
		super();
	}

	public Date(String strDate) {
		super();
		this.strDate = strDate;
		isValid();

	}

//	public Date(/*int day, int month, int year*/) {
//		super();
//		this.day = day;
//		this.month = month;
//		this.year = year;
//		setDate();
//	}

	public void isValid() {
		Matcher m = p.matcher(strDate);
		if (m.find()) {
			System.out.println("Date is correct");
		} else {
			System.out.println("Date is NOT correct! Correct example is: dd-MM-yyyy");
		}
	}

	public void setDate() {
		Day day = new Day();
		Month month = new Month();
		Year year = new Year();
		day.setDay(01);
		month.setMonth(11);
		year.setYear(1950);
	}
	


	public class Day {
		int day;

		public void setDay(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}
	}

	public class Month {
		int month;

		public void setMonth(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}
	}

	public class Year {
		int year;

		public void setYear(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public boolean isLeapYear(int year) {
			if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
