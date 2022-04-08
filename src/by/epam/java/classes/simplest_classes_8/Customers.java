package by.epam.java.classes.simplest_classes_8;

import java.util.*;

public class Customers {

	private static int counter;
	private String nameList;
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	
	public Customers () {
		counter++;
		this.nameList = "List" + counter;
	}
	
	public Customers (String nameList) {
		 counter++;
		this.nameList = nameList;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public String getNameList() {
		return nameList;
	}

	public void setNameList(String nameList) {
		this.nameList = nameList;
	}

	public static int getCounter() {
		return counter;
	}
	
	public int getSize() {
		return customers.size();
	}
	
	public Customer getCustomer(int i) {
		return customers.get(i);
	}
	
	public void setCustomer(int index, Customer customer) {
		this.customers.set(index, customer);
	}
	
	@Override
	public String toString() {
		return "Customers [nameList=" + nameList  + ", " + System.lineSeparator() + "customers=" + customers + "]";
	}
}
	