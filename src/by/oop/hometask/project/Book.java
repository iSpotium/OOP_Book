package by.oop.hometask.project;

import java.util.Objects;

public class Book {
	private int bookId;
	private String name;
	private String author;
	private String publishingHouse;
	private int yearOfPublication;
	private int pages;
	private int price;
	private String bindingType;

	public Book() {
		bookId = 0;
		name = "";
		author = "";
		publishingHouse = "";
		yearOfPublication = 0;
		pages = 0;
		price = 0;
		bindingType = "";
	}

	public Book(int bookId, String name, String author, String publishingHouse, int yearOfPublication, int pages,
			int price, String bindingType) {

		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearOfPublication = yearOfPublication;
		this.pages = pages;
		this.price = price;
		this.bindingType = bindingType;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bindingType, bookId, name, pages, price, publishingHouse, yearOfPublication);
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
		return Objects.equals(author, other.author) && Objects.equals(bindingType, other.bindingType)
				&& bookId == other.bookId && Objects.equals(name, other.name) && pages == other.pages
				&& price == other.price && Objects.equals(publishingHouse, other.publishingHouse)
				&& yearOfPublication == other.yearOfPublication;
	}

}
