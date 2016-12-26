package bl.service.impl;

import java.util.Random;

import bl.service.NumberGenerator;

public class IsbnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "12-12897-"+Math.abs(new Random().nextInt());
	}

}
