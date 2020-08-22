package by.academy.H5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {
	public static void main(String... args) {

		try (BufferedReader br = new BufferedReader(new FileReader("Ex2.txt"));
				FileWriter fw = new FileWriter("result.txt")) {

			String result;
			while ((result = br.readLine()) != null) {
				result = result.replaceAll(" ", "");
				fw.write(result);
			}
		} catch (IOException e) {
			System.out.println("No such file");
		}
	}

}
