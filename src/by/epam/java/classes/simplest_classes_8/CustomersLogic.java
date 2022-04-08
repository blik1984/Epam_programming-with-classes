package by.epam.java.classes.simplest_classes_8;

import java.util.*;

public class CustomersLogic {

	public static Customers addCustomer (Customers list, Customer cust) {
		
		ArrayList<Customer> list2 = list.getCustomers();
		
		int index = list2.size();
		list2.add(index, cust);
		list.setCustomers(list2);
		return list;
	}
	
	public static Customers searchByCardNumber(Customers list, long min, long max) {
		
		Customers listReturn = new Customers();
		
		for (int i = 0; i<list.getSize(); i++) {
			
			Customer cust = list.getCustomer(i);
			
			long cardNumber = cust.getCardNumber();
			
			if (cardNumber>= min && cardNumber<=max) {
				
				addCustomer(listReturn, cust);
			}
		}
		return listReturn;
	}
	
	public static Customers sortByName (Customers list) {
		
		for (int i = 0; i<list.getSize()-1; ) {
			
			Customer cust1 = list.getCustomer(i);
			Customer cust2 = list.getCustomer(i+1);
			
			String name1 = cust1.getLastName() + cust1.getName() + cust1.getPatronymic();
			String name2 = cust2.getLastName() + cust2.getName() + cust2.getPatronymic();
			int p =  name1.compareToIgnoreCase(name2);
			if (p <=0 ) {
				i++;
			} else {
				Customer custProm = cust1;
				
				list.setCustomer(i, cust2);
				list.setCustomer(i+1, custProm);
				i--;
				if (i<0) {
					i = 0;
				}
			}
		}
		return list;
	}
}
