package bl.service.impl

import spock.lang.Specification

class ElectronicIssnGeneratorSpec extends Specification {
	ElectronicIssnGenerator bl = new ElectronicIssnGenerator()
	
	def "test - generateNumber -valid"(){
		when:
		String generatedElectronicString = bl.generateNumber()
		
		then:
		0 * _
		
		and:
		generatedElectronicString.startsWith('electronic')
	}
}
