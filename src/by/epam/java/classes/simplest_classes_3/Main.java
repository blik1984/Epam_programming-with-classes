
/*
 *  �������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������
 *  �� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� �
 *  ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.
 */


package by.epam.java.classes.simplest_classes_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ask = 0;
		int flag = 0;
		@SuppressWarnings("unused")
		String trash;
		Student[] LH1 = new Student[10];
		
		for (int i = 0; i<LH1.length; i++) {
			String[] family = new String[]{"������ �.�.","������ �.�.","������ �.�.","������� �.�.","������ �.�.","������ �.�.", "������ �.�.", "��������� �.�.","����� �.�.","������ �.�."};
			String group = "LH1";
			
			int[] grades = new int[5];
			for(int l = 0; l < grades.length; l++) {
				grades[l] = 1 + (int)(Math.random()*10);
			}
			LH1[i] = new Student (family[i], group, grades);
		}
		
	//	for (int i=0; i<LH1.length; i++) {
	//		System.out.println (LH1[i]);
	//	}
		
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	
	System.out.println ("��� ������ �� ����� ��������� � ��������� ������ 9 � 10 ������� ������� 1");

	do {
		while(!s.hasNextInt()) {
			System.out.println ("��� ������ �� ����� ��������� � ��������� ������ 9 � 10 ������� ������� 1");
			trash = s.nextLine();
		}
		ask = s.nextInt();
			if (ask==1) {
				flag = 1;
			}else {
				System.out.println ("��� ������ �� ����� ��������� � ��������� ������ 9 � 10 ������� ������� 1");
			}
		}while(flag==0);
	
		StudentLogic.toSearchExcellentStudent(LH1);
	}
}
