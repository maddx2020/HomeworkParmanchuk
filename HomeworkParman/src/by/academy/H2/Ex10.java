//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//Если таких слов несколько, найти первое из них.

package by.academy.H2;

public class Ex10 {
	public static void main(String[] args) {

		int minIndexOfString = -1;
		int minCounterSymbols = Integer.MAX_VALUE;

		String[] array = { "змея", "ёж", "черепаха", "Бегемот", "крокодил", "змея", "носорог", "лис", "иж" };

		for (int s = 0; s < array.length; s++) {
			int counterSymbols = 0;
			char[] chars = new char[2000];
			for (char c : array[s].toCharArray()) {
				chars[c]++;
			}
			for (char c : chars) {
				if (c > 0) {
					counterSymbols++;
				}
			}
			if (counterSymbols < minCounterSymbols) {
				minCounterSymbols = counterSymbols;
				minIndexOfString = s;
			}

		}
		System.out.println("Слово, в котором количество различных символов минимально - " + array[minIndexOfString]);
	}

}
