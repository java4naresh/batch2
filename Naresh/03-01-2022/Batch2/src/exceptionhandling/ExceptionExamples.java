package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import customeexception.NameNotCorrectException;

public class ExceptionExamples {

	public static void main(String[] args)  {
		/*FileReader fr = null;
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
		String name = null;
		name.charAt(0);
			int[] arr = {1,2};
			System.out.println(arr[2]);
			String name = "Naresh";
			name.charAt(6);
			//String number = "123a";
			//Integer.parseInt(number);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			
		}
			
		
		System.out.println("Naresh");
		
		System.out.println("Naresh2");*/
		
			ExceptionExamples ee = new ExceptionExamples();
			//ee.doSomething();
			//ee.readFile();
			ee.printMyName("jgjhghj");
			
	}
	
	public void doSomething() {
		try {
		int num = 100 / 10;
		System.out.println(num);
		/*String name = "N";
		if(name != null) {
			name.charAt(1);
		}*/
		ExceptionExamples ee = null;
		ee.readFile();//
		} catch(ArithmeticException ae) {
			System.err.println(ae.getMessage());
			System.out.println("Arithmetic");
		} catch(NullPointerException e) {
			System.err.println(e.getMessage());
			System.out.println("NullPointerException");
		} catch(Exception e) {
			//e.printStackTrace();
			//System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.out.println("Exception");
		}
		System.out.println("Naresh");
		System.out.println("Welcome");
		int sum = 100 + 0;
		System.out.println(sum);
	}
	
	public void readFile() throws FileNotFoundException {
		File file = new File("read.txt");
		FileReader fr = new FileReader(file);
		
		
	}
	
	public void printMyName(String name) {
		if(name != null && !name.equals("Naresh")) throw new NameNotCorrectException("Name is not Naresh");
		System.out.println(name);
	}
}
