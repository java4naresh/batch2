public class Sim 
{
	public String simNumber;
    public String type;
    public String broadBand;
    public String phoneNumber;

	public Sim(String simNumber, String type, String broadBand, String phoneNumber) {
	this.simNumber = simNumber;
    this.type = type;
    this.broadBand = broadBand;
	this.phoneNumber = phoneNumber;
	}

	public String toString() {
	return "Sim[simNumber="+simNumber+", type="+type+", broadBand="+broadBand+", phoneNumber="+phoneNumber+"]";
	}

    public String call(int... number) {
	if(number != null && number.length >= 10) return "calling";
	return "Invalid Number";
	}
	
}
