package bl;

import java.util.Set;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import org.apache.deltaspike.cdise.api.CdiContainer;
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import bl.service.BookService;

public class CDIApplication {
	static Logger logger = LoggerFactory.getLogger(CDIApplication.class);
	
	public static void main(String[] args) {

		/*
		 * Construct CDIContainer for Weld , as we have added dependency for weld
		 */
		CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
		
		/*
		 * Boot the CDI Container
		 * This will trigger the classpath scan etc.
		 */
		cdiContainer.boot();
		
		BeanManager beanManager = cdiContainer.getBeanManager();
		
		Set<Bean<?>> beans = beanManager.getBeans(BookService.class);
		
		/*
		 * Return beans discovered by the container
		 */
		Bean<?> bean = beanManager.resolve(beans);
		
		/*
		 * Obtains a contextual reference for a certain bean type of the bean.
		 */
		BookService bookService = (BookService)beanManager.getReference(bean, BookService.class,
				beanManager.createCreationalContext(bean));
		
		/*
		 * Create Books via service as CDI has injected the NumberGenerator dependency for BookServce above
		 */
		logger.info("Create Spring Book # "+bookService.createBook("Spring In Action"));
		logger.info("Create Groovy Book # "+bookService.createBook("Groovy In Action"));
		logger.info("Create Java 8 Book # "+bookService.createBook("Java 8 In Action"));
		logger.info("Create Angular Book # "+bookService.createBook("Angular In Action"));
		
		/*
		 * Stop the CDI Container once all processing is completed
		 */
		cdiContainer.shutdown();
	}

}
