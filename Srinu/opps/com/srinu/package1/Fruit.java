package com.srinu.package1;
class Fruit 
{
	String name;
	String color;
	String taste;
	char isDameged;
		
	public static void main(String[] args) 
	{
		Fruit f =new Fruit();
       	System.out.println(f.hashCode());
	   f.name="banana";
	   f.color="yellow";
	   f.taste="sweet";
       f.isDameged='n';
		System.out.println(f.name);
	    System.out.println(f.color);
		System.out.println(f.taste);
		System.out.println(f.isDameged);
        System.out.println(f);
	}
}
