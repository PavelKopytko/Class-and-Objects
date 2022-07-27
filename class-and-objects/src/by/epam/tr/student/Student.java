package by.epam.tr.student;

import java.util.Arrays;
import java.util.Objects;

public class Student {

	private String name;
	private String surname;
	private int groupNumber;
	private int[] marks;

	public Student() {
		super();
		name = "";
		surname = "";
		groupNumber = 0;
		marks = new int[5];

	}

	public Student(String name, String surname, int groupNumber, int[] marks) {
		super();
		this.name = name;
		this.surname = surname;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(groupNumber, name, surname);
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
		return groupNumber == other.groupNumber && Arrays.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", surname=" + surname + ", groupNumber=" + groupNumber
				+ ", marks=" + Arrays.toString(marks) + "]";
	}

}
