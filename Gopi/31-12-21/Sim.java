class Sim
{
	String simNumber;
	String type;
	String broadBand;
	String number;

	public Sim(String simNumber,String type,String broadBand,String number){
	this.simNumber = simNumber;
	this.type = type;
	this.broadBand = broadBand;
	this.number = number;
	}

	public String toString(){
		return "sim[simNumber="+simNumber+",type="+type+",broadBand="+broadBand+",number="+number+"]";
	}

	 public String call(int... number) {
	if(number != null && number.length >= 10) return "calling";
	return "Invalid Number";
	}
}
