package bl.producers;

import java.util.Date;
import java.util.Random;

import javax.enterprise.inject.Produces;

import bl.qualifiers.CurentTime;

public class NumberPrefixProducer {
	@Produces
	private long prefix = Math.abs(new Random().nextLong());
	
	@Produces @CurentTime
	private long currentTimeMillis = new Date().getTime();
	
	@Produces
	private String prefixStart = "myPrefix";
	
	@Produces
	private int prefixInt = Math.abs(new Random().nextInt());
}
