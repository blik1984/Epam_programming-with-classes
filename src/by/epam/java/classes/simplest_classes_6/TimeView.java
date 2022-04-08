package by.epam.java.classes.simplest_classes_6;

public class TimeView {

	public static void messageToUser(String message){
		
		System.out.println(message);
	}
	
	public static void timeView (Time time) {
		
		int hour = time.getHour();
		int minut = time.getMinut();
		int second = time.getSecond();
		
		System.out.println("" + hour + " : " + minut + " : " + second);
	}
}
