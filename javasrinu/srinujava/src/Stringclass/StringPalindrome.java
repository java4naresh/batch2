package Stringclass;

import java.util.Arrays;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String s = "Srinu@Anil@Naresh@Jhansi@amma@nana";
		
		String[] s1 = s.split("@");
		System.out.println(Arrays.toString(s1));
		
		for (int i = 0;i < s1.length;i++) {
			String s2 = s1[i];
			char[] ch = new char[s2.length()];
			int num = 0;
	    for (int a = s2.length()-1;a >= 0; a-- ) {
	    	ch[num] = s2.charAt(a);
	    	num++;
	    	
	    }
		System.out.println(Arrays.toString(ch));
		String name = new String(ch);
		if (name.equals(s2)) {
			System.out.println(s2 +" "+ "is polindrome");
		}else System.out.println(s2+" " +"is not polindrome");
		}
 
	}
	
}
