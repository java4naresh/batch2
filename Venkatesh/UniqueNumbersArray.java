import java.util.*;
class UArray
{
  public static void main(String[] args)
{
int[] numbers = {1,2,3,5,3,7,2,9};
int[] uniqueNumbers=null;
int index = 0;
for(int i=0; i<numbers.length; i++){
int count=0;
for(int j=0; j<numbers.length; j++){
if(numbers[i]==numbers[j]) count++;
}
if( count == 1){
if(uniqueNumbers != null){
int [] tempArr=uniqueNumbers;
uniqueNumbers=new int[uniqueNumbers.length+1];
for(int k=0; k<tempArr.length; k++){
uniqueNumbers[k]=tempArr[k];
}
uniqueNumbers[uniqueNumbers.length-1]=numbers[i];
}else{
uniqueNumbers=new int[i];
uniqueNumbers[0]=numbers[i];

   }

 }

}
  System.out.println(Arrays.toString(uniqueNumbers));

   }


 }