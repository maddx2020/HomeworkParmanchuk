package by.academy.H2.Ex5;

public class MainH2Ex5 {

	public static void main(String[] args) {

		Validator amer = new AmericanPhoneValidator();
		Validator bel = new BelarusPhoneValidator();
		Validator email = new EmailValidator();

		System.out.println(amer.validate("+112345678901"));
		System.out.println(bel.validate("+375442767438"));
		System.out.println(email.validate("tut@mozgov.net"));

	}

}
