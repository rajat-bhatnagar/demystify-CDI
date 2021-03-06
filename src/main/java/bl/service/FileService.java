package bl.service;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import bl.interceptorBindings.Auditable;
import bl.interceptorBindings.Lifecycle;
import bl.interceptorBindings.ThreadTracker;

@Lifecycle
@ApplicationScoped
public class FileService {
	
	@Inject
	private Path file;
	
	/*
	 * Applying interceptor on this method via @Auditable interceptor binding
	 */
	@Auditable 
	@ThreadTracker
	
	public void write(String text) throws Exception{
		 Files.write(file, text.getBytes(StandardCharsets.UTF_8));
	}
}
