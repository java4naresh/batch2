import java.util.*;
class uniquenumber 
{
	public static void main(String[] args) 
	{
          uniquenumber un=new uniquenumber ();
		  un.uniquenum(int[] new {1,2,3,4,5,6,1,2,3,})
		System.out.println(Arrays.toString(uniquenum));
	}
	int[] uniquenum(int[] numbers){
		int[]uniquenum=null;
		int index=0;
		for (int i=0;i<uniquenum.length;i++)
		{
			int count=0;
			for (int a=0;a<uniquenum.length;a++)
			{
				if (uniquenum[i]==uniquenum[a]) count++;
				
			}
			if (count==1)
			{
				if (uniquenum !=null)
				{
                  int[] tem=uniqueCh;
				  uniquenum=new int[uniquenum.length+1];
                     for (int j=0;j<tem.length;j++)
                     {
						uniquenum[j]=tem[j];
                     }
						 uniquenum[uniquenum.length-1]= uniquenum[i];
				}
				else{
					uniquenum=new int[1];
					uniquenum[0]=uniquenum[i];
				}
			}
			return uniquenum;
		}
		
	}
		
}
