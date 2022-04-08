/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */

package by.epam.java.classes.simplest_classes_5;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter (909);
		Counter counter1 = new Counter();

		final String s1 = "Создан счётчик с произвольным значением в пределах 0 - 999 (если задать больше, то будет 0)";
		final String s2 = "Добавили единичку";
		final String s3 = "Отняли единичку";
		final String s4 = "Создан счётчик со значением по умолчанию - 0";
		final String s5 = "Два раза отняли единичку";
		
		CounterView.messageToUser(s1);
		CounterView.counterView(counter);

		CounterView.messageToUser(s2);
		CounterLogic.counterPlusOne(counter);
		CounterView.counterView(counter);

		CounterView.messageToUser(s3);
		CounterLogic.counterMinusOne(counter);
		CounterView.counterView(counter);
		
		CounterView.messageToUser(s4);
		CounterView.counterView(counter1);
		
		CounterView.messageToUser(s2);
		CounterLogic.counterPlusOne(counter1);
		CounterView.counterView(counter1);
		
		CounterView.messageToUser(s5);
		CounterLogic.counterMinusOne(counter1);
		CounterLogic.counterMinusOne(counter1);
		CounterView.counterView(counter1);

		
	}
}
