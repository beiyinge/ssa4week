import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class HelloWorld3 {
	
	private String message;
	
	public static void main(String[] args) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("words.txt"), StandardCharsets.UTF_8);
			int i=0;
			for (String s : lines) {
				System.out.print(i + "|");
				System.out.println(s);
				i++;
			}
			
		} catch(IOException ex) {
			ex.printStackTrace(System.err);
		}
		
		
		
	}

}
