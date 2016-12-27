package bl.service.impl;

import java.util.Random;

import javax.enterprise.inject.Alternative;

import bl.qualifiers.Electronic;
import bl.qualifiers.IssnNumber;
import bl.service.NumberGenerator;

/*
 * We have used @Alternative annotation to use it as the alternative of injected bean in BookService
 */
@Alternative
/*
 * These qualifiers below which are currently being used in BookService for determining
 * injected classes will be overridden with the Alternative class specified in beans.xml
 */
@Electronic
@IssnNumber
public class MockGenerator implements NumberGenerator {
	@Override
	public String generateNumber() {
		return "mock-Alternative"+Math.abs(new Random().nextInt());
	}
}
