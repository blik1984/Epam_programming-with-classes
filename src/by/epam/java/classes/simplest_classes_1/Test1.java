package by.epam.java.classes.simplest_classes_1;

public class Test1 {

	private int one;
	private int two;
	
	public void toMonitor () {
		
		System.out.println (one + ", "+ two);
	}
	
	public int toSumm () {
		
		int summ = one+two;
		return summ;
	}
	
	public void toChangeOne(int num) {
		
		if(num>one) {		//какой-то контроль при изменении поля класса
		one = num;
		}
	}
	public void toChangeTwo(int num) {
		
		if(num>two) {		//какой-то контроль при изменении поля класса
		two = num;
		}
	}
	
	public int toSearchBiggest() {
		
		if (one >= two) {
			return one;
		} else {
			return two;
		}
	}
}