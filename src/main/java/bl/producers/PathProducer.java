package bl.producers;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.enterprise.inject.Produces;
import bl.qualifiers.CislRoot;

public class PathProducer {
	
	@Produces
	@CislRoot
	/*
	 * The path generated is injected in the FileProducer Service
	 * It has a Qualifier as FileProducer contains a method which produces
	 * a Type of Path
	 */
	private Path path = Paths.get(System.getProperty("user.home")).resolve("cisl");
	
}
