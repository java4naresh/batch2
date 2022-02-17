package stringBuffer_stringBuilder;

public class Examples {

	public static void main(String[] args) {
		
		String name = "Kambala";
		//String name2 = name.concat("Gopi");
		name.concat("Gopi");
		System.out.println(name);
		StringBuffer sb = new StringBuffer("Kambala");
		sb.append("Gopi");
		System.out.println(sb.codePointAt(10));
		//System.out.println(sb);
		//sb.insert(0, 45);
		//sb.reverse();
		System.out.println(sb.substring(3));
		
		//System.out.println(sb);
		StringBuilder sbd = new StringBuilder("K");
		//sbd.append("Gopi");
		sbd.reverse();
		System.out.println(sbd);
		StringBuilder sbd1 = new StringBuilder("G");
		sbd.compareTo(sbd1);
		System.out.println(sbd.compareTo(sbd1));
		System.out.println(sbd1.equals(sbd1));
		
		

	}

}
