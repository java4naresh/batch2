package oops.interfaceexamples;

public class Airtel implements Trai {

    public double incomingCallCharge() {
    	return 100.0;
    }
	
	public double outgoingCallCharge() {
		return 200.0;
	}
	
	public double smsCharge() {
		return 10.0;
	}
	
	public double internetCharge() {
		return 500.0;
	}
}
