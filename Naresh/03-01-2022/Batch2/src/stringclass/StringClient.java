package stringclass;

import java.util.Arrays;

public class StringClient {

	public static void main(String[] args) {

		//immutable
		/*String name = "Naresh";//literal
		String name2 = "Naresh";//literal
		String name3 = "Naresh Kambala";//literal
		System.out.println(name);//Naresh
		name = name.concat(" Kambala");
		System.out.println(name);//Naresh
		System.out.println(name2);
		if(name == name3) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		
		/*String name = "Naresh";//literal
		String name2 = new String("Naresh");//object creation
		String name3 = "Naresh";//literal
		String name4 = new String("Naresh");//object creation
		System.out.println(name);//Naresh
		System.out.println(name2);//Naresh
		if(name == name2) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		
		if(name  == name3) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
		
		if(name2  == name4) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		
		/*if(name.equals(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		
		/*String name = "AMMA";
		System.out.println(name.length());// 6
		
		 * char ch = name.charAt(2); System.out.println(ch);
		 
		char[] chars = new char[name.length()];
		System.out.println(Arrays.toString(chars));
		for (int i = 0; i < name.length(); i++) {
			chars[i] = name.charAt(i);// chars[2] = name.charAt(2);
		}
		String name2 = new String(chars);
		System.out.println(Arrays.toString(chars));*/
		
		/*String name = "Naresh";
		System.out.println(name);
		//name = name.toUpperCase();
		name = name.toLowerCase();
		System.out.println(name);*/
		
		//String name = "Naresh";
		//String name2 = "Naresh";
		/*char[] ch = name.toCharArray();
		System.out.println(Arrays.toString(ch));*/
		/*if(name.equals(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		
		/*if(name.equalsIgnoreCase(name2)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}*/
		// wap to sort given string array 
		//int result = name.compareTo(name2);
		//System.out.println(result);
		/*boolean flag = name.contains("re");
		System.out.println(flag);*/
		//boolean flag = name.endsWith("h");
		//boolean flag = name.startsWith("N");
		//System.out.println(flag);
		//String name = "Naresh Naresh";
		//int index = name.lastIndexOf('a');
		//System.out.println(index);
		//name = name.replaceFirst("sh", "SH");
		//name.
		//System.out.println(name);
		
		/*String s = "Naresh@Emp01@M@30@100000";
		String[] array = s.split("01");
		System.out.println(Arrays.toString(array));*/
		/*Employee emp = new Employee();
		emp.setName(array[0]);
		emp.setEmpId(array[1]);
		emp.setGender(array[2].charAt(0));
		emp.setAge(Integer.parseInt(array[3]));
		emp.setSalary(Long.parseLong(array[4]));
		System.out.println(emp);*/
		//String name = "Naresh-Jhansi-Anil-Venki-Srinu-Gopi";
		//["haresN", "ihansJ", "lniA", ""ienkV"]
		String name = "AmmA-Jhansi-nana-Venki-MadaM-Gopi";
		//name = name.substring(7);
		name = name.substring(0, 6);
		System.out.println(name);
		
	}

}
