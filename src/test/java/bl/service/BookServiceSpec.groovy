package bl.service

import spock.lang.Specification
import bl.service.impl.IsbnGenerator
import bl.service.BookService
import data.Book

class BookServiceSpec extends Specification{
	NumberGenerator numberGenerator = Mock()
	BookService bookService = new BookService(numberGenerator)
	
	def "test - createBook - valid"(){
		given:
		String title = 'JMX in Action'
		
		when:
		bookService.createBook(title)
		
		then:
		1 * numberGenerator.generateNumber()
		0 * _
	}
}