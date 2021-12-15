import java.util.*;
class ArrayTest6
{
  public static void main(String[] args)
{
  int[] values = new int [5];
 values [0]=10;
 values [1]=7;
 values [2]=20;
 values [3]=4;
 values [4]=3;

   /*int highest = 0;
for(int i=0; i< values.length; i++){
if(highest < values[i]) highest= values[i];
}
System.out.println(highest);
}*/
   int lowest =20;
for(int i=0; i<values.length; i++){
if(lowest > values[i]) lowest=values[i];

}
  System.out.println(lowest);


    }
  
  }











