import java.util.*;
class DuplicateArray
{
  public static void main(String[] args)
{
int [] numbers={1,2,3,5,6,3,8,9};
int[] uniqueNumbers= new int[numbers.length];
int index=0;
for(int i=0; i<numbers.length; i++){
int count=0;
for(int j=0; j<numbers.length; j++){
if(numbers[i] == numbers[j]) count++;
}
if(count == 1){
uniqueNumbers[index]=numbers[i];
index++;
}
}
 System.out.println(Arrays.toString(uniqueNumbers));


   }

 }
 
