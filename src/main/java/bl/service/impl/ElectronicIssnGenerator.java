package bl.service.impl;

import java.util.Random;

import bl.qualifiers.Electronic;
import bl.qualifiers.IssnNumber;
import bl.service.NumberGenerator;

@Electronic
@IssnNumber
public class ElectronicIssnGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "electronic" + Math.abs(new Random().nextInt());
	}

}
