package interface2;

import interface1.*;

public class TraiClient {

	public static void main(String [] args) {
		
		Trai airtel = new Airtel();
		System.out.println("Airtel");
		System.out.println("incomingCalCharge = "+airtel.incomingCalCharge());
		System.out.println("outGoingCalCharge = "+airtel.outGoingCalCharge());
		System.out.println("smsCharge = "+airtel. smsCharge());
		System.out.println("internetCharge = "+airtel. internetCharge());
		System.out.println("unlimitedCals  = "+airtel. unlimitedCals ());
		System.out.println("=======================");
		
		Trai idea = new IDEA ();
		
		System.out.println("Idea");
		System.out.println("incomingCalCharge = "+idea.incomingCalCharge());
		System.out.println("outGoingCalCharge = "+idea.outGoingCalCharge());
		System.out.println("smsCharge = "+idea. smsCharge());
		System.out.println("internetCharge = "+idea. internetCharge());
		System.out.println("unlimitedCals  = "+idea. unlimitedCals ());
		System.out.println("=======================");
		
		Trai bsnl = new BSNL();
		System.out.println("BSNL");
		System.out.println("incomingCalCharge = "+bsnl.incomingCalCharge());
		System.out.println("outGoingCalCharge = "+bsnl.outGoingCalCharge());
		System.out.println("smsCharge = "+bsnl. smsCharge());
		System.out.println("internetCharge = "+bsnl. internetCharge());
		System.out.println("unlimitedCals  = "+bsnl. unlimitedCals ());
		
		
}
}