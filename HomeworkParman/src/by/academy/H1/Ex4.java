package by.academy.H1;

public class Ex4 {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 0;; i++) {
			n = (int) Math.pow(2, i);
			if (n < 1_000_000) {
				System.out.println("2 в степени " + i + " равняется " + n);
			} 
		}

	}

}
