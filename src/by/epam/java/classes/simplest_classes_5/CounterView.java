package by.epam.java.classes.simplest_classes_5;

public class CounterView {

	public static void messageToUser(String message){
		
		System.out.println(message);
	}
	
	public static void counterView (Counter counter){
	
	int one = counter.getOne();
	int dec = counter.getDecade();
	int hun = counter.getHundred();
	System.out.println("" + hun + " " + dec + " " + one);
	}
}
