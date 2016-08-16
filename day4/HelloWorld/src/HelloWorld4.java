import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ==============================================
// Reads lines of text from some input file, 
// sorts the string list data, and writes to an output file.

public class HelloWorld4 {

    public static void readSortWrite(String path, Writer w) {
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(path);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = null;
            // Read each line of file into array list.
            List<String> stringList = new ArrayList<String>();
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            // Sort array of strings
            Collections.sort(stringList);

            for (String s : stringList) {
                // Also add new line character
                w.write(s + System.lineSeparator());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
                w.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Writer uw = new UpperWriter("sorted.txt");
        HelloWorld4.readSortWrite("words.txt", uw);
    }
}

interface Writer {
    void write(String s) throws IOException;
    void close() throws IOException;
}

class UpperWriter implements Writer {
    //private String path;
    private FileWriter file;
    
    public UpperWriter(String path) {
        //this.path = path;        
        // open file
        try {
			this.file = new FileWriter(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void write(String s) throws IOException {				
		file.write(s.toUpperCase());
		System.out.println(s.toUpperCase());		      
    }
    
    public void close() throws IOException {
        this.file.close();
    }
}