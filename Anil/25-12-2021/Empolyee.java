public class Empolyee {
	String name ;
	String id;
	int salary;
	Address add;
	Empolyee(String n,String i,int sa){
		name= n;
		id= i;
		salary = sa;
	}
	public static void main(String args[]) {

		   Address ad = new Address("anil","m1078546",55000,'m',5.99f);
		   
		Empolyee e= new Empolyee("yashna","m1078546",8000,ad);
		   System.out.println(e.name+ ""+ e.id+ ""+e.salary); 
	}

}
