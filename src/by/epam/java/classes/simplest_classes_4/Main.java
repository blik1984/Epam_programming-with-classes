
/*
 * �������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
 * �������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� ��
 * ������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
 * �������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� ��������
 * ���������� ������ ���� ����������� �� ������� �����������.
 */

package by.epam.java.classes.simplest_classes_4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Train> trains = new ArrayList<>();
		
		Train one = new Train (99, "gomel", new ArriveTime(4,30));
		Train two = new Train (65, "kiev", new ArriveTime(18,12));
		Train three = new Train (13, "toronto", new ArriveTime(2,56));
		Train four = new Train (4, "gomel", new ArriveTime(11,55));
		
		Train five = new Train (5);
		five.setDestination("perdi");
		five.setDepartureTime(new ArriveTime(5,15));
		
		trains.add(one);
		trains.add(two);
		trains.add(three);
		trains.add(four);
		trains.add(five);
		
		String s1 = "�������� ������ �������";
		String s2 = "��������������� ������ �������";
		String s3 = "������ ������������� �� ������ ���������� � ������� �����������";
		
		TrainView.messageToUser(s1);
		
		TrainLogic.viewAllTrains(trains);
		
		TrainLogic.sortNumberTrain(trains);		//���������� ������� �� ������ ������
		
		TrainView.messageToUser(s2);

		TrainLogic.viewAllTrains(trains);
		
		TrainLogic.sortDestinationAndTime(trains);	//���������� �� ������ ���������� � �������
		
		TrainView.messageToUser(s3);
		
		TrainLogic.viewAllTrains(trains);

		TrainLogic.viewConcreteTrain(trains);		//�������� ��������� ������

		
	}
}
