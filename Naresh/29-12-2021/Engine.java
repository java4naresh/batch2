class Engine 
{
	String type;
	String engineNumber;
	String cc;
	String capacity;
    String choiceNumber;
    
	public Engine(String type, String engineNumber, String cc, String capacity, String choiceNumber) {
	this.type = type;
	this.engineNumber = engineNumber;
	this.cc = cc;
    this.capacity = capacity;
    this.choiceNumber = choiceNumber;
	}

    public Engine(String engineNumber, String cc, String capacity, String choiceNumber) {
	this.engineNumber = engineNumber;
	this.cc = cc;
    this.capacity = capacity;
    this.choiceNumber = choiceNumber;
	}

	public String toString() {
		if(type != null){
	           return "Engine[type="+type+", engineNumber="+engineNumber+", cc="+cc+", capacity="+capacity+",choiceNumber="+choiceNumber+"]";
		} else return "Engine[engineNumber="+engineNumber+", cc="+cc+", capacity="+capacity+",choiceNumber="+choiceNumber+"]";
	}


}
