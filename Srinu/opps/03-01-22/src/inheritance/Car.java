package inheritance;

public class Car {
	
 public String name = "i1o";
 public int price = 300000;
 public int model = 2017;
 
 void saleCar() {
	 System.out.println("sale car");
	 
 }
}
 class Customer extends Car {
   public  String cName = "srinu";
void price (){
	
	System.out.println("final price 250000");
}

}

