import java.util.*;
class ArrayAssendingTest
{
  public static void main(String[] args)
{
 int values[] = new int[5];
 values[0] = 6;
 values[1] = 12;
 values[2] = 3;
 values[3] = 8;
 values[4] = 22;
/*int temp=0;
for(int i=0; i< values.length; i++){
for(int j=i+1; j< values.length; j++){
if(values[i]< values[j]){
temp=values[i];
values[i] = values[j];
values[j]=  temp;

   }
  

}
  System.out.println(values[i]+",");

  }*/
int temp=0;
for(int i=0; i< values.length; i++){
for(int j=i+1; j< values.length; j++){
if(values[i]> values[j]){
temp=values[i];
values[i] = values[j];
values[j]=  temp;

   }
  

}
  System.out.println(values[i]+",");

  }
 }

}