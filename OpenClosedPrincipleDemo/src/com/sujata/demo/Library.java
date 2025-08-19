package com.sujata.demo;

import java.util.ArrayList;

public class Library {

	ArrayList<Book> bookList=new ArrayList<Book>();
	
	public Library() {
		bookList.add(new Book(1, "Book1", "AuthorA", 1500, 800));
		bookList.add(new Book(2, "Book2", "AuthorB", 2500, 3500));
		bookList.add(new Book(3, "Book3", "AuthorA", 500, 2800));
		bookList.add(new Book(4, "Book4", "AuthorC", 2000, 1800));
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}
	
//	public ArrayList<Book> getCostlierBook(){
//		ArrayList<Book> books=new ArrayList<Book>();
//		for(Book book:bookList) {
//			if(book.getPrice()>1800)
//				books.add(book);
//			
//		}
//		return books;
//	}
//	
//	public ArrayList<Book> getThickBook(){
//		ArrayList<Book> books=new ArrayList<Book>();
//		for(Book book:bookList) {
//			if(book.getNoOfPages()>200)
//				books.add(book);
//			
//		}
//		return books;
//	}
	
	public ArrayList<Book> getBookByCriteria(BookPredicate bookPredicate){
		ArrayList<Book> books=new ArrayList<Book>();
		for(Book book:bookList) {
			if(bookPredicate.test(book))
				books.add(book);
			
		}
		return books;
	}
	
}
