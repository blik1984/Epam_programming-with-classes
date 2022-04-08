package by.epam.java.classes.simplest_classes_5;

public class Counter {
	
	private int hundred;
	private int decade;
	private int one;
	
	public Counter (int num) {
		
		if (num > 999|| num < 0) {
			
			final String s1 = "Число  выходит за допустимые границы. Установлено значение по умолчанию";
			
			CounterView.messageToUser(s1);
			} else {
		
			int [] nums = CounterLogic.numToMassiv(num);
		
			this.hundred = nums[0];
			this.decade = nums[1];
			this.one = nums[2];
		}
	}
	
	public Counter () {
		this.hundred = 0;
		this.decade = 0;
		this.one = 0;
	}
	
	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getDecade() {
		return decade;
	}

	public void setDecade(int decade) {
		this.decade = decade;
	}

	public int getHundred() {
		return hundred;
	}

	public void setHundred(int hundred) {
		this.hundred = hundred;
	}

	@Override
	public String toString() {
		return "Counter [hundred=" + hundred + ", decade=" + decade + ", one=" + one + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (decade != other.decade)
			return false;
		if (hundred != other.hundred)
			return false;
		if (one != other.one)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + decade;
		result = prime * result + hundred;
		result = prime * result + one;
		return result;
	}
}
