import java.util.*;
class DuplicateChar
{
 public static void main(String[] args)
{
 char[] chars={'V','E','N','V','E','N',};
 char uniqueChars=null;
 char index=0;
for(int i=0; i< chars.length; i++){
     int count=0;
for(int j=0; j< chars.length; j++);
if(chars[i] = chars[j]) count++;
}
 if(uniqueChars != null){
char[] tempArray=uniqueChars;
uniqueChars= newChar[uniqueChars.length+1];
for(int k=0; k< tempArray.length; k++){
uniqueChars[k] = tempArray[k];
}
uniquechars[uniqueChars.length-1]=Chars[i];
}else{
uniqueChars = new char[1];
uniqueChars[0] = chars[i];

   }

  }

}
  System.out.println(Arrays.toString(uniqueChars));

   }


 }




