package stringClass;

import java.util.Arrays;

public class SapTest {

	

	public static void main(String[] args) {
		String name = "Gopi,Srinu,Venky,Anil,Janshi,Naresh";
		     String[] name2 = name.split(",");
		   // System.out.println(Arrays.toString(name2));
		     
		     for(int i=0;i<name2.length;i++) {
		    	 
		    	String n = name2[i];
		    	//System.out.println(n);
		    	char[] ch = new char[n.length()];
		    	
		    	 for(int j=0;j<n.length();j++) {
		    		//
		    			ch[j] = n.charAt(j);
		    			if(j==n.length()-1) {
		    			char tem = ch[j];
		    			ch[j] = ch[0];
		    			ch[0] = tem;
		    		} 
		    			
		    	 }
		    	 
		    	 String name3 = new String(ch);
				  System.out.println(name3);
				 
		     }
		    	 
		    
			 

	}
		     

}
