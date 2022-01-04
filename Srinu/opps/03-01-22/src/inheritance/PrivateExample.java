package inheritance;

public class PrivateExample {
	  private String name;
      private long num;
      
    private PrivateExample (String name,long num) {
    	this.name = name;
    	this.num = 9010432734l;
    	System.out.println(name+" "+num);
    }
     
      private static void sum(int num1,int num2) {
    		 int add = num1+num2;
    		 System.out.println(add);
      }
}

