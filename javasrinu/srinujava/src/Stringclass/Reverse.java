package Stringclass;

import java.util.Arrays;

public class Reverse {

	
	public static void main(String[] args) {
		String name = "srinu";//litteral
		String name2 = "srinu";
		String name3 = "srinu thirumalasetti";
		name = name.concat(" thirumalasetti");
		System.out.println(name);
	    System.out.println(name2);
	    System.out.println(name3);
	    if(name == name3) {
	    	System.out.println("both are same");
	    }else System.out.println("both are not same");
	    
	   if ( name.equals(name3)) {
		   System.out.println("both are same");
	   }else System.out.println("both are not same");
	   
	 String name4 = "srinu";
	  char ch =  name4.charAt(0);
	 System.out.println(name4.length()); 
	   System.out.println(ch);
	   char[] chars = new char[name4.length()];
	   System.out.println(Arrays.toString(chars));
	   for(int i = 0;i <name4.length();i++ ) {
		   chars[i] = name4.charAt(i);
		   
	   }
	   System.out.println(Arrays.toString(chars));
	   String name5 = "amma";
	   System.out.println(name5.length());
	   char[] ch1 = new char[name5.length()];
	   int num = 0;
	   for (int i = name5.length()-1;i >= 0;i-- ) {
		   ch1[num] = name5.charAt(i);
		   num++;
	   }
	   System.out.println(Arrays.toString(ch1));
	   String name6 = new String(ch1);
	   if (name5.equals(name6)) {
		   System.out.println(name5+" " +"is palindrome");
	   }else System.out.println(name5+" " +"is not palindrome");
	   
	   String name7 = "srinu";
	System.out.println( name7.toUpperCase());
	System.out.println(name7.toLowerCase());
	   
	}
}
