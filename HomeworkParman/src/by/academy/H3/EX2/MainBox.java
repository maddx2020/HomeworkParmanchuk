package by.academy.H3.EX2;

import java.util.Arrays;

public class MainBox {

	public static void main(String[] args) {
		Box<Integer> arrayInt = new Box<Integer>(2);
		System.out.println("Index of last element is - " + arrayInt.getLastIndex());
		arrayInt.add(79);
		arrayInt.add(3);
		arrayInt.add(798);
		System.out.println(Arrays.toString(arrayInt.getArray()));
		System.out.println("Array length is - " + arrayInt.getLength() + "\n");

		arrayInt.add(11);
		arrayInt.add(43);
		System.out.println(Arrays.toString(arrayInt.getArray()));
		System.out.println("Last element is - " + arrayInt.getLast() + "\n");

		System.out.println("Element by index is - " + arrayInt.get(4));
		System.out.println("First element is - " + arrayInt.getFirst());
		arrayInt.add(0);
		System.out.println(Arrays.toString(arrayInt.getArray()));
		System.out.println("Array length is - " + arrayInt.getLength() + "\n");

		arrayInt.add(24);
		arrayInt.add(666);
		System.out.println(Arrays.toString(arrayInt.getArray()));
		System.out.println("Index of last element is - " + arrayInt.getLastIndex() + "\n");

		arrayInt.removeByIndex(3);
		System.out.println("Array after del by index - " + Arrays.toString(arrayInt.getArray()));
		System.out.println("Array length is - " + arrayInt.getLength() + "\n");

		arrayInt.removeByItem(43);
		System.out.println("Array after del by Item - " + Arrays.toString(arrayInt.getArray()));
	}

}
