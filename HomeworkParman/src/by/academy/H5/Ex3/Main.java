package by.academy.H5.Ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<User> userList = new ArrayList<>();

		userList.add(new User("Tom", "Spencer", 15));
		userList.add(new User("Bob", "Marly", 20));
		userList.add(new User("Max", "Mad", 25));
		userList.add(new User("Den", "Popovich", 30));
		userList.add(new User("Rick", "Morty", 35));
		userList.add(new User("Leo", "diCaprio", 40));
		userList.add(new User("Shon", "Lee", 45));
		userList.add(new User("Lorry", "Stivenson", 50));
		userList.add(new User("Stiven", "Sigal", 55));
		userList.add(new User("Mery", "Christmas", 60));

		File file = new File("Users");

		if (!file.exists()) {
			file.mkdir();
		}

		for (User user : userList) {
			String pathFile = "Users/" + user.getName() + "_" + user.getSurName() + ".txt";
			try (FileOutputStream fos = new FileOutputStream(pathFile);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}

	}
}
