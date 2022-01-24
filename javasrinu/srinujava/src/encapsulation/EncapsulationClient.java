package encapsulation;

public class EncapsulationClient {
	
	public static void main(String[] args) {
		
	
	
	  Son  s = new Son("t.h.r",55,5.9f,"srinu",25,5.5f);
	
	  // System.out.println(s.name);
	  // System.out.println(s.sName);
	  // System.out.println(s.age);
	  // System.out.println(s.sAge);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getHeight());
        System.out.println(s.getSName());
        System.out.println(s.getSAge());
        System.out.println(s.getSHeight());
        System.out.println(s);
        
        Daughter d = new Daughter("t.h.r",55,5.9f,"jhansi",27,5.4f);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        System.out.println(d.getHeight()); 
        System.out.println(d.getDName());
        System.out.println(d.getDAge());
        System.out.println(d.getDHeight());
        System.out.println(d);
}
}
