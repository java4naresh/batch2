package stringClass;

import java.util.Arrays;

public class StringClassTest {

	public static void main(String[] args) {
		String name = "madam-amma-Naresh-Venky-Anil";
		   String[]  name2 = name.split("-");
		  System.out.println(Arrays.toString(name2));
		  
		  for(int i= 0;i<name2.length;i++) {
			  String n = name2[i];
			  char[] ch = new char[n.length()];
			  int num = 0;
			  for(int j=n.length()-1;j>=0;j--) {
				  ch[num]=n.charAt(j); 
				  num++;
			  }
			 
				  System.out.println(Arrays.toString(ch));
				  String name3 = new String(ch);
				  System.out.println(name3);
				  if(n.equals(name3)) {
					  System.out.println(n+" "+"is polindrome"); 
				  } else System.out.println(n+" "+"is not polindrome"); 
					  
				  
		  }
		
		
		  
}
}