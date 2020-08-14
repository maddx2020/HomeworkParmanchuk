package by.academy.H4.Ex1;

public class MainMyIterator {

	public static void main(String[] args) {

		Integer[][] test = new Integer[][] { { 1, 2, 3 }, { 9, 8, 7, 6, null }, { 11, 99, 22, 88, null, null } };

		MyIterator<Integer> myIterator = new MyIterator<>(test);

		while (myIterator.hasNext()) {
			System.out.print(myIterator.next() + " ");
		}

	}

}
