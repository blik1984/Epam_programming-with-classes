
/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */


package by.epam.java.classes.simplest_classes_8;

public class Main {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("климов", "александр", "вЯикторович", "Гомель, ул.Советская 1, палата 1", 1111111111111111L, 498627136871687L);
		Customer cust2 = new Customer("климов", "александр", "владимирович", "Гомель, ул.Советская 2, палата 1", 1111332233334444L, 36879462171687L);
		Customer cust3 = new Customer( "юхнов", "александр", "викторович", "Гомель, ул.Советская 1, палата 3", 1111222233334444L, 5618771865771687L);
		Customer cust4 = new Customer("жуков", "александр", "викторович", "Гомель, ул.Советская 6, палата 66", 2211222233334444L, 368748157871687L );

		Customers list = new Customers();
		
		CustomersLogic.addCustomer(list, cust1);
		CustomersLogic.addCustomer(list, cust2);
		CustomersLogic.addCustomer(list, cust3);
		CustomersLogic.addCustomer(list, cust4);
		
		System.out.println ("Исходный список: " + list);
				
		Customers list2 = CustomersLogic.searchByCardNumber(list, 1000000000000000L, 2000000000000000L);
		
		System.out.println ("Отобрали пользователей с номерами карт от 1000000000000000  до  2000000000000000: " + list2);

		System.out.println ("Отсортировали список по алфавиту (фамилия-имя-отчество): " + CustomersLogic.sortByName(list));
	}
}
