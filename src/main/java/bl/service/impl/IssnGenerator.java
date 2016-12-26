package bl.service.impl;

import java.util.Random;

import bl.service.NumberGenerator;

public class IssnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "7-"+Math.abs(new Random().nextInt());
	}

}
