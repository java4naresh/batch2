class Phone 
{
	String imeiNumber1;
	String imeiNumber2;
	String brand;
	String model;
	Sim sim;
	public Phone(String imeiNumber1,String imeiNumber2,String brand,String model,Sim sim){
		this.imeiNumber1 = imeiNumber1;
		this.imeiNumber2 = imeiNumber2;
		this.brand = brand;
		this.model = model;
        this.sim = sim;
	}
	public String toString(){
		return "phone[imeiNumber1="+imeiNumber1+",imeiNumber2="+imeiNumber2+",brand="+brand+",model="+model+",sim="+sim+"]";

	}
     public String dail(int...numbers){
		return sim.call(numbers);
     }



}
