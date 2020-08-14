package by.academy.H4;

import java.util.HashMap;
import java.util.TreeSet;

public class Ex3 {
	public static void main(String[] args) {

		Integer counter;
		String longLine = "Дан указатель на последний элемент двусвязного списка. "
				+ " Может быть, это говорит о том, что список пуст, возвращаем."
				+ " Поменять порядок элементов в списке на обратный."
				+ " Измените следующий и предыдущий указатели всех узлов, чтобы направление списка изменилось."
				+ " Вернуть список на последний элемент измененного перевернутого списка. ";

		char[] charArray = longLine.toCharArray();
		HashMap<Character, Integer> box = new HashMap<>();

		for (Character c : charArray) {
			counter = box.get(c);
			box.put(c, counter == null ? 1 : counter + 1);
		}

		TreeSet<Character> ts = new TreeSet<Character>(box.keySet());
		for (Character c1 : ts) {
			System.out.println(c1 + " - " + box.get(c1));
		}
	}

}
