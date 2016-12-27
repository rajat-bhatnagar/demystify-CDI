package bl.service.impl;

import java.util.Random;

import bl.qualifiers.IssnNumber;
import bl.service.NumberGenerator;

@IssnNumber
public class IssnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "7-"+Math.abs(new Random().nextInt());
	}

}
