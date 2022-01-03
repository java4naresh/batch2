class Battery
{

       String batteryName;
       String type;
	   String capacity;
	   String cost;

      public Battery(String batteryName,String type,String capacity,String cost){
		  this.batteryName = batteryName;
		  this.type = type;
          this.capacity = capacity;
		  this.cost = cost;
		 }
	public String toString(){
		return "[batteryName="+batteryName+",type="+type+",capacity="+capacity+",cost="+cost+"]";
	}
}
