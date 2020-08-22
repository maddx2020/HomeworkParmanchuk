package by.academy.H5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) throws IOException {

		File file = new File("Temp");
		file.mkdir();
		File file2 = new File("Ex2.txt");
		long quantity = file2.length();

			for (int i = 1; i <= 5; i++) {
			String path = "Temp/" + i + ".txt";
			try (FileOutputStream fos = new FileOutputStream(path)) {
				int rand = (int) (Math.random() * quantity + 1);
				System.out.println(rand);
			}

		}
	}
}
