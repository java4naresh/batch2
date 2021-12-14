class LogicalOperatorTest
{
 public static void main(String[] args)
{
 int num1=16;
int num2=25;
/*if (num1%2 == 0  && num2%2 == 0){
System.out.println("Given numbers are Even");
}else{
 system.out.println("Given numbers are not Even");
   }*/

 /* if(++num1 == 1 && num2 ++ == 25){
System.out.println("numbers are equal");
}else{
 System.out.println("numbers are not equal");
}
  System.out.println(num1);
  System.out.println(num2);*/
if(num1++==16 || num2++==25){
 System.out.println("numbers are equal");
}else{
 System.out.println("numbers are not equal");
}
  System.out.println(num1);
  System.out.println(num2);
}
}

 




