package by.oop.hometask.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
	
	private List<Book> Books;
	
	public Library() {
		Books = new ArrayList<Book>();
	}

	public void addToLibr(Book b) {
		Books.add(b);
	}
	
	public List<Book> getBooks() {
		return Books;
	}

	public void setBooks(List<Book> books) {
		Books = books;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(Books, other.Books);
	}

	@Override
	public String toString() {
		return "Libriary [Books=" + Books + ", getBooks()=" + getBooks() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
}
