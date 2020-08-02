package by.academy.H3.EX2;

import java.util.Arrays;

public class Box<T> {

	private T[] array;
	private int size;
	private int count;
	private int lastIndex;

	@SuppressWarnings("unchecked")
	public Box() {
		super();
		array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Box(int size) {
		super();
		if (size < 0) {
			System.out.println("Error array length !");
			return;
		} else {
			this.size = size;
		}
		array = ((T[]) new Object[size]);
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(T item) {
		if (array == null) {
			System.out.println("Enter valid array length !");
			return;
		}
		if (count == array.length) {
			array = Arrays.copyOf(array, array.length * 2 + 1);
		}
		array[count++] = item;
	}

	public T get(int index) {
		if (index < 0 || index >= array.length) {
			System.out.println("No such index in that array");
			return null;
		}
		return array[index];
	}

	public T getFirst() {
		return array[0];
	}

	public T getLast() {
		return array[array.length - 1];
	}

	public int getLength() {
		return array.length;
	}

	public Object getLastIndex() {
		for (lastIndex = array.length - 1; array[lastIndex] == null; lastIndex--) {
			if (lastIndex == 0) {
				return null;
			}
		}
		return lastIndex;
	}

	public void removeByIndex(int index) {
		if (index < 0 || index >= array.length) {
			System.out.println("No such index in that array");
			return;
		} else {
			System.arraycopy(array, 0, array, 0, index);
			System.arraycopy(array, index + 1, array, index, array.length - index - 1);
		}
	}

	public void removeByItem(T item) {
		for (int i = 0; i < array.length; i++) {
			if (item.equals(array[i])) {
				System.arraycopy(array, 0, array, 0, i);
				System.arraycopy(array, i + 1, array, i, array.length - i - 1);
				return;
			}
		}
		System.out.println("No such element in that array");
	}

}