package by.epam.java.classes.simplest_classes_9;

import java.util.*;

public class LibraryLogic {

	/*
	 * метод возвращает 0, если вниги ещё нет в библиотеке, 1 - если книга есть в библиотеке
	 */
	public static int checkDuplicateBook (Book book, List<Book> lib) {
		
		int flag = 0;
		
		for (int i = 0; i<lib.size(); i++) {
			Book book2 = (Book)lib.get(i);
			if (book2.equals(book)){
				flag = 1;
				return flag;
			}
		}
		return flag;
	}
	/*
	 * метод реализует запуск различных действий с библиотекой
	 */
	public static void choiseAction(Library lib) {
		int mov = reqestToUser();
		if (mov ==1) {
			Library autLib = authorsBook(lib);
			System.out.println (autLib);
		} else if (mov == 2) {
			Library pubHouseLib = pubHouse(lib);
			System.out.println(pubHouseLib);
		}else if (mov == 3) {
			Library pubYearLib = afterYear(lib);
			System.out.println(pubYearLib);
		} 
	}
	
	/*
	 * метод запрашивает у пользоветеля вид действия
	 */
	public static int reqestToUser() {
		LibraryView.messageToUser("Выберие необходимое действие: \n1)Вывести список книг заданного авора "
				+ "\n2)Вывести список книг, выпущенных заданным издательством \n3)Вывести список книг, выпущенных после определенного года");
		boolean flag = false;
		int mov = 0;
		while (flag == false) {
			mov = LibraryView.requestToUser();
			
			if (mov == 1 || mov == 2 || mov == 3) {
				flag = true;
			} else {
				LibraryView.messageToUser("Данный вариант действий невозможен");
			}
		}
		return mov;
	}
	
	/*
	 * метод получает у пользователя имя автора
	 */
	public static String requestAuthor(Library lib) {
		HashSet<String> List = requestAutList(lib);		//создаём список всех авторов
		String name = LibraryView.getNameAuthor(List);	//пользователь выбирает имя из списка
		return name;
	}
	/*
	 * метод возвращает список всех авторов в библиотеке
	 */
	public static HashSet<String> requestAutList (Library lib){
		
		HashSet<String> autList = new HashSet<>();
		for (int i = 0; i < lib.getSize(); i++) {
			String name = lib.getBook(i).getAuthor();
			autList.add(name.toUpperCase());
		}
		return autList;
	}
	/*
	 * метод возвращает библиотеку из книг заданного автора
	 */
	public static Library authorsBook (Library lib) {
		
		String author = requestAuthor(lib);
		Library returnLib = new Library();
		for (int i = 0; i < lib.getSize(); i++) {
			Book b = lib.getBook(i);
			String aut = b.getAuthor();
			if(aut.equalsIgnoreCase(author)) {
				returnLib.addBook(b);
			}
		}
		return returnLib;
	}
	/*
	 * метод возвращает библиотеку из книг заданного издательства
	 */
	public static Library pubHouse(Library lib) {
		Library returnLib = new Library();
		String pubHouse = getPubHouse(lib);
		for (int i = 0; i < lib.getSize(); i++) {
			Book b = lib.getBook(i);
			String house = b.getPublishingHouse();
			if(house.equalsIgnoreCase(pubHouse)) {
				System.out.println("++++");
				returnLib.addBook(b);
			}
		}
		return returnLib;
	}
	
	/*
	 * метод получает у автора название издательского дома
	 */
	public static String getPubHouse(Library lib) {
		HashSet<String> listHouse = getListHouse(lib);
		String pubHouse = LibraryView.requestPubHouse(listHouse);
		return pubHouse;
	}
	
	/*
	 * метод возвращает список всех издательств в библиотеке
	 */
	public static HashSet<String> getListHouse (Library lib){
		
		HashSet<String> listHouse = new HashSet<>();
		for (int i = 0; i < lib.getSize(); i++) {
			String name = lib.getBook(i).getPublishingHouse();
			listHouse.add(name.toUpperCase());
		}
		return listHouse;
	}
	/*
	 * метод возвращает библиотеку из книг, изданных после указанного года
	 */
	public static Library afterYear (Library lib) {
		Library yearLib = new Library();
		int yearPub = getYear(lib);
		for (int i = 0; i < lib.getSize(); i++) {
			int year = lib.getBook(i).getPublishingYear();
			if (year > yearPub) {
				yearLib.addBook(lib.getBook(i));
			}
		}
		return yearLib;
	}
	/*
	 * метод получает у пользователя год издания книги
	 */
	public static int getYear (Library lib) {
		TreeSet<Integer> listYear = getListYear(lib);
		int year = LibraryView.requestYear(listYear);
		return year;
	}
	public static TreeSet<Integer> getListYear (Library lib){
		TreeSet<Integer> listYear = new TreeSet<>();
		for (int i = 0; i < lib.getSize(); i++) {
			int year = lib.getBook(i).getPublishingYear();
			listYear.add(year);
		}
		return listYear;
	}
}

