
/*
 * ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������
 * � ����� toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� ��������������
 * � ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
 * ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
 * ����� � �������:
 * a) ������ ����������� � ���������� �������;
 * b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
 */


package by.epam.java.classes.simplest_classes_8;

public class Main {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("������", "���������", "�����������", "������, ��.��������� 1, ������ 1", 1111111111111111L, 498627136871687L);
		Customer cust2 = new Customer("������", "���������", "������������", "������, ��.��������� 2, ������ 1", 1111332233334444L, 36879462171687L);
		Customer cust3 = new Customer( "�����", "���������", "����������", "������, ��.��������� 1, ������ 3", 1111222233334444L, 5618771865771687L);
		Customer cust4 = new Customer("�����", "���������", "����������", "������, ��.��������� 6, ������ 66", 2211222233334444L, 368748157871687L );

		Customers list = new Customers();
		
		CustomersLogic.addCustomer(list, cust1);
		CustomersLogic.addCustomer(list, cust2);
		CustomersLogic.addCustomer(list, cust3);
		CustomersLogic.addCustomer(list, cust4);
		
		System.out.println ("�������� ������: " + list);
				
		Customers list2 = CustomersLogic.searchByCardNumber(list, 1000000000000000L, 2000000000000000L);
		
		System.out.println ("�������� ������������� � �������� ���� �� 1000000000000000  ��  2000000000000000: " + list2);

		System.out.println ("������������� ������ �� �������� (�������-���-��������): " + CustomersLogic.sortByName(list));
	}
}
