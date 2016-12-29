package bl.service;

import javax.inject.Inject;

import bl.interceptorBindings.Auditable;
import bl.interceptorBindings.ThreadTracker;
import bl.qualifiers.CurrentTime;
import bl.qualifiers.Electronic;
import bl.qualifiers.IssnNumber;
import data.Book;

public class BookService {
	
	/*
	 * We need to use qualifiers here as CDI is strongly tyoed
	 * and we are injecting two values which are of the same type i.e long
	 */
	@Inject
	private long generatedNumberLongPrefix;
	
	@Inject @CurrentTime
	private long currentTimeMillis;
	
	@Inject
	private int generatedNumberIntPrefix;
	
	@Inject
	private String generatedNumberStrPrefix;
	
	/*
	 * CDI is injecting the IsbnGenerator Implementation here 
	 * vias @IsbnNumber, Changing this to @IssnNumber will change the output of CDIApplication class
	 */
	@Inject
	/*
	 * Injected Multiple Qualifiers
	 */
	@IssnNumber @Electronic
	private NumberGenerator numberGenerator;

	/*
	 * Appliying Interceptor in this method via Interceptor Binding @Auditable
	 */
	@Auditable
	@ThreadTracker
	public Book createBook(String title){
		String number = generatedNumberLongPrefix + "-" + generatedNumberStrPrefix + "-" +
				generatedNumberIntPrefix + "-" + currentTimeMillis + "-"+
				numberGenerator.generateNumber();
		return new Book(title, number);
	}
	
}
