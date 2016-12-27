package bl.service.impl;

import java.util.Random;

import bl.qualifiers.IsbnNumber;
import bl.service.NumberGenerator;

@IsbnNumber
public class IsbnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "12-12897-"+Math.abs(new Random().nextInt());
	}

}
