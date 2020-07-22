package by.academy.H2.Ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private Pattern p = Pattern.compile("^\\+1\\d{11}$");

	@Override
	public boolean validate(String str) {
		Matcher m = p.matcher(str);
		return m.find();

	}

}
