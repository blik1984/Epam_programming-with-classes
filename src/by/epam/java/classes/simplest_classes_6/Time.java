package by.epam.java.classes.simplest_classes_6;

public class Time {
	
	private int hour;
	private int minut;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minut = 0;
		this.second = 0;
	}
	
	public Time (int num) {
		
		int second = num%100;
		int num1 = num/100;
		int minut = num1%100;
		num1 = num1/100;
		int hour = num1%100;
		
		if (num > 240000 || num < 0 ||second>59||minut>59||hour>24) {
			String s1 = "Время " + num + " выходит за допустимые границы. Установлено значение по умолчанию";
			TimeView.messageToUser(s1);
		} else {
			this.hour = hour;
			this.minut = minut;
			this.second = second;
		}
	}
	public void setHour(int hour) {
		if (hour<0 || hour > 24) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}
	public int getHour() {
		return this.hour;
	}
	public void setMinut(int minut) {
		if (minut>59 || minut < 0) {
			this.minut = 0;
		} else {
			this.minut = minut;
		}
	}
	public int getMinut() {
		return this.minut;
	}
	public void setSecond (int second) {
		if (second > 59|| second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}
	public int getSecond () {
		return this.second;
	}
	@Override
	public String toString() {
		return "Time [hour = " + this.hour + ", minut = " + this.minut + ", second = " + this.second + "]";
	}
	@Override
	public boolean equals (Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Time other = (Time)obj;
		if(this.hour != other.hour)
			return false;
		if (this.minut != other.minut)
			return false;
		if (this.second != other.second)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minut;
		result = prime * result + second;
		return result;
	}
}
