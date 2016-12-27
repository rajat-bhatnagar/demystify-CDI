package bl.service.impl

import spock.lang.Specification

class IssnGeneratorSpec extends Specification {
	IssnGenerator issnGenerator = new IssnGenerator()
	
	def "test - generateNumber - valid"(){
		when:
		String issn = issnGenerator.generateNumber()
		
		then:
		0 * _
		
		and:
		issn.startsWith('7-')
	}
}
