import java.util.*;
class DuplicateArray1

  
{
	public static void main(String[] args) 
	{
		int [] num={1,2,3,4,5,6,1,3,2};
	 
	   int[] uniquenum=null;
		 int index=0;
		 for (int i=0;i<num.length;i++)
		 {
		 int count=0;
		 for (int a=0;a<num.length;a++)
		 {
			 if (num[i]==num[a]) count++;
			 

		 }if (count==1)
		 {
			 if (uniquenum !=null){
			 
				int[]temarr=uniquenum;
				 uniquenum=new int[temarr.length+1];
				 for (int j=0;j<temarr.length;j++)
				 {
					 uniquenum[j]=temarr[j];
				 }
            uniquenum[uniquenum.length-1]=num[i];
			 }else{
				
				uniquenum=new int[1];
				uniquenum[0]=num[i];
			 }
		 }
		 
		 }
		 System.out.println(Arrays.toString(uniquenum));
	}
}
