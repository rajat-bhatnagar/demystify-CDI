package bl.service;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.inject.Inject;

public class FileService {
	
	@Inject
	private Path file;
	
	public void write(String text) throws Exception{
		 Files.write(file, text.getBytes(StandardCharsets.UTF_8));
	}
}
