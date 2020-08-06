package by.academy.H3.Ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyCustomDate {

	private Day day;
	private Month month;
	private Year year;
	private Date date;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public MyCustomDate() {
		super();
	}

	public MyCustomDate(String strDate) {
		super();
		setDate(strDate);
	}

	public MyCustomDate(int d, Integer m, int y) {
		super();
		day = new Day(d);
		month = new Month(m);
		year = new Year(y);
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public class Day {
		int day;

		public Day() {
			super();
		}

		public Day(String day) {
			super();
			this.day = Integer.parseInt(day);
		}

		public Day(int day) {
			super();
			this.day = day;
		}
	}

	public class Month {
		Integer month;

		public Month() {
			super();
		}

		public Month(String month) {
			super();
			this.month = Integer.parseInt(month);
		}

		public Month(Integer month) {
			super();
			this.month = month;
		}
	}

	public class Year {
		int year;

		public Year() {
			super();
		}

		public Year(String year) {
			super();
			this.year = Integer.parseInt(year);
		}

		public Year(int year) {
			super();
			this.year = year;
		}

	}

	public boolean isLeapYear() {
		if ((year.year % 4 == 0) || (year.year % 400 == 0) && (year.year % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	public void setDate(String strDate) {
		day = new Day(strDate.substring(0, 2));
		month = new Month(strDate.substring(3, 5));
		year = new Year(strDate.substring(6));

	}

	public String getDate() {
		return day.day + "-" + month.month + "-" + year.year;
	}

	public String dayOfWeek() throws ParseException {
		
		SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE");

		date = sdf.parse(getDate());
		return sdfDay.format(date);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Дата: День = ");
		builder.append(day.day);
		builder.append(". Месяц = ");
		builder.append(month.month);
		builder.append(". Год = ");
		builder.append(year.year);
		builder.append(". \nДень недели - ");
		try {
			builder.append(dayOfWeek());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(isLeapYear()) {
			builder.append(". Високосный год");
		}else {
			builder.append(". Невисокосный год");
		}
		return builder.toString();
	}

}
