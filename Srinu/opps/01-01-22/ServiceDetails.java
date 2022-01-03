public class ServiceDetails 
{
	public String type;
	public float amount;

	 ServiceCenter serviceCenter;
	
	public ServiceDetails(String type,float amount,ServiceCenter serviceCenter){
		
		this.type = type;
		this.amount = amount;
		this.serviceCenter = serviceCenter;
     
	}
public String toString(){
	
	return "ServiceDetails[type="+type+", amount="+amount+",serviceCenter="+serviceCenter+"]";
}

}
