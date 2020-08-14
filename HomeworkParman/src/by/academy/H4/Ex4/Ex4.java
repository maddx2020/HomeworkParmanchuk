package by.academy.H4.Ex4;

public class Ex4 {
	public static void main(String... args) throws CustomException {

		int[] array = new int[8];

		try {
			for (int i = 0; i != 10; i++) {
				array[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
			throw new CustomException("Do something!");
		}

	}
}
