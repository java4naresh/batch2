package com.srinu.package2;
class Village
{
	String name;
	String mandal;
	String dist;
	String state;
	int pincode;

	public static void main(String[] args) 
	{
		Village v=new Village();
		System.out.println(v.hashCode());//stored area
		v.name="kistapuram";
		v.mandal="chinthalapalam";
		v.dist="suryapet";
		v.state="telangana";
		v.pincode=508246;
		System.out.println(v.name);
		System.out.println(v.mandal);
		System.out.println(v.dist);
		System.out.println(v.state);
		System.out.println(v.pincode);
		System.out.println(v);//total village
	}
}
