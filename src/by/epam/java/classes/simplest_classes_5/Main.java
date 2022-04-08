
/*
 * ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� ��������
 * �� ������� � �������� ���������. ������������� ������������� �������� ���������� �� ��������� �
 * ������������� ����������. ������� ����� ������ ���������� � ���������� ���������, � �����
 * ����������� �������� ��� ������� ���������. �������� ���, ��������������� ��� ����������� ������
 */

package by.epam.java.classes.simplest_classes_5;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter (909);
		Counter counter1 = new Counter();

		final String s1 = "������ ������� � ������������ ��������� � �������� 0 - 999 (���� ������ ������, �� ����� 0)";
		final String s2 = "�������� ��������";
		final String s3 = "������ ��������";
		final String s4 = "������ ������� �� ��������� �� ��������� - 0";
		final String s5 = "��� ���� ������ ��������";
		
		CounterView.messageToUser(s1);
		CounterView.counterView(counter);

		CounterView.messageToUser(s2);
		CounterLogic.counterPlusOne(counter);
		CounterView.counterView(counter);

		CounterView.messageToUser(s3);
		CounterLogic.counterMinusOne(counter);
		CounterView.counterView(counter);
		
		CounterView.messageToUser(s4);
		CounterView.counterView(counter1);
		
		CounterView.messageToUser(s2);
		CounterLogic.counterPlusOne(counter1);
		CounterView.counterView(counter1);
		
		CounterView.messageToUser(s5);
		CounterLogic.counterMinusOne(counter1);
		CounterLogic.counterMinusOne(counter1);
		CounterView.counterView(counter1);

		
	}
}
