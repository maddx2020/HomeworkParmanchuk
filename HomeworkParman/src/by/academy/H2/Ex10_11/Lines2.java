//Условие задачи: ввести 2 слова, состоящие из четного числа букв. 
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.

package by.academy.H2.Ex10_11;

public class Lines2 {
	public static void main(String[] args) {

		String s1 = "Четное";
		String s2 = "половина";

		System.out.println(s1.substring(0, (s1.length() / 2)).concat(s2.substring(s2.length() / 2)));

	}

}
