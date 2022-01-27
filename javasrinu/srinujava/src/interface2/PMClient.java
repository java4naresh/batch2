package interface2;

import interface1.*;

public class PMClient {

	public static void main(String[] args) {
		
		Primeministar pm = new TS();
		pm.pmKisanScheme();
		pm.pensionsForStates();
		pm. CMName();
		pm.DGPName();
		Primeministar pm1 = new AP();
		pm1.pmKisanScheme();
		pm1.pensionsForStates();
		pm1. CMName();
		pm1.DGPName();
		TS ts = new TS();
		ts.pmKisanScheme();
		ts.pensionsForStates();
		ts. CMName();
		ts.DGPName();
		AP ap = new AP();
		ap.pmKisanScheme();
		ap.pensionsForStates();
		ap. CMName();
		ap.DGPName();
		
	}
}
