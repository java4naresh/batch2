package stringClass;

import java.util.Arrays;

public class RevarsOfStringName {

	public static void main(String[] args) {
		String name = "";
		System.out.println(name.length());
		char[] chars = new char[name.length()];
		int num = 0;
		for(int i=name.length()-1;i>=0;i--) {
		
			chars[num]= name.charAt(i); 
		num++;
		
		}
		
		System.out.println(Arrays.toString(chars));
		String name2 = new String(chars);
		System.out.println(name2);

		if(name.equals(name2)) {
			System.out.println(name+" "+"is polindrome");
		} else {
			System.out.println(name+" "+"is not polindrome");
		}
	}

}
