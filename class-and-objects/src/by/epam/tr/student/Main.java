package by.epam.tr.student;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Group group = new Group();

		group.add(new Student("Ivan", "Ivanov", 1, new int[] { 5, 5, 4, 4, 5 }));
		group.add(new Student("Petr", "Petrov", 1, new int[] { 5, 5, 4, 4, 5 }));
		group.add(new Student("Sidor", "Sidorov", 1, new int[] { 5, 5, 5, 5, 5 }));
		group.add(new Student("Zuk", "Zukovich", 1, new int[] { 5, 5, 4, 4, 5 }));
		group.add(new Student("Epifan", "Epovich", 1, new int[] { 5, 5, 3, 4, 5 }));

		StudentLogic logic = new StudentLogic();

		List<Student> result = logic.listAStudent(group);
		List<Student> resultList = logic.listAStudent(group.getStudents());

		StudentView view = new StudentView();

		view.print(result);
		System.out.println();
		view.print(resultList);

	}

}
