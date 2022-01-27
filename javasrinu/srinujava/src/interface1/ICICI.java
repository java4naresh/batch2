package interface1;

public class ICICI implements Bank {
	public double homeLoanIntersetRate () {
		double minimum =7.0;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	}
   public  double goldLoanIntersetRate () {
	   double minimum = 10.0;
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
	   double minimum =2.2;
	 		double profit = 1.0;
	 		double gst = 0.18;
	 		double processingfFee = 0.5;
	 		return minimum+profit+gst+ processingfFee;
	 		
    }
   public double depositIntersetRate () {
	   double minimum =4.9 ;
		
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+gst+ processingfFee;
   }
    public  double minimumBalanceIntersetRate () {
    	  double minimumBalance = 5000;
  		return minimumBalance;
    }
	
}
