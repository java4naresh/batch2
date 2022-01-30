package oops.interfaceexamples;

public class BankClient {

	public static void main(String[] args) {
		System.out.println("SBI");
        Bank sbi = new SBI();
        System.out.println("homeloan:"+sbi.homeLoanIntersetRate());
        System.out.println("personalLoan:"+sbi.personalLoanIntersetRate());
        System.out.println("goldLoan:"+sbi.goldLoanIntersetRate());
        System.out.println("cropLoan:"+sbi.cropLoanIntersetRate());
        System.out.println("deposit:"+sbi.depositeInterestRate());
        System.out.println("minimumBal:"+sbi.savingsAccountMinimumBal());
        System.out.println("HDFC");
        Bank hdfc = new HDFCBank();
        System.out.println("homeloan:"+hdfc.homeLoanIntersetRate());
        System.out.println("personalLoan:"+hdfc.personalLoanIntersetRate());
        System.out.println("goldLoan:"+hdfc.goldLoanIntersetRate());
        System.out.println("cropLoan:"+hdfc.cropLoanIntersetRate());
        System.out.println("deposit:"+hdfc.depositeInterestRate());
        System.out.println("minimumBal:"+hdfc.savingsAccountMinimumBal());
	}

}
