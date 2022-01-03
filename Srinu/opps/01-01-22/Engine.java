public class Engine 
{
	public String type;
	public String engineNum;
	public int capacity;
	public String choiceNum;
	public int cc;
	
	public Engine (String type,String engineNum,int capacity, String choiceNum,int cc ){
		
   this.type = type;
   this.engineNum = engineNum;
   this.capacity = capacity;
   this.choiceNum =  choiceNum;
   this.cc = cc;
	}
	public String toString (){
	
		return "Engine[type="+type+", engineNum="+engineNum+", capacity="+capacity+", choiceNum="+choiceNum+", cc="+cc+"]" ;

	}
}
