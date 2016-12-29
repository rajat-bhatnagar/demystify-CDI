package bl.interceptors;

import static javax.interceptor.Interceptor.Priority.APPLICATION;

import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import bl.interceptorBindings.ThreadTracker;

@Interceptor
/*
 * Added a Interceptor Binding for ThreadTrackerInterceptor
 */
@ThreadTracker
/*
 * Setting a priority which is less than that of Audit Interceptor
 */
@Priority(APPLICATION + 40)
public class ThreadTrackerInterceptor {
	
	@Inject
	private Logger logger;
	
	@AroundInvoke
	public Object threadTracker(InvocationContext invocationContext) throws Exception{
		String currentThreadName = Thread.currentThread().getName();
		try {
			String threadTrackerName = invocationContext.getMethod().getName() + "-" + currentThreadName;
			logger.info(" ******** ThreadTrackerInterceptor ********* "+threadTrackerName);
			return invocationContext.proceed();
		} finally{
			Thread.currentThread().setName(currentThreadName);
		}
	}
}
