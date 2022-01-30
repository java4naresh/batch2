package oops.interfaceexamples;

public class TraiClient {

	public static void main(String[] args) {
       System.out.println("Airtel");
       Trai airtel = new Airtel();
       System.out.println("incoming charge:"+airtel.incomingCallCharge());
       System.out.println("outgoing charge:"+airtel.outgoingCallCharge());
       System.out.println("sms charge:"+airtel.smsCharge());
       System.out.println("internet charge:"+airtel.internetCharge());
       
       System.out.println("BSNL");
       Trai bsnl = new BSNL();
       System.out.println("incoming charge:"+bsnl.incomingCallCharge());
       System.out.println("outgoing charge:"+bsnl.outgoingCallCharge());
       System.out.println("sms charge:"+bsnl.smsCharge());
       System.out.println("internet charge:"+bsnl.internetCharge());
	}

}
