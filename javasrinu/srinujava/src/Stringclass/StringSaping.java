package Stringclass;

import java.util.Arrays;

public class StringSaping {

	public static void main(String[] args) {
		
		String s = "Naresh-Jhansi-Anil-Venki-Gopi-Srinu";
		
		String[] s1 = s.split("-");
		System.out.println(Arrays.toString(s1));
		
		
		for(int i= 0;i<s1.length;i++) {
			
			String s2 = s1[i];
			
			char[] ch = new char[s2.length()];
		
		for (int a = 0;a < s2.length();a++ ) {
			
			ch[a] = s2.charAt(a);//
			if (a==s2.length()-1) {//
				char tem = ch[a];
				ch[a] = ch[0];
				ch[0] = tem;
				
			}
		}
			
		System.out.println(Arrays.toString(ch));
		String name = new String(ch);
		System.out.println(name);
		}
		
		
	}
}
