package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExamples {

	public static void main(String[] args)  {
		FileReader fr = null;
		try {
		File file = new File("batch2_readme.doc");
		fr = new FileReader(file);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//fr.close();
			System.out.println("Exception Handled");
		}
		
		try {
		/*String name = null;
		name.charAt(0);*/
			/*int[] arr = {1,2};
			System.out.println(arr[2]);*/
			String name = "Naresh";
			name.charAt(6);
			//String number = "123a";
			//Integer.parseInt(number);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			
		}
			
		
		System.out.println("Naresh");
		
		System.out.println("Naresh2");
		
	}
}
