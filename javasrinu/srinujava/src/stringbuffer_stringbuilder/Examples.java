package stringbuffer_stringbuilder;

public class Examples {

	public static void main(String[] args) {

		String name = "srinu";
		name.concat( "thirumalasetti");
		System.out.println(name);
		String name1 = "srinu";
		StringBuffer sb = new StringBuffer(name1);//not synchronized
		//sb.append(" "+"thirumalesetti");
  
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		if( name1.contentEquals(sb)) {
			System.out.println(name1+" "+"is polindrome");
		}else System.out.println(name1+" "+ " is not polindrome");
		
	    String s ="amma";
		StringBuilder su = new StringBuilder(s);//synchronized
		//su.append(" "+"Thirumalasetti");
		
		System.out.println(su);
		su.reverse();
		
		System.out.println(su);
	  
	  if( s.contentEquals(su)) {
			System.out.println(s+" "+"is polindrome");
		}else System.out.println(s+" "+ " is not polindrome");

	}
}
