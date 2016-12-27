package bl.service;

import javax.inject.Inject;

import bl.qualifiers.IssnNumber;
import data.Book;

public class BookService {
	
	/*
	 * CDI is injecting the IsbnGenerator Implementation here 
	 * vias @IsbnNumber, Changing this to @IssnNumber will change the output of CDIApplication class
	 */
	@Inject
	@IssnNumber
	private NumberGenerator numberGenerator;

	public Book createBook(String title){
		return new Book(title, numberGenerator.generateNumber());
	}
	
}
