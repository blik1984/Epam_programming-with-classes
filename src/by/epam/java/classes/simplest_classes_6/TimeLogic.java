package by.epam.java.classes.simplest_classes_6;

public class TimeLogic {

	public static Time timePlus (Time time, Time plus) {
			int second1 = time.getSecond();
			int minut1 = time.getMinut();
			int hour1 = time.getHour();
			
			int secondPlus = plus.getSecond();
			int minutPlus = plus.getMinut();
			int hourPlus = plus.getHour();
			
			second1 = second1 + secondPlus;
			
			if (second1 > 59) {
				minut1 = minut1 + 1;
				second1 = second1 - 60;
			}
			minut1 = minut1 + minutPlus;
			if (minut1 > 59) {
				hour1 = hour1 + 1;
				minut1 = minut1 - 60;
			}
			hour1 = hour1 + hourPlus;
			while (hour1 > 23) {
				hour1 = hour1 - 24;
			}
			time.setHour(hour1);
			time.setMinut(minut1);
			time.setSecond(second1);
		return time;
	}
	
	public static Time timeMinus (Time time, Time minus) {

		int second1 = time.getSecond();
		int minut1 = time.getMinut();
		int hour1 = time.getHour();
		int secondMinus = minus.getSecond();
		int minutMinus = minus.getMinut();
		int hourMinus = minus.getHour();
		
		second1 = second1 - secondMinus;
		if (second1 < 0) {
			minut1 = minut1 - 1;
			second1 = second1 + 60;
		}
		minut1 = minut1 - minutMinus;
		if (minut1 < 0) {
			hour1 = hour1 - 1;
			minut1 = minut1 + 60;
		}
		hour1 = hour1 - hourMinus;
		while (hour1 < 0) {
			hour1 = hour1 + 24;
		}
		time.setHour(hour1);
		time.setMinut(minut1);
		time.setSecond(second1);
	return time;
	}
}
