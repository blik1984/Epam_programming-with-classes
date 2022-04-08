package by.epam.java.classes.simplest_classes_3;

public class StudentLogic {

	public static void toSearchExcellentStudent(Student[] group) {
		
		for (int i = 0; i<group.length; i++) {
			Student s = group[i];
			int[]grades = s.getGrades();
			boolean flag = toSearchExcellentGrades(grades);
			if(flag) {
				StudentView.toPrintStudent(s);
			}
		}
	}
	
	public static boolean toSearchExcellentGrades(int grades[]) {
		boolean flag = true;
		
		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];
			if (!(grade==10 || grade == 9)) {
				flag = false;
			}
		}
		return flag;
	}
}
