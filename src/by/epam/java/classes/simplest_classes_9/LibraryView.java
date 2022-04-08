package by.epam.java.classes.simplest_classes_9;

import java.util.*;

public class LibraryView {

public static void messageToUser(String message){
		
		System.out.println(message);
	}

/*
 * метод получает от пользователя вид действия
 */
	public static int requestToUser () {
		String s1 = "Выберите необходимое действие";
		String s2 = "Данный вариант действий невозможен";
		int flag = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		messageToUser(s1);
		while (!s.hasNextInt()) {
			@SuppressWarnings("unused")
			String trash = s.nextLine();
			messageToUser(s2);
			messageToUser(s1);
		}
		flag = s.nextInt();
		return flag;
	}
	
	/*
	 * метод получает от пользователя имя автора
	 */
	public static String getNameAuthor (HashSet<String> list) {
		messageToUser("В библиотеке есть книги следующих авторов: ");
		System.out.println(list);
		messageToUser("Выберите необходимого автора");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		String name = s.nextLine();
		name = name.toUpperCase();
		if(list.contains(name)) {
			return name;
		}
		messageToUser("Введённое имя отсутствует в библиотеке");
		getNameAuthor(list);
		return name;
	}
	
	public static String requestPubHouse (HashSet<String> list) {
		messageToUser("В библиотеке есть книги следующих издательств: ");
		System.out.println(list);
		messageToUser("Выберите необходимое издательство");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		String pubHouse = s.nextLine();
		pubHouse = pubHouse.toUpperCase();
		if(list.contains(pubHouse)) {
			return pubHouse;
		}
		messageToUser("Книги выбранного издательства отсутствуют в библиотеке");
		getNameAuthor(list);
		return pubHouse;
	}
	public static int requestYear (TreeSet<Integer> list) {
		messageToUser("В библиотеке есть книги изданные в следующие годы: ");
		System.out.println(list);
		messageToUser("Выберите необходимый год");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		while(!s.hasNextInt()) {
			messageToUser("Введена не цифра");
			messageToUser("Выберите необходимый год");
			@SuppressWarnings("unused")
			String trash = s.nextLine();
		}
		int pubYear = s.nextInt();
		return pubYear;
	}
}
