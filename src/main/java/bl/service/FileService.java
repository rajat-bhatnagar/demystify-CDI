package bl.service;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.inject.Inject;

import bl.interceptorBindings.Auditable;

public class FileService {
	
	@Inject
	private Path file;
	
	/*
	 * Applying interceptor on this method via @Auditable interceptor binding
	 */
	@Auditable 
	public void write(String text) throws Exception{
		 Files.write(file, text.getBytes(StandardCharsets.UTF_8));
	}
}
