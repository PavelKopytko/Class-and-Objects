package by.epam.tr.student;

import java.util.List;

public class StudentView {

	public void print(List<Student> sts) {

		for (Student st : sts) {
			System.out.println("Surname: " + st.getSurname() + ", group number: " + st.getGroupNumber());
		}
	}

}
