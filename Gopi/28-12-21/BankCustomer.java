class  BankCustomer
{
	String name;
	char gender;
	String bankname;
	String branch;
	String ifsc;
	//has a relation
	Address add;

	public  BankCustomer(String nm,char gen,String bn,String branch1,String ifsc1,Address add1){
		name = nm;
		gender = gen;
		bankname = bn;
		branch = branch1;
		ifsc = ifsc1;
		add = add1;
	}
	public static void main(String[] args) 
	{
		Address ad = new Address("Madipadu","Madipadu","Atchampeta","Guntur","A.P",522409);
		BankCustomer bc = new BankCustomer("Gopinadh",'m',"SBI","Atchampeta","SBIN00000128891",ad);
		System.out.println(bc.name+","+bc.gender+","+bc.bankname+","+bc.branch+","+bc.ifsc+","+bc.add.address+","+bc.add.address1+","+bc.add.mandal+","+bc.add.city+","+bc.add.state+","+bc.add.pincode+","+bc.add.country);
	    BankCustomer bc1 = new BankCustomer("Srinu",'m',"Andhra","Atchampeta","AD tfN00000128891",ad);
		System.out.println(bc1.name+","+bc1.gender+","+bc1.bankname+","+bc1.branch+","+bc1.ifsc+","+bc1.add.address+","+bc1.add.address1+","+bc1.add.mandal+","+bc1.add.city+","+bc1.add.state+","+bc1.add.pincode+","+bc1.add.country);
	
	}

}
