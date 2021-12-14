class LogicalOperatorTest{
public static void main(String[] args){

      int num1 = 14;
      int num2 = 21;
      /* if(num1%2 == 0 && num2%2==0){
      System.out.println("given numbers are even");

       }  else {
          System.out.println("given numbers are not even");

         }*/

      /* if(++num1==14 && num2++==21){
         System.out.println("numbers are equval"); 
         }  else {
           System.out.println("numbers are not equval");
         }
          System.out.println(num1);
          System.out.println(num2);*/
          
           if(num1++==14 || num2++==21){
         System.out.println("numbers are equval"); 
         }  else {
           System.out.println("numbers are not equval");
         }
          System.out.println(num1);
          System.out.println(num2);





}


}