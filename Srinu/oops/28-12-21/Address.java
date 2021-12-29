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

	public Address(String add1,String add2,String vi,String md,String dt,String st,int pn){
		adderss1=add1;
		adderss2=add2;
		village=vi;
		mandal=md;
		dist=dt;
		state=st;
		pincode=pn;
	}
	
}
