package by.epam.java.classes.simplest_classes_4;

import java.util.*;



public class TrainLogic {

	public static List<Train> sortNumberTrain (List<Train> trains) {
		
		for (int i = 0; i<trains.size()-1;) {
			Train one = trains.get(i);
			Train two = trains.get(i+1);
			int numberOne = one.getNumber();
			int numberTwo = two.getNumber();
			
			if (numberOne>numberTwo) {
				trains.remove(i+1);
				trains.add(i, two);
				
				i=i-2;
			}
			i++;
			if (i<0) {
				i = 0;
			}
		}
		return trains;
	}
	
	public static void viewAllTrains(List<Train> trains) {
		
		for (int i = 0; i<trains.size(); i++) {
			Train t = trains.get(i);
			TrainView.viewOneTrain(t);
			}
		}

	public static String TrainList (List<Train>trains) {
		
		String trainList = new String();
		
		for (int i = 0; i<trains.size(); i++) {
			Train t = trains.get(i);
			int number = t.getNumber();
			trainList = trainList + number + ", ";
		}
		return trainList;
	}
	
	public static void viewConcreteTrain (List<Train> trains) {
		
		boolean flag = false;
		
		while (flag == false) {
			
			String s1 = "Для вывода информации доступны поезда со следующими номерами: ";
			String s2 = TrainLogic.TrainList(trains);
			String s3 = "Выберите поезд для вывода информации";
			int numberFromUser;
			int numberTrain;
			
			TrainView.messageToUser(s1 + s2);
			TrainView.messageToUser(s3);
			numberFromUser = TrainView.requestNumberTrain();
			
			for (int i = 0; i<trains.size(); i++) {
				
				Train t = trains.get(i);
				numberTrain = t.getNumber();
				
				if (numberFromUser == numberTrain) {
					flag = true;
					TrainView.viewOneTrain(t);
				}
			}
		}
	}
	
	/*
	 * В методе sortDestinationAndTime критически важно что сортировка по времени идёт перед сортировкой по пункту назначения. 
	 * Таким образом поезда с одинаковым пунктом назначения автоматически стоят отсортированными по времени
	 */
		public static List<Train>sortDestinationAndTime (List<Train> trains){
		
		sortTime(trains);
		sortDestination(trains);
		return trains;

	}
	public static List<Train>sortDestination (List<Train> trains){

		for (int k = 0; k<trains.size(); k++) {
			
		Train t = trains.get(k);
		String destinationPoint = t.getDestination();
		
		for (int i = k+1; i<trains.size(); i++) {
			
			Train t1 = trains.get(i);
			String destinationPoint2 = t1.getDestination();
			
			if (destinationPoint.equals(destinationPoint2)) {
				
				trains.add(k+1, t1);
				trains.remove(i+1);
			}
		}
	}
	return trains;
	}
	
	public static List<Train>sortTime (List<Train> trains){

		for (int i = 0; i<trains.size()-1;) {
			Train one = trains.get(i);
			Train two = trains.get(i+1);
			ArriveTime time1 = one.getDepartureTime();
			ArriveTime time2 = two.getDepartureTime();
			int time11 = (time1.getHour() * 60) + time1.getMinut();
			int time12 = (time2.getHour() * 60) + time2.getMinut();

			if (time11>time12) {
				trains.remove(i+1);
				trains.add(i, two);
				
				i= i-2;
			}
			i++;
			if (i<0) {
				i = 0;
			}
		}
		return trains;
	}
}
