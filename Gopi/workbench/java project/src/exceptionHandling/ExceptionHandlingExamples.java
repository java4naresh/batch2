package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExamples {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("Gopi.file");
		FileReader fr = new FileReader(file);
		
		
		/*File file = new File("Gopi.file");
		FileReader fr = new FileReader(file);//Compiler exception
		*/
		/*String name = null;
		   char ch =name.charAt(0);
		   System.out.println(ch); // run time exception
		    
		     System.out.println("GOPI");
		     System.out.println("NADH");*/
		   
		   //slove the compiler exception handling
		/*   try{
		   File file = new File("Gopi.file");
			FileReader fr = new FileReader(file);//Compiler exception
		   } catch(Exception e) {
			   System.out.println(e.getMessage());
		   } finally {
			   System.out.println("Exception Handling");
		   } */
		//slove the run time exception handling
		try {
		String name = null;
		   char ch =name.charAt(0);
		   System.out.println(ch); // run time exception
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		} finally {
		
		     System.out.println("GOPI");
		     System.out.println("NADH");
		}
	}

}
