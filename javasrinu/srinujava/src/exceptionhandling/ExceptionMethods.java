package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import customexception.NameNotCorrectException;

public class ExceptionMethods {

	public static void main(String[] args) {
		
		ExceptionMethods em =new  ExceptionMethods();
		//em.printMyName("gopi");
		//em.printMyName1("narash");
		try {
		em.readFile();
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
		em.doSomething();
		
	}
		
		public  void printMyName(String name) {
	        if (name!= null && !name.equals("srinu")) throw new RuntimeException("name is not srinu");
	        System.out.println(name);
			}
		public  void printMyName1(String name) {
	        if (name!= null && !name.equals("srinu")) throw new NameNotCorrectException("name is not srinu");
	        System.out.println(name);
			}
			 public void readFile() throws FileNotFoundException {
				 File file = new File("read.txt");
				 FileReader fe = new FileReader(file);
			 }
			 public void doSomething() {
				 try {
				 int num = 10/0;
				 System.out.println(num);
				 }catch (Exception ee) {
					 System.out.println(ee.getMessage());
					 ee.printStackTrace();
				 }
				 System.out.println("srinu");
			    
			 }
	
}
