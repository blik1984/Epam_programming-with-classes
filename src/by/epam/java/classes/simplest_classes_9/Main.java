/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 	Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * 
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года
 */

package by.epam.java.classes.simplest_classes_9;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book("Рога и копыта", "Остап Бендер", "АСТ", 1666, 113, 14.5, "мягкий");
		Book book2 = new Book("Философия", "Иван Бендер", "Ширпотрёппечать", 2023, 99, 100, "твёрдый");
		Book book3 = new Book("Методы приготовления шиншилл", "Дроздов", "Живой мир", 1999, 543, 68.9, "твердый");
		Book book4 = new Book("Рога", "Остап", "Знания", 2021, 56, 51.9, "мягкий");
		Book book5 = new Book("копыта", "Бендер", "АСТ", 2020, 113, 5, "мягкий");
		Book book6 = new Book("И", "Остап Бендер", "Знания", 1997, 236, 777, "жорсткий");
		Book book7 = new Book("Энтомология", "Шванвич", "АСТ", 1948, 300, 450, "твёрдый");
		Book book8 = new Book("Энтомология", "Шванвич", "АСТ", 1948, 300, 450, "твёрдый");


		Library library = new Library();
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		library.addBook(book8);

		LibraryLogic.choiseAction(library);
	}

}
