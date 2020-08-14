package by.academy.H4.Ex1;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private final T[][] arr;
	private int i;
	private int j;

	MyIterator(T[][] arr) {
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		if (arr.length > i && arr[i].length > j) {
//Переход на следующий массив, если первый закончился на null
			if (arr[i][j] != null) {
				return true;
			} else {
				i++;
				j = 0;
				return arr.length > i;

			}
		}
		return false;

	}

	@Override
	public T next() {
		T temp = arr[i][j++];
//Переход на следующий массив, если первый закончился на объект
		if (j >= arr[i].length) {
			i++;
			j = 0;
		}
		return temp;

	}

}
