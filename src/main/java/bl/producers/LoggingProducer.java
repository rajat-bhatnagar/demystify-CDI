package bl.producers;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggingProducer {
	
	/*
	 * We have Parameterized the LogginProducer name
	 * and the name of the class will be fetched at runtime 
	 * using the InjectionPoint API
	 */
	@Produces
	public Logger loggingProducer(InjectionPoint injectionPoint){
		return Logger.getLogger(injectionPoint.getMember().getClass().getName());
	}

}
