package stringClass;

import java.util.Arrays;

public class StringExamples {

	public static void main(String[] args) {
		String name = "Gopinadh";
		String name2 = "Ramu";
	//	int num= name.compareTo(name2);
		//System.out.println(num);
		/*name = name.toUpperCase();
		name = name.toLowerCase();
		char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		char[] chars = new char[name.length()];
		System.out.println(Arrays.toString(chars));*/
		/*if(name.equals(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		
		if(name.equalsIgnoreCase(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		
		
		
		
		
}

}
		
