package interface1;

public class APGVB implements Bank {

	public double homeLoanIntersetRate () {
		double minimum = 6.0;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	}
   public  double goldLoanIntersetRate () {
	   double minimum = 3.0;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	   
    	
    }
  public   double personalLoanIntersetRate () {
	  double minimum = 7.5;
			double profit = 1.0;
			double gst = 0.18;
			double processingfFee = 0.5;
			return minimum+profit+gst+ processingfFee;
			
    }
   public  double cropLoanIntersetRate () {
	   double minimum =1.5;
	 		double profit = 1.0;
	 		double gst = 0.18;
	 		double processingfFee = 0.5;
	 		return minimum+profit+gst+ processingfFee;
	 		
    }
   public double depositIntersetRate () {
	   double minimum =4.5 ;
		
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+gst+ processingfFee;
   }
    public  double minimumBalanceIntersetRate () {
    	  double minimumBalance = 0;
  		return minimumBalance;
    }
	
}
