package by.epam.java.classes.simplest_classes_3;

import java.util.Arrays;

public class Student {
	
	private String family;
	private String groupNumber;
	private int[] grades = new int[5];
	
	public Student(String family, String groupNumber, int[] grades) {
		this.family = family;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}
	public Student(String family, String groupNumber) {
		this.family = family;
		this.groupNumber = groupNumber;
	}
	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	@Override
	public String toString() {
		return "Student [family=" + this.family + ", groupNumber=" + this.groupNumber + ", grades=" + Arrays.toString(this.grades)
				 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((family == null) ? 0 : family.hashCode());
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + ((groupNumber == null) ? 0 : groupNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (family == null) {
			if (other.family != null)
				return false;
		} else if (!family.equals(other.family))
			return false;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (groupNumber == null) {
			if (other.groupNumber != null)
				return false;
		} else if (!groupNumber.equals(other.groupNumber))
			return false;
		return true;
	}
}
