package by.epam.java.classes.simplest_classes_9;

import java.util.*;

public class LibraryView {

public static void messageToUser(String message){
		
		System.out.println(message);
	}

/*
 * ����� �������� �� ������������ ��� ��������
 */
	public static int requestToUser () {
		String s1 = "�������� ����������� ��������";
		String s2 = "������ ������� �������� ����������";
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
	 * ����� �������� �� ������������ ��� ������
	 */
	public static String getNameAuthor (HashSet<String> list) {
		messageToUser("� ���������� ���� ����� ��������� �������: ");
		System.out.println(list);
		messageToUser("�������� ������������ ������");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		String name = s.nextLine();
		name = name.toUpperCase();
		if(list.contains(name)) {
			return name;
		}
		messageToUser("�������� ��� ����������� � ����������");
		getNameAuthor(list);
		return name;
	}
	
	public static String requestPubHouse (HashSet<String> list) {
		messageToUser("� ���������� ���� ����� ��������� �����������: ");
		System.out.println(list);
		messageToUser("�������� ����������� ������������");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		String pubHouse = s.nextLine();
		pubHouse = pubHouse.toUpperCase();
		if(list.contains(pubHouse)) {
			return pubHouse;
		}
		messageToUser("����� ���������� ������������ ����������� � ����������");
		getNameAuthor(list);
		return pubHouse;
	}
	public static int requestYear (TreeSet<Integer> list) {
		messageToUser("� ���������� ���� ����� �������� � ��������� ����: ");
		System.out.println(list);
		messageToUser("�������� ����������� ���");
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		while(!s.hasNextInt()) {
			messageToUser("������� �� �����");
			messageToUser("�������� ����������� ���");
			@SuppressWarnings("unused")
			String trash = s.nextLine();
		}
		int pubYear = s.nextInt();
		return pubYear;
	}
}
