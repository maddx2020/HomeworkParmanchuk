//Создать интерфейс Validator, с методом validate, принимающим строку, возвращая true/false.
//Написать класс AmericanPhoneValidator, который валидирует американский телефон(начинающийся на +1...)
//Написать класс BelarusPhoneValidator, который валидирует белорусский телефон(начинающийся на +375...) 
//Написать класс EmailValidator в методе main, валидирующий email.
//Все три класса должны реализовать интерфейс Validator.

package by.academy.H2.Ex5;

public interface Validator {

	public boolean validate(String str);

}
