package wrapperclasses;

public class RegistrationClient {

	public static void main(String[] args) {
		/*RegistrationForm rf = new RegistrationForm();
		System.out.println(rf);
		rf.setName("Naresh");
		rf.setAge(30);
		System.out.println(rf);*/
		Integer num = 10; //literal
		String strNumber = "100";
		Integer num2 = new Integer(strNumber);//object creation
        Float f = new Float(strNumber);
        Double d = new Double(strNumber);
        Long l = new Long(strNumber);
        //Character c = new Character(strNumber);
        //int asc = Character.getNumericValue(65);
        //char[] ch = {'A','B', 'C', 'E'};
        //System.out.println((char)Character.codePointAt(ch, 2));
        //String s = new String
        //System.out.println(Character.compare('a', 'c'));
        System.out.println(Character.isDigit('g'));
        Integer i = Integer.parseInt(strNumber);
        Float fl = Float.parseFloat(strNumber);
        //System.out.println(i);
        //System.out.println(l);
        //System.out.println(d);
        //System.out.println(f);
		//System.out.println(num);
        //System.out.println(num2);
        int nu = 100;
        String number = Integer.toString(nu);
        //System.out.println(number);
	}
	
}
