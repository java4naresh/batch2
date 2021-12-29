public class Phone 
{

   public String imeiNumber1;

   public String imeiNumber2;

   public String brand;

   public String model;

   public Sim sim;

   public Phone(String imeiNumber1, String imeiNumber2, String brand, String model, Sim sim) {
   this.imeiNumber1 = imeiNumber1;
   this.imeiNumber2 = imeiNumber2;
   this.brand = brand;
   this.model = model;
   this.sim = sim;
   }

   public String toString() {
   return "Phone[imeiNumber1="+imeiNumber1+", imeiNumber2="+imeiNumber2+", brand="+brand+", model="+model+", sim="+sim+"]";
   }

	
}
