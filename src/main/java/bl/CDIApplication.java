package bl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bl.service.BookService;
import bl.service.NumberGenerator;
import bl.service.impl.IsbnGenerator;
import bl.service.impl.IssnGenerator;
import data.Book;

public class CDIApplication {
	static Logger logger = LoggerFactory.getLogger(CDIApplication.class);
	
	public static void main(String[] args) {
		
		NumberGenerator isbnGenerator = new IsbnGenerator();
		NumberGenerator issnGenerator = new IssnGenerator();
		/*
		 * We are changing the NumberGenerator Implementation at runtime
		 * to enable loose Coupling between BookService and NumberGenerator
		 */
		BookService bookServiceIsbn = new BookService(isbnGenerator);
		Book bookWithIsbn = bookServiceIsbn.createBook("Spring in Action");
		logger.info("bookWithIsbn # "+bookWithIsbn);
		
		BookService bookServiceIssn = new BookService(issnGenerator);
		Book bookWithIssn = bookServiceIssn.createBook("Groovy in Action");
		logger.info("bookWithIssn # "+bookWithIssn);
	}

}
