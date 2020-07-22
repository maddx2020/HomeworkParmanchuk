//С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//Вывести строку в следующем формате:
//	День: <Day>
//	Месяц: <Month>
//	Year: <Year>

package by.academy.H2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String[] array1 = { "01/02/9999", "00/50/0000", "15/12/2019", "20/12/2020", "2015/11/28" };

		for (String a : array1) {
			Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3]|[0|1])/([0]?[1-9]|1[0-2])/\\d{4}");
			Matcher m1 = p1.matcher(a);
			if (m1.find()) {
				System.out.println(m1.group());
				date = sdf.parse(a);
				System.out.println("Распаршенная дата - " + date + "\n");
			} else {
				System.out.println("Неверная дата" + "\n");
			}
		}

	}

}
