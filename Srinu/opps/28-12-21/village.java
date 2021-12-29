class Village 
{
	String name;
	String mandal;
	String dist;
	String state;
	int pincode;
	static String country;

     public Village(String village1,String mandal1,String dist1,String state1,int pincode1){
		name=village1;
        mandal=mandal1;
		dist=dist1;
		state=state1;
		pincode=pincode1;

     }
	public static void main(String[] args) 
	{
		Village.country="India";
		Village v=new Village ("kp","chinthalapalam","suryapet","telangana",508246);
		System.out.println(v.name+" "+v.mandal+" "+v.dist+" "+v.state+" "+v.pincode+" "+v.country);
		Village v1=new Village ("kmm","kmm","kmm","telangana",508246);
		System.out.println(v1.name+" "+v1.mandal+" "+v1.dist+" "+v1.state+" "+v1.pincode+" "+v1.country);
		v.name="kprm";
		v1.country="india";
     System.out.println(v.name+" "+v.mandal+" "+v.dist+" "+v.state+" "+v.pincode+" "+v.country);
     System.out.println(v1.name+" "+v1.mandal+" "+v1.dist+" "+v1.state+" "+v1.pincode+" "+v1.country);
	}
}
