package by.academy.H2.Ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	String str = new String();
		
	private Pattern p = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}");
	
	@Override
	public boolean validate(String str) {
		Matcher m = p.matcher(str);
		return m.find();
	}

}
