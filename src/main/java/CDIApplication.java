import bl.service.BookService;
import bl.service.NumberGenerator;
import bl.service.impl.IsbnGenerator;
import bl.service.impl.IssnGenerator;
import data.Book;


public class CDIApplication {

	public static void main(String[] args) {
		
		NumberGenerator isbnGenerator = new IsbnGenerator();
		NumberGenerator issnGenerator = new IssnGenerator();
		
		BookService bookServiceIsbn = new BookService(isbnGenerator);
		Book bookWithIsbn = bookServiceIsbn.createBook("Spring in Action");
		System.out.println("bookWithIsbn # "+bookWithIsbn);
		
		BookService bookServiceIssn = new BookService(issnGenerator);
		Book bookWithIssn = bookServiceIssn.createBook("Groovy in Action");
		System.out.println("bookWithIssn # "+bookWithIssn);
	}

}
