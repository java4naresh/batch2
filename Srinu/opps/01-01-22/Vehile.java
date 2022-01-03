public class Vehile
{
	public String type;
	public String name;
	public int model;
	public String brand;
   
     public Engine engine;

public Vehile(String type,String name,int model,String brand,Engine engine){

this.type = type;
this.name = name;
this.model = model;
this.brand = brand;
this.engine = engine;
	
}
public String toString(){
	
return "Vehile[type="+type+",name="+name+", model="+model+", brand="+brand+",engine="+engine+"]";
}		
	
}
