
/*
 * ������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. ��������
�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� ����������
������.
 */

package by.epam.java.classes.simplest_classes_2;

public class Test2 {
	
	private int one;
	private int two;
	
	public Test2(int one, int two) {
		this.one = one;
		this.two = two;
	}
	public Test2() {
	}
	
	public void setOne(int one) {
		this.one = one;
	}
	public int getOne() {
		return this.one;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public int getTwo() {
		return this.two;
	}
}
