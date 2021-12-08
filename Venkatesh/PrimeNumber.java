class PrimeNumer{
public static void main(String[] args)
{
  int number = 9;
  boolean flag =true;
for(int i=2;i<number;i++){
if (number % i==0){
flag=false;
break;
}
}
if(flag){
System.out.println( number+" is prime");
}else{
System.out.println( number+" is not prime");
}
}
}