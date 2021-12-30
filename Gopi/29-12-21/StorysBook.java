class StorysBook 
{
	String name;
	String colour;
	int cost;
	float bklength;
	float weight;
	int noOfPages;
	public StorysBook(String name,String colour,int cost,float bklength,float weight,int noOfPages){
		this.name = name;
		this.colour = colour;
		this.cost = cost;
		this.bklength = bklength;
		this.weight = weight;
		this.noOfPages = noOfPages;
     }

     public String toString(){
		return "book[name="+name+",colour="+colour+",cost="+cost+",bklength="+bklength+",weight="+weight+",noOfPages="+noOfPages+"]";
     }
	
}
