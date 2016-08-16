import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class ReadSortLines {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("words.txt");	
				
		    BufferedReader reader = new BufferedReader(fileReader);
				
		    String line = null;
		    ArrayList<String> origList = new ArrayList<String>();
		    
		    
		    System.out.println("Original file content: ");
		    while ((line = reader.readLine()) != null) {
		    	origList.add(line);
		    	System.out.println(line);
		    }
		    
		    //System.out.println("\nSorted file content: ");
		    Collections.sort(origList);
		    writeFile(origList);

/*		    Path p = Paths.get("./logfile.txt");
		    try (OutputStream out = new BufferedOutputStream(
		      Files.newOutputStream(p, StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {
		    	int numOfLines = origList.size();
			    for (int i=0; i<numOfLines; i++) {
			    	String temp = origList.get(0);

			    	for (String origLine : origList) {
				    	if (origLine.toUpperCase().compareTo(temp.toUpperCase())<0) {
				    		temp = origLine;
				    	}
				    }
			    	System.out.println(temp);
			    	out.write(temp.getBytes());
				    origList.remove(temp);
			    }
		    	
		    } catch (IOException x) {
		    	System.err.println(x);
		    }
*/		    
		    
		    
		} catch (IOException x) {
		    System.err.println(x);
		}
	}
	
	public static void writeFile(ArrayList<String> lines) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("./logfile.txt"));
			for (String line: lines) {
				writer.write(line + System.lineSeparator());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
