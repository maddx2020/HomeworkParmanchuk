package by.academy.H6.Ex2;

public class User extends Person {

	public String login;
	private String password;
	protected String email;

	User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String printUserInfo() {
		return toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User information:\n \nlogin - ");
		builder.append(login);
		builder.append("\npassword - ");
		builder.append(password);
		builder.append("\nemail - ");
		builder.append(email);
		builder.append("\nfirstName - ");
		builder.append(firstName);
		builder.append("\nlastName - ");
		builder.append(lastName);
		builder.append("\nage - ");
		builder.append(age);
		builder.append("\ndateOfBirth - ");
		builder.append(dateOfBirth);
		return builder.toString();
	}

}
