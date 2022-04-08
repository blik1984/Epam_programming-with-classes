package by.epam.java.classes.simplest_classes_5;

public class CounterLogic {

	public static int[] numToMassiv(int num) {
	
		int[] nums = new int[3];
	
		nums[2] = num%10;
		num = num/10;
		nums[1] = num%10;
		num = num/10;
		nums[0] = num%10;
		
	return nums;
	}
	
	public static Counter counterPlusOne (Counter counter) {
		
		int one = counter.getOne();
		int dec = counter.getDecade();
		int hun = counter.getHundred();
		
		one++;
		
		if (one > 9) {
			one = 0;
			dec++;
		}
		if(dec > 9) {
			
			dec = 0;
			hun++;
		}
		if (hun > 9) {
			
			hun = 0;
		}
		counter.setOne(one);
		counter.setDecade(dec);
		counter.setHundred(hun);
		return counter;
	}
	
	public static Counter counterMinusOne (Counter counter) {
	
		int one = counter.getOne();
		int dec = counter.getDecade();
		int hun = counter.getHundred();
		
		one--;
		
		if (one < 0) {
			one = 9;
			dec--;
		}
		if(dec < 0) {
			
			dec = 9;
			hun--;
		}
		if (hun < 0) {
			
			hun = 9;
		}
		counter.setOne(one);
		counter.setDecade(dec);
		counter.setHundred(hun);
		return counter;
	}
}
