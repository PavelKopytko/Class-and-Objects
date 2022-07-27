package by.epam.tr.book;

import java.util.Objects;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int publishedYear;
	private int countOfPages;
	private int price;
	private BookBinding binding;

	public Book() {
		super();
	}

	public Book(int id, String title, String author, String publishingHouse, int publishedYear, int countOfPages,
			int price, BookBinding binding) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishedYear = publishedYear;
		this.countOfPages = countOfPages;
		this.price = price;
		this.binding = binding;
	}

	public Book(int id, String title, String author, int countOfPages, int price, BookBinding binding) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.countOfPages = countOfPages;
		this.price = price;
		this.binding = binding;
	}

	public Book(int id, String title, String author, String publishingHouse, int publishedYear, int countOfPages,
			BookBinding binding) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publishedYear = publishedYear;
		this.countOfPages = countOfPages;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public int getCountOfPages() {
		return countOfPages;
	}

	public void setCountOfPages(int countOfPages) {
		this.countOfPages = countOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public BookBinding getBinding() {
		return binding;
	}

	public void setBinding(BookBinding binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, countOfPages, id, price, publishedYear, publishingHouse, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && binding == other.binding && countOfPages == other.countOfPages
				&& id == other.id && price == other.price && publishedYear == other.publishedYear
				&& Objects.equals(publishingHouse, other.publishingHouse) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", title=" + title + ", author=" + author
				+ ", publishingHouse=" + publishingHouse + ", publishedYear=" + publishedYear + ", countOfPages="
				+ countOfPages + ", price=" + price + ", binding=" + binding + "]";
	}

}
