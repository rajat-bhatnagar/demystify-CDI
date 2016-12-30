package bl.interceptors;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import bl.interceptorBindings.Lifecycle;


/*
 * An Interceptor which makes uses of @PreDestroy and @PostConstruct annotation
 * to write some random message to log for demonstration
 */

@Lifecycle
@Interceptor
public class LifecycleInterceptor {
	
	@Inject
	private Logger logger;
	
	@PostConstruct
	public void postConstructIntercept(InvocationContext invocationContext){
		logger.info(" Constructed : "+invocationContext.getTarget().toString());
	}
	
	@PreDestroy
	public void preDestryIntercept(InvocationContext invocationContext){
		logger.info(" Destoyed : " +invocationContext.getTarget().toString());
	}
}
