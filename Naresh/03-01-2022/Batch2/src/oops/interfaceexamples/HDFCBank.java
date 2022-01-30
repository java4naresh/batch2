package oops.interfaceexamples;

public class HDFCBank implements Bank {
	
	 public double homeLoanIntersetRate() {
		   double minimum = 6;
		   double profit = 1.5;
		   double gst = 0.18;
		   double processingFee = 0.5;
		   return minimum+profit+gst+processingFee;
	   }
		
		public double personalLoanIntersetRate() {
			   double minimum = 11.0;
			   double profit = 1.5;
			   double gst = 0.18;
			   double processingFee = 0.5;
			   return minimum+profit+gst+processingFee;
		}
		
		public double goldLoanIntersetRate() {
			   double minimum = 5.0;
			   double profit = 1.5;
			   double gst = 0.18;
			   double processingFee = 0.5;
			   return minimum+profit+gst+processingFee;
		}
		
		public double cropLoanIntersetRate() {
			   double minimum = 2.0;
			   double profit = 1.5;
			   double gst = 0.18;
			   double processingFee = 0.5;
			   return minimum+profit+gst+processingFee;
		}
		
		public double depositeInterestRate() {
			   double minimum = 5.0;
			   double gst = 0.18;
			   double processingFee = 0.5;
			   return minimum+gst+processingFee;
		}
		
		public double savingsAccountMinimumBal() {
			return 5000.0;
		}
}
