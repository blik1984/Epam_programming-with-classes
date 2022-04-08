package by.epam.java.classes.simplest_classes_4;

import java.util.*;


public class TrainView {
	
	public static void viewOneTrain (Train t) {

		System.out.println (t);
	}
	
	public static void messageToUser(String message){
		
		System.out.println(message);
	}
	
@SuppressWarnings("resource")
public static int requestNumberTrain() {
		
		String s1 = "Номер поезда введён некорректно. Повторите ввод.";
		@SuppressWarnings("unused")
		String trash;
		Scanner s = new Scanner(System.in);
		
		while(!s.hasNextInt()) {
			
			TrainView.messageToUser(s1);
			trash = s.nextLine();
		}
		int number = s.nextInt();
		return number;
	}
}
