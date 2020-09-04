package by.academy.H6.Ex2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		User user1 = new User();
//		Person p1 = new Person("Tom", "Clancy", 20, "01.11.2000");
////		User user1 = new User("TomCat", "tc201", "mozgov@tut.net");
//		user1.setFirstName("Tom");
//		user1.setLastName("Clancy");
//		user1.setAge(20);
//		user1.setDateOfBirth("01.11.2000");
//
//		System.out.print(user1.printUserInfo());
//		System.out.println();

		Class<User> userClass = User.class;
		Class<Person> personClass = Person.class;

		try {
			userClass.getDeclaredFields();
//			System.out.println(Arrays.asList(userClass.getFields()) + " \n");
			System.out.println(Arrays.asList(userClass.getDeclaredFields()) + "\n");
//			System.out.println(Arrays.asList(personClass.getDeclaredFields()) + "\n");
			
			System.out.println(userClass.getDeclaredField("password"));
			System.out.println(userClass.getField("login").getName());
			
//			Field f = userClass.getDeclaredField("password");
//			int mod = f.getModifiers();
//			System.out.println(Modifier.isPrivate(mod));
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
