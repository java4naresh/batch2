class Employee 
{
	String name;
	char gender;
	String designation;
	String empId;
     
	Address add;

	public  Employee(String nm,char gen,String des,String id,Address ad){
		name=nm;
		gender=gen;
		designation=des;
		empId=id;
		add=ad;
	}

	public static void main(String[] args) 
	{   Address add=new Address("kp","kpm","kistapuram","chinthalapalam","suryapet","telangana",508246);
		Employee em =new Employee ("Srinivas",'M',"javadovepler","152STN",add);
		System.out.println(em.name+" "+em.gender+" "+em.designation+" "+em.empId+" "+em.add.adderss1+" "+em.add.adderss2+" "+em.add.village+" "+em.add.mandal+" "+em.add.dist +" "+ em.add.state+" "+em.add.pincode+" "+em.add.country);
	   Employee em1=new Employee ("anil",'M',"javadovepler","123SDS",add);
		System.out.println(em1.name+" "+em1.gender+" "+em1.designation+" "+em1.empId+" "+em1.add.adderss1+" "+em1.add.adderss2+" "+em1.add.village+" "+em1.add.mandal+" "+em1.add.dist +" "+ em1.add.state+" "+em1.add.pincode+" "+em1.add.country);
	}

}
