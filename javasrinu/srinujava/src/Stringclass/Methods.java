package Stringclass;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		

		String name = "srinu";
		String name2 ="Srinu";
		String name3 = "anil";
		
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		if (name.equals(name2)) {
			System.out.println("both are same");
		}else System.out.println("both are not same");
		
		if (name.equalsIgnoreCase(name2)) {
			System.out.println("both are same");
		}else System.out.println("both are not same");
		
		  int result =name3.compareTo(name);
		  System.out.println(result);
		  
		boolean flag=  name.contains("n");
	
	    System.out.println(flag);
				
		boolean f  = name.endsWith("u");
				System.out.println(f);
				
		int index = name.indexOf("n");
		System.out.println(index);
		String s = "srinu-ibm01-M-25-30000";
		String[] array = s.split("-");
		System.out.println(Arrays.toString(array));
		
		
	}
	
}
