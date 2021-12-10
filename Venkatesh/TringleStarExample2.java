class TringleStarExample2
{
public static void main(String[] args)
{
for(int i=1; i<6; i++){
for(int k=1; k<6; k++){
if(i<=k){
System.out.print("*");
}else{
System.out.print(" ");
 
  }
 
 }
System.out.print("\b");
for(int j=5; j>0; j--){
if(j>=i){
System.out.print("*");
}else{
System.out.print(" ");
  }
 
 }
System.out.println();

   }
 
 }

}