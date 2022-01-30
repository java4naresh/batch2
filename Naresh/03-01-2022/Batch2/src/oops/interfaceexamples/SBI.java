package oops.interfaceexamples;

public class SBI implements Bank {
	
   public double homeLoanIntersetRate() {
	   double minimum = 5.6;
	   double profit = 1.0;
	   double gst = 0.18;
	   double processingFee = 0.5;
	   return minimum+profit+gst+processingFee;
   }
	
	public double personalLoanIntersetRate() {
		   double minimum = 10.0;
		   double profit = 1.0;
		   double gst = 0.18;
		   double processingFee = 0.5;
		   return minimum+profit+gst+processingFee;
	}
	
	public double goldLoanIntersetRate() {
		   double minimum = 4.0;
		   double profit = 1.0;
		   double gst = 0.18;
		   double processingFee = 0.5;
		   return minimum+profit+gst+processingFee;
	}
	
	public double cropLoanIntersetRate() {
		   double minimum = 1.0;
		   double profit = 1.0;
		   double gst = 0.18;
		   double processingFee = 0.5;
		   return minimum+profit+gst+processingFee;
	}
	
	public double depositeInterestRate() {
		   double minimum = 4.0;
		   double gst = 0.18;
		   double processingFee = 0.5;
		   return minimum+gst+processingFee;
	}
	
	public double savingsAccountMinimumBal() {
		return 1000.0;
	}
}
