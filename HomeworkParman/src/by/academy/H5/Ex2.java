package by.academy.H5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {
	public static void main(String... args) {

		try (FileInputStream fis = new FileInputStream("Ex2.txt");
				FileOutputStream fos = new FileOutputStream("result.txt")) {

			int res;
			while ((res = fis.read()) != -1) {
				if (res != (int) ' ') {
					fos.write(res);
				}
			}
		} catch (IOException e) {
			System.out.println("No such file");
		}
	}

}
