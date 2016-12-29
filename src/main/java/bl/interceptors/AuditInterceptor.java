package bl.interceptors;

import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import bl.interceptorBindings.Auditable;
import static javax.interceptor.Interceptor.Priority.APPLICATION;
/*
 * @Interceptor specifies that a class is an interceptor
 */
@Interceptor
@Auditable
/*
 * @Priority can be used to set the priority of the Interceptor in case
 * we have a chain of interceptors
 */
@Priority(APPLICATION + 10)
public class AuditInterceptor {
	
	@Inject
	private Logger logger;
	
	/*
	 * A class must not declare more than one @AroundInvoke Method
	 * 
	 */
	@AroundInvoke
	public Object auditInterceptor(InvocationContext invocationContext) throws Exception{
		long begin = System.currentTimeMillis();
		try{
			return invocationContext.proceed();
		}finally {
			logger.info(" ########### Start of Interceptor  ########### ");
			logger.info("Time of Execution as calculated by AuditInterceptor - " + (System.currentTimeMillis() - begin) + " milliseconds"); 
			logger.info(" ########### End Of Interceptor  ########### ");
		}
	}
}
