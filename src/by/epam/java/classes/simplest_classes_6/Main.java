
/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд
 */

package by.epam.java.classes.simplest_classes_6;

public class Main {

	public static void main(String[] args) {
		
		Time time1 = new Time();
		Time time2 = new Time(153655);
		Time time3 = new Time(115545);
		Time time4 = new Time(21256);
		
		final String s1 = "Создали время со значениями по умолчанию";
		final String s2 = "Создали время с произвольным корректным значением";
		final String s3 = "Создали время с произвольным неккорректным значением";
		final String s4 = "Добавили время";
		final String s5 = "Отняли время" ;
		
		TimeView.messageToUser(s1);
		TimeView.timeView(time1);
		
		
		TimeView.messageToUser(s2);
		TimeView.timeView(time2);

		TimeView.messageToUser(s4);
		TimeView.timeView(time4);
		TimeLogic.timePlus(time2, time4);
		TimeView.timeView(time2);
		
		TimeView.messageToUser(s5);
		TimeView.timeView(time3);
		TimeLogic.timeMinus(time2, time3);
		TimeView.timeView(time2);
				
		TimeView.messageToUser(s3);
		Time time5 = new Time(236915);
		TimeView.timeView(time5);
			
	}
}
