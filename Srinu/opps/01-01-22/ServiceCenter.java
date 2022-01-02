public class ServiceCenter
{
	public String name;
	public String address1;
	public String address2;
	public String city;
	public String dist;
	public String state;
	public int pincode;

	 Vehile vehile;

	public ServiceCenter( String name,String address1,String address2,String city,String dist,String state,int pincode,Vehile vehile){
		
    this.name = name;
    this.address1 = address1;
	this.address2 = address2;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.vehile = vehile;
	}
	public String toString(){
		
    return "ServiceCenter[name="+name+",address1="+address1+",address2="+address2+",city="+city+",dist="+dist+",state="+state+",pincode="+pincode+",vehile="+vehile+"]";
	}
}
