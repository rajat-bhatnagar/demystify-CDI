package bl.service.impl;

import java.util.Random;

import javax.enterprise.inject.Vetoed;

import bl.qualifiers.IssnNumber;
import bl.service.NumberGenerator;

/*
 * @Vetoed is used to prevent the processing of a class . This class will NEVER get injected
 */
@Vetoed
@IssnNumber
public class IssnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "7-"+Math.abs(new Random().nextInt());
	}

}
