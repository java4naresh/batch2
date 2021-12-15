import java.util.*;
class  ArrayTest4
{
  public static void main(String[] args)
{
  int[] numbers=new int[200];
System.out.println(Arrays.toString(numbers));
for(int i=0;i<numbers.length;i++)
{
numbers[i]=i+1;
}
System.out.println(Arrays.toString(numbers));

   }

 }