package by.academy.H6.Ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("Tom", "Clancy", 20, "01.11.2000", "TomCat", "tc201", "mozgov@tut.net");
		Class<User> userClass = User.class;
		Class<Person> personClass = Person.class;

// вывод через getField("name")	
		try {
			System.out.println("вывод имени поля (модификатор - public) через getField(name):");
			System.out.println(personClass.getField("firstName").getName());
			System.out.println(userClass.getField("login").getName() + "\n");
		} catch (IllegalArgumentException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

// вывод через getFields()
		System.out.println("вывод всех имён полей (модификатор - public) через getFields():");
		for (Field f : Arrays.asList(userClass.getFields())) {
			System.out.println(f.getName());
		}
		System.out.println();

// вывод через getDeclaredField(name)
		System.out.println("вывод поля (все модификаторы) черезе getDeclaredField(name):");
		StringBuilder sb = new StringBuilder();
		try {
			sb.append(personClass.getDeclaredField("firstName") + "\n");
			sb.append(personClass.getDeclaredField("lastName") + "\n");
			sb.append(personClass.getDeclaredField("age") + "\n");
			sb.append(personClass.getDeclaredField("dateOfBirth") + "\n");
			sb.append(userClass.getDeclaredField("login") + "\n");
			sb.append(userClass.getDeclaredField("password") + "\n");
			sb.append(userClass.getDeclaredField("email") + "\n");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println(sb.toString());

// вывод черезе getDeclaredFields()
		System.out.println("вывод всех имен полей (все модификаторы) черезе getDeclaredFields():");
		for (Field df : Arrays.asList(personClass.getDeclaredFields())) {
			System.out.println(df.getName());
		}
		for (Field df : Arrays.asList(userClass.getDeclaredFields())) {
			System.out.println(df.getName());
		}
		System.out.println();

//вывод через getMethod("name")
		System.out.println("вывод имени функции (модификатор - public) через getMethod(name)");
		StringBuilder sb1 = new StringBuilder();
		try {
			sb1.append(userClass.getMethod("getFirstName").getName() + "\n");
			sb1.append(userClass.getMethod("setFirstName", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("getLastName").getName() + "\n");
			sb1.append(userClass.getMethod("setLastName", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("getAge").getName() + "\n");
			sb1.append(userClass.getMethod("setAge", int.class).getName() + "\n");
			sb1.append(userClass.getMethod("getDateOfBirth").getName() + "\n");
			sb1.append(userClass.getMethod("setDateOfBirth", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("getLogin").getName() + "\n");
			sb1.append(userClass.getMethod("setLogin", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("getPassword").getName() + "\n");
			sb1.append(userClass.getMethod("setPassword", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("getEmail").getName() + "\n");
			sb1.append(userClass.getMethod("setEmail", String.class).getName() + "\n");
			sb1.append(userClass.getMethod("toString").getName() + "\n");
			System.out.println(sb1.toString());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

//вывод через getMethods()
		System.out.println("вывод имени функции (модификатор - public) через getMethods()");
		for (Method m : Arrays.asList(userClass.getMethods())) {
			System.out.println(m.getName());
		}
		System.out.println();

//вывод через getDeclaredMethod("name")
		System.out.println("вывод имени функции (все модификаторы) через getDeclaredMethod(name)");
		try {
			System.out.println(userClass.getDeclaredMethod("printUserInfo").getName() + "\n");
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

//вывод через getDeclaredMethods()
		System.out.println("вывод функции (все модификаторы) через getDeclaredMethods()");
		for (Method m : Arrays.asList(personClass.getDeclaredMethods())) {
			System.out.println(m);
		}
		for (Method m : Arrays.asList(userClass.getDeclaredMethods())) {
			System.out.println(m);
		}
		System.out.println();

// вызов метода toString через invoke
		try {
			System.out.println("вызов метода toString через invoke:" + "\n");
			Method metod = userClass.getMethod("toString");
			System.out.println(metod.invoke(user1) + "\n");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			e.printStackTrace();
		}

// сетаем значения
		try {
			personClass.getDeclaredField("firstName").set(user1, "Tony");
			personClass.getDeclaredField("lastName").set(user1, "Hawk");
			personClass.getDeclaredField("age").set(user1, 25);
			personClass.getDeclaredField("dateOfBirth").set(user1, "01/01/1995");

			userClass.getDeclaredField("login").set(user1, "Bone breacker");
			Field f = userClass.getDeclaredField("password");
			f.setAccessible(true);
			f.set(user1, "proSkater");
			Field f1 = userClass.getDeclaredField("email");
			f1.setAccessible(true);
			f1.set(user1, "breack@bone.now");
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

//гетаем значения
		System.out.println("Результат после того как просетали все значения: ");
		for (Field f : Arrays.asList(personClass.getDeclaredFields())) {
			try {
				System.out.println(f.get(user1));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		for (Field f : Arrays.asList(userClass.getDeclaredFields())) {
			try {
				f.setAccessible(true);
				System.out.println(f.get(user1));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

}
