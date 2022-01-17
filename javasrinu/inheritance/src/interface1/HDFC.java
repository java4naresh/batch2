package interface1;

public class HDFC implements Bank {
	
	public double homeLoanIntersetRate () {
		double minimum = 6.5;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	}
   public  double goldLoanIntersetRate () {
	   double minimum = 4.5;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	   
    	
    }
  public   double personalLoanIntersetRate () {
	  double minimum = 12.0;
			double profit = 1.0;
			double gst = 0.18;
			double processingfFee = 0.5;
			return minimum+profit+gst+ processingfFee;
			
    }
   public  double cropLoanIntersetRate () {
	   double minimum =2.0;
	 		double profit = 1.0;
	 		double gst = 0.18;
	 		double processingfFee = 0.5;
	 		return minimum+profit+gst+ processingfFee;
	 		
    }
   public double depositIntersetRate () {
	   double minimum =5.0 ;
		
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+gst+ processingfFee;
   }
    public  double minimumBalanceIntersetRate () {
    	  double minimumBalance = 10000;
  		return minimumBalance;
    }
	
}
