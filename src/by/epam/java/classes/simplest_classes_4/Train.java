package by.epam.java.classes.simplest_classes_4;


public class Train {
	
	private int number;
	private String destination;
	private ArriveTime departureTime;
	
	public Train (int number, String destination, ArriveTime departureTime) {
		
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}
	public Train (int number, ArriveTime departureTime) {
		
		this.number = number;
		this.departureTime = departureTime;
	}
	public Train (int number) {
		
		this.number = number;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public ArriveTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(ArriveTime departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Train [number=" + number + ", destination=" + destination + ", departureTime=" + departureTime + "]";
	}
}
