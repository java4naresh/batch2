class LogicalPrograms
{
  public static void main(String[] args)
{
 LogicalPrograms lp = new LogicalPrograms();
long result = lp.findFactorial(5l);
System.out.println(result);
long result2 = lp.findFactorial(10l);
System.out.println(result2);
}
  public long findFactorial(long input){
long fact= 1;
for(int i=1;i<=input;i++){
fact = fact*i;
}
  return fact;

  }

 } 