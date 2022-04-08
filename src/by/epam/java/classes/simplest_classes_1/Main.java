
/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных
 */

package by.epam.java.classes.simplest_classes_1;

public class Main
{

	public static void main(String[] args) {
		
		Test1 P = new Test1();
		
		P.toMonitor();
		
		P.toChangeOne(8);
		P.toChangeTwo(123);
		
		P.toMonitor();
		
		System.out.println(P.toSearchBiggest());
		
		System.out.println(P.toSumm());

	}

}
