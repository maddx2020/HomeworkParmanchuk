package by.academy.H5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
	public static void main(String[] args) {

		File file = new File("Temp");
		file.mkdir();

		StringBuilder sb = new StringBuilder();
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader("Ex2.txt"))) {

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			System.out.println("Something wrong with file - Ex2.txt");
		}

		line = sb.toString();

		for (int i = 1; i <= 5; i++) {
			String path = "Temp/" + i + ".txt";
			try (FileWriter fw = new FileWriter(path)) {
				int rand = (int) (Math.random() * line.length() + 1);
				fw.write(line.substring(0, rand));

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
