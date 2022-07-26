package by.oop.hometask.project;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
//////////////////////////////////////////////////////////////////
	public List<Book> lisAfterYear(List<Book> b) {
		List<Book> result = new ArrayList<Book>();

		for (Book book : b) {
			if (afterYear(book)) {
				result.add(book);
			}

		}
		return result;
	}

//////////////////////////////////////////////////////////////////
	public boolean afterYear(Book b) {
		int year = b.getYearOfPublication();
		if (year >= 2000) {
			return true;
		}

		return false;
	}

//////////////////////////////////////////////////////////////////
	public boolean pubHouseAesir(Book b) {
		String pubh = b.getPublishingHouse();
		if (pubh.equals("Aesir Books"))
			return true;

		return false;
	}

//////////////////////////////////////////////////////////////////
	public List<Book> lisPubHouse(List<Book> b) {
		List<Book> res = new ArrayList<Book>();
		for (Book i : b) {
			if (pubHouseAesir(i)) {
				res.add(i);
			}
		}
		return res;
	}

//////////////////////////////////////////////////////////////////
	public boolean authorSearch(Book b) {
		String author = b.getAuthor();
		if (author.equals("Max Payne")) {
			return true;
		}

		return false;
	}

//////////////////////////////////////////////////////////////////
	public List<Book> lisAuthor(List<Book> b) {
		List<Book> res = new ArrayList<Book>();
		for (Book i : b) {
			if (authorSearch(i)) {
				res.add(i);
			}
		}
		return res;
	}

//////////////////////////////////////////////////////////////////
	public void printAfterYear(List<Book> b) {
		for (Book i : b) {
			System.out.println("Year Of Publication - " + i.getYearOfPublication() + ", Author:" + i.getAuthor() + ", Book: " + i.getName());
		}
	}

//////////////////////////////////////////////////////////////////	
	public void printPubHouse(List<Book> b) {
		for (Book i : b) {
			System.out.println("Publishing House - " + i.getPublishingHouse() + ", Author:" + i.getAuthor()	+ ", Book: " + i.getName());
		}
	}

//////////////////////////////////////////////////////////////////
	public void printAuthor(List<Book> b) {
		for (Book i : b) {
			System.out.println("Author: " + i.getAuthor() + ", Book: " + i.getName());
		}
	}
}