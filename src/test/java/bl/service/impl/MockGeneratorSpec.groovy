package bl.service.impl

import spock.lang.Specification

class MockGeneratorSpec extends Specification {
	MockGenerator bl = new MockGenerator()
	
	def "test - generateNumber - valid" (){
		when:
		String mockGeneratedString = bl.generateNumber()
		
		then:
		0 * _
		
		and:
		mockGeneratedString.startsWith('mock-Alternative')
	}
}
