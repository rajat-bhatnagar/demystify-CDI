package bl.service.impl

import spock.lang.Specification

class IsbnGeneratorSpec extends Specification{
	
	IsbnGenerator bl = new IsbnGenerator()
	
	def "test - generateNumber - valid"(){
		when:
		String generatedRandomString = bl.generateNumber()
		
		then:
		generatedRandomString.startsWith("12-12897")
	}
}
