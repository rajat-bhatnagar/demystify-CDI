package bl.service;

import data.Book;

public class BookService {
	
	private NumberGenerator numberGenerator;
	
	public BookService(NumberGenerator numberGenerator) {
		super();	
		this.numberGenerator = numberGenerator;
	}

	public Book createBook(String title){
		return new Book(title, numberGenerator.generateNumber());
	}
	
}
