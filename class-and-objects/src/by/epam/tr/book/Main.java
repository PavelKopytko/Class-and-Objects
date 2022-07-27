package by.epam.tr.book;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Library library = new Library();

		library.add(
				new Book(1, "Java", "Gosling", "Addison-Wesley Publishing Company", 1996, 333, 120, BookBinding.SOFT));
		library.add(new Book(2, "Head First Java", "Sierra&Bates", "O'Reilly", 2012, 598, 20, BookBinding.SOFT));
		library.add(new Book(3, "Thinking in Java", "Eckel", "PH PTR", 2009, 638, 120, BookBinding.SOLID));
		library.add(new Book(4, "Тестирование dotCom", "Savin", "Москва", 2007, 316, 50, BookBinding.SOLID));
		library.add(new Book(5, "The Complite Reference Java", "Schildt", "Mc Graw Hill", 2018, 1500, 180,
				BookBinding.SOLID));
		library.add(new Book(6, "Effective Java", "Bloch", "Addison-Wesley", 2019, 466, 160, BookBinding.SOLID));
		library.add(new Book(7, "Essential Algorithms", "Stephens", "Wiley", 2016, 548, 109, BookBinding.SOLID));

		BookLogic logic = new BookLogic();

		List<Book> resultByAuthor = logic.listByAuthor(library, "bloch");

		List<Book> resultByPublishingHouse = logic.listByPublishingHouse(library, "ph ptr");

		List<Book> resultByPublishedYear = logic.listByPublishedYear(library, 2013);

		BookView view = new BookView();

		System.out.println("resultByAuthor");
		view.print(resultByAuthor);

		System.out.println("resultByPublishingHouse");
		view.print(resultByPublishingHouse);

		System.out.println("resultByPublishedYear");
		view.print(resultByPublishedYear);

	}

}
