package createdFile;

import java.util.Arrays;

public class ExceptionExamples {

	public static void main(String[] args) {
		
        /*  String name = null;
            char chars = name.charAt(0);
            
            System.out.println(chars);  //NullPointerException
            int num = 10/0;
            System.out.println(num); //ArithmeticException
            
            int[] number = new int[5];
            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            number[4] = 50;
            number[5] = 60;
            System.out.println( number[0]);
            System.out.println( number[1]);
            System.out.println( number[2]);
            System.out.println( number[3]);
            System.out.println( number[4]);
            System.out.println( number[5]); //ArrayIndexOutOfBoundsException    */
            
		  try {
		   String name = null;
            char chars = name.charAt(0);
		  
            System.out.println(chars); 
		  } catch(NullPointerException np) {
			  System.out.println(np); 
			  System.out.println(np.toString()); 
			  System.out.println(np.getStackTrace()); 
			  System.out.println(np.getMessage()); 
			  np.printStackTrace(); 
		  } 
            try {
            int num = 10/0;
            System.out.println(num);
		  } 
		
		  catch(ArithmeticException ae) {
			  System.out.println(ae);
			  System.out.println(ae.toString()); 
			  System.out.println(ae.getStackTrace());
			  System.out.println(ae.getMessage());
			  ae.printStackTrace(); 
		  }
		  catch(Exception e) {
			  System.out.println(e);  
		  } finally {
			  System.out.println("gopi"); 
		  }
	}
}
