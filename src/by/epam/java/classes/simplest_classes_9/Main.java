/*
 * ������� ����� Book, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ �
 * ����� toString(). ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� �
 * ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
 * 	Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
 * 
 * ����� � �������:
 * a) ������ ���� ��������� ������;
 * b) ������ ����, ���������� �������� �������������;
 * c) ������ ����, ���������� ����� ��������� ����
 */

package by.epam.java.classes.simplest_classes_9;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book("���� � ������", "����� ������", "���", 1666, 113, 14.5, "������");
		Book book2 = new Book("���������", "���� ������", "��������������", 2023, 99, 100, "������");
		Book book3 = new Book("������ ������������� �������", "�������", "����� ���", 1999, 543, 68.9, "�������");
		Book book4 = new Book("����", "�����", "������", 2021, 56, 51.9, "������");
		Book book5 = new Book("������", "������", "���", 2020, 113, 5, "������");
		Book book6 = new Book("�", "����� ������", "������", 1997, 236, 777, "��������");
		Book book7 = new Book("�����������", "�������", "���", 1948, 300, 450, "������");
		Book book8 = new Book("�����������", "�������", "���", 1948, 300, 450, "������");


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
