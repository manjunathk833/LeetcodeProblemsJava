import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GrepImplementation {
 public static void main(String[] args) throws Exception {
	 File file = new File("C:\\Users\\manju\\eclipse-workspace\\NewProject\\src\\file.txt");
	 
	        // Note:  Double backquote is to avoid compiler
	        // interpret words
	        // like \test as \t (ie. as a escape sequence)
	 
	        // Creating an object of BufferedReader class
	 		String inp = "how";
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        
	        
	 
	        // Declaring a string variable
	        String st;
	        String temp[];
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null) {
	        	temp = st.split(" ");
	        	for(String i: temp) {
	        		if(i.equals(inp)) {
	        			System.out.println(st);
	        		}
	        	}
	        	
	        	
	        }
	          
	        
	 
 }
}
