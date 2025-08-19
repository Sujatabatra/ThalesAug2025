package com.sujata.demo;

public class CostlierBookPredicate implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>1500;
	}

}
