class  Address
{
	String address1;
	String address2;
	String city;
	String state;
	int  pinCode;
	String country = "india";

	public Address(String address1,String address2,String city,String state,int pinCode){
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		}

		public String toString(){
			return "Address[address1="+address1+",address2="+address2+",city="+city+",state="+state+",pinCode="+pinCode+"]";
		}
}
