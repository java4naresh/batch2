package casting;

public class CastingClient {
	
	public static void main(String[] args) {
		
		
		Super s =  new Sub();//up casting
		Sub sub = (Sub) s;//down casting
	//	Sub sub1 = new Super//not possible
		System.out.println(s.name);
		System.out.println(s.address);
        System.out.println(s.phone);
        System.out.println(s.currentAddress);
        System.out.println(sub.name);
		System.out.println(sub.address);
        System.out.println(sub.phone);
        System.out.println(sub.currentAddress);
      
        System.out.println(sub.salary);
		System.out.println(sub.jobType);
        System.out.println(sub.desination );
        System.out.println(sub.companyName);
        
        
      /*  System.out.println(s.salary);
		System.out.println(s.jobType);
        System.out.println(s.desination );
        System.out.println(s.companyName);*/
        
        
        
       
		}

}
