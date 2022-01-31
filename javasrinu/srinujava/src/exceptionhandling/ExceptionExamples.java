package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExamples {
	
	
	public static void main (String[] args)   {
		
	/*File file = new File("batch2_readme"); //	compile time exception
		FileReader fr= new FileReader(file);
		
		String  name = null; // run time exception
		name.charAt(0);*/
	/*	FileReader fr = null;
	try {
	 File file = new File("batch2_readme"); 
		 fr= new FileReader(file);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		//fr.close();
		System.out.println("Exception handled");
	}*/
	/*	try {
			int num = 10/0;
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			/*String name = null;
			name.charAt(0);*/
		/*	String number = "123a";
			Integer.parseInt(number);*/
			String name = "srinu";
			name.charAt(5);
			/*int [] arr = {1,2};
			System.out.println(arr [2]);*/
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("srinu");
		System.out.println("srinu1");
		
	/*	try {
		String  name = "srinu"; 
		name.charAt(0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("srinu");  
		System.out.println("srinu1");*/
		
	}

}
