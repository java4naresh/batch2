package stringBuffer_stringbuilder;

public class Examples {

	public static void main(String[] args) {

		String name = "Naresh";
		name.concat(" Kambala");
		System.out.println(name);//Naresh
		StringBuffer sb = new StringBuffer("Naresh");
		sb.append(" Kambala");
		System.out.println(sb);//Naresh Kambala
		//sb.reverse();
		//System.out.println(sb);
		StringBuilder sb2 = new StringBuilder("Naresh");
		sb2.append(" Kambala");
		System.out.println(sb2);
		
	}

}
