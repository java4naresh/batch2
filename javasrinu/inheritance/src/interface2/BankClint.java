package interface2;

import interface1.*;


public class BankClint {

	public static void main(String [] args ) {
	Bank sbi = new SBI ();
	System.out.println("SBI Bank");
	System.out.println("homeLoanIntersetRate = "+sbi.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+sbi.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+sbi.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+sbi.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+sbi.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+sbi.minimumBalanceIntersetRate());
	System.out.println("========================================");
	Bank hdfc = new HDFC ();
	System.out.println("HDFC Bank");
	System.out.println("homeLoanIntersetRate = "+hdfc.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+hdfc.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+hdfc.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+hdfc.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+hdfc.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+hdfc.minimumBalanceIntersetRate());
	System.out.println("========================================");
	Bank icici = new ICICI ();
	System.out.println("ICICI Bank");
	System.out.println("homeLoanIntersetRate = "+icici.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+icici.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+icici.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+icici.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+icici.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+icici.minimumBalanceIntersetRate());
	System.out.println("========================================");
	Bank axis = new AXIS ();
	System.out.println("AXIS Bank");
	System.out.println("homeLoanIntersetRate = "+axis.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+axis.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+axis.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+axis.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+axis.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+axis.minimumBalanceIntersetRate());
	System.out.println("========================================");
	Bank apgvb = new APGVB();
	System.out.println("APGVB Bank");
	System.out.println("homeLoanIntersetRate = "+apgvb.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+apgvb.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+apgvb.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+apgvb.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+apgvb.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+apgvb.minimumBalanceIntersetRate());
	System.out.println("========================================");
	Bank baroda = new BankOfBaroda ();
	System.out.println("Bank of Baroda");
	System.out.println("homeLoanIntersetRate = "+baroda.homeLoanIntersetRate());
	System.out.println("goldLoanIntersetRate = "+baroda.goldLoanIntersetRate());
	System.out.println("personalLoanIntersetRate = "+baroda.personalLoanIntersetRate());
	System.out.println("cropLoanIntersetRate = "+baroda.cropLoanIntersetRate());
	System.out.println("depositIntersetRate = "+baroda.depositIntersetRate());
	System.out.println("minimumBalanceIntersetRate = "+baroda.minimumBalanceIntersetRate());
	
}
}