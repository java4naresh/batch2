package interface1;

public class AXIS implements Bank {
	public double homeLoanIntersetRate () {
		double minimum = 7.20;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	}
   public  double goldLoanIntersetRate () {
	   double minimum = 9.0;
		double profit = 1.0;
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+profit+gst+ processingfFee;
		
	   
    	
    }
  public   double personalLoanIntersetRate () {
	  double minimum = 10.49;
			double profit = 1.0;
			double gst = 0.18;
			double processingfFee = 0.5;
			return minimum+profit+gst+ processingfFee;
			
    }
   public  double cropLoanIntersetRate () {
	   double minimum =3.0;
	 		double profit = 1.0;
	 		double gst = 0.18;
	 		double processingfFee = 0.5;
	 		return minimum+profit+gst+ processingfFee;
	 		
    }
   public double depositIntersetRate () {
	   double minimum =4.0 ;
		
		double gst = 0.18;
		double processingfFee = 0.5;
		return minimum+gst+ processingfFee;
   }
    public  double minimumBalanceIntersetRate () {
    	  double minimumBalance = 5000;
  		return minimumBalance;
    }
	
}
