package bl.service;

import javax.inject.Inject;

import bl.qualifiers.IsbnNumber;
import data.Book;

public class BookService {
	
	@Inject
	@IsbnNumber
	private NumberGenerator numberGenerator;

	public Book createBook(String title){
		return new Book(title, numberGenerator.generateNumber());
	}
	
}
