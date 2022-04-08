package by.epam.java.classes.simplest_classes_3;

public class StudentView {

	
	public static void toPrintStudent (Student s) {
		
		System.out.println("Студент " + s.getFamily() + "группы " + s.getGroupNumber() + " имеет оценки не ниже 9 баллов");
	
	}
}