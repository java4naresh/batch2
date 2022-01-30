package Stringclass;

public class Stringclasses {
	

	public static void main(String[] args) {
		
		String name = "VENKATESH";
		String name2 = " VENKATESH";
		System.out.println(name);
		String name1 = new String("ASULA");
		System.out.println(name1);
		if(name==name2) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		if(name.equals(name1)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
			
		/*String Name = "Venkatesh";
		System.out.println(Name);
		//Name = Name.toUpperCase();
		Name = Name.toLowerCase();
		System.out.println(Name);*/
		//String Name = "Venkatesh";
		/*char[] ch = Name.toCharArray();
		System.out.println (Arrays.toString(ch));*/
		String Name2 = "venkatesh";
		/*if(Name.equals(Name2)) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}*/
		/*if(Name.equalsIgnoreCase(Name2)) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}*/
		/*Name2 = "Varna";
		int result = Name.compareTo(Name2);
		System.out.println(result);*/
		//boolean flag = Name.contains("a");
		//System.out.println(flag);
		/*boolean flag = Name.endsWith("sh");
		boolean flag = Name.startsWith("V");
		System.out.println(flag);*/
		String Name = "Venkatesh";
		int index = Name.indexOf('t');
		System.out.println(index);
		
		
		
		
	
		}
			
		}