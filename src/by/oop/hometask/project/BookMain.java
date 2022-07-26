package by.oop.hometask.project;

import java.util.List;
import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {

		Library library = new Library();

		library.addToLibr(new Book(6641, "Fall", "Isak Bloom", "Verso Books", 1995, 142, 70, "Hard cover"));
		library.addToLibr(new Book(8345, "Fly", "Isak Bloom", "Verso Books", 2001, 210, 150, "Hard cover"));
		library.addToLibr(new Book(7724, "Sometimes you have to fall in order to get up", "Max Payne", "Aesir Books",
				1998, 100, 95, "Soft cover"));
		library.addToLibr(new Book(1108, "Death went the same way as me", "Max Payne", "Aesir Books", 2002, 120, 105,
				"Hard cover"));

		BookLogic log = new BookLogic();

		List<Book> res = log.lisAuthor(library.getBooks());
		log.printAuthor(res);

		System.out.println();

		List<Book> secondres = log.lisPubHouse(library.getBooks());
		log.printPubHouse(secondres);

		System.out.println();

		List<Book> thirdres = log.lisAfterYear(library.getBooks());
		log.printAfterYear(thirdres);

	}

}
