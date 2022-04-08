package by.epam.java.classes.simplest_classes_4;

public class ArriveTime {

	private int hour;
	private int minut;
	
	public ArriveTime (int hour, int minut) {
		this.hour = hour;
		this.minut = minut;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour > 23) {
			this.hour = 23;
		} else if( hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}
	public int getMinut() {
		return minut;
	}
	public void setMinut(int minut) {
		
		if (minut>59) {
			this.minut = 59;
		} else if (minut < 0) {
			this.minut = 0;
		} else {
			this.minut = minut;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minut;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArriveTime other = (ArriveTime) obj;
		if (hour != other.hour)
			return false;
		if (minut != other.minut)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArriveTime [hour=" + hour + ", minut=" + minut + "]";
	}
}
