package by.epam.tr.student;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {

	private boolean isAStudent(Student st) {
		for (int mark : st.getMarks()) {
			if (mark <= 3) {
				return false;
			}
		}
		return true;
	}

	public List<Student> listAStudent(Group group) {
		List<Student> result = new ArrayList<Student>();

		for (Student st : group.getStudents()) {
			if (isAStudent(st)) {
				result.add(st);
			}
		}
		return result;
	}

	public List<Student> listAStudent(List<Student> sts) {
		List<Student> result = new ArrayList<Student>();

		for (Student st : sts) {
			if (isAStudent(st)) {
				result.add(st);
			}
		}
		return result;
	}

}
