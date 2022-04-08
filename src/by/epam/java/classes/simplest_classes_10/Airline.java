package by.epam.java.classes.simplest_classes_10;

import java.util.ArrayList;

public class Airline {
	
	private Destination destination;
	private String numberFligth;
	private String typeAirplane;
	private Time departureTime;
	private ArrayList<Day> crusingDays = new ArrayList<Day>();

	
	@SuppressWarnings("unused")
	private Airline() {
		
	}
	public Airline( Destination destination, String numberFligth, String typeAirplane, Time departureTime, ArrayList<Day> crusingDays) {
		this.destination = destination;
		this.numberFligth = numberFligth;
		this.typeAirplane = typeAirplane;
		this.departureTime = departureTime;
		this.crusingDays = crusingDays;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public String getNumberFligth() {
		return numberFligth;
	}
	public void setNumberFligth(String numberFligth) {
		this.numberFligth = numberFligth;
	}
	public String getTypeAirplane() {
		return typeAirplane;
	}
	public void setTypeAirplane(String typeAirplane) {
		this.typeAirplane = typeAirplane;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public ArrayList<Day> getCrusingDays() {
		return crusingDays;
	}
	public void setCrusingDays(ArrayList<Day> crusingDays) {
		this.crusingDays = crusingDays;
	}
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFligth=" + numberFligth + ", typeAirplane="
				+ typeAirplane + ", departureTime=" + departureTime + ", crusingDays=" + crusingDays + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((crusingDays == null) ? 0 : crusingDays.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((numberFligth == null) ? 0 : numberFligth.hashCode());
		result = prime * result + ((typeAirplane == null) ? 0 : typeAirplane.hashCode());
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
		Airline other = (Airline) obj;
		if (crusingDays == null) {
			if (other.crusingDays != null)
				return false;
		} else if (!crusingDays.equals(other.crusingDays))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination != other.destination)
			return false;
		if (numberFligth == null) {
			if (other.numberFligth != null)
				return false;
		} else if (!numberFligth.equals(other.numberFligth))
			return false;
		if (typeAirplane == null) {
			if (other.typeAirplane != null)
				return false;
		} else if (!typeAirplane.equals(other.typeAirplane))
			return false;
		return true;
	}
}
