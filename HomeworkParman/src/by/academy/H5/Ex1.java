package by.academy.H5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String... args) throws IOException {

		try (Scanner scanner = new Scanner(System.in)) {
			FileWriter fw = new FileWriter("Ex1.txt");

			while (true) {
				System.out.print("Type something(type \"stop\" to exit): ");
				String line = scanner.nextLine();
				if (!line.equals("stop")) {
					fw.write(line + "\n");
				} else {
					fw.close();
					return;
				}
			}
		}
	}

}
