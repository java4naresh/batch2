public class  Address
{
	public String adderss1;
	public String adderss2;
	public String mandal;
    public String village;
	public String state;
	public String dist;
	public int pincode;
	public static String country = "India";

	public Address(String adderss1,String adderss2,String village,String mandal,String dist,String state,int pincode){
		this.adderss1=adderss1;
		this.adderss2=adderss2;
		this.village=village;
		this.mandal=mandal;
		this.dist=dist;
		this.state=state;
		this.pincode=pincode;
	}
	public String toString(){
		
  return "Address[adderss1="+adderss1+",adderss2="+adderss2+",village="+village+",mandal="+mandal+",dist="+dist+",state="+state+",pincode="+pincode+"]"; 
	}
	
}
