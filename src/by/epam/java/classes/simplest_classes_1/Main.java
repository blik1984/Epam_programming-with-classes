
/*
 * �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ����
 * ����������. �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� �������
 * ���������� �������� �� ���� ���� ����������
 */

package by.epam.java.classes.simplest_classes_1;

public class Main
{

	public static void main(String[] args) {
		
		Test1 P = new Test1();
		
		P.toMonitor();
		
		P.toChangeOne(8);
		P.toChangeTwo(123);
		
		P.toMonitor();
		
		System.out.println(P.toSearchBiggest());
		
		System.out.println(P.toSumm());

	}

}
