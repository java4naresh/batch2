import java.util.*;
class DuplicateArray2 
{
	public static void main(String[] args) 
	{
		char[] ch={'A','B','C','F','D','C','E','A'};
		char[]uniqueCh=null;
		int index=0;
		for (int i=0;i<ch.length;i++)
		{
			int count=0;
			for (int a=0;a<ch.length;a++)
			{
				if (ch[i]==ch[a]) count++;
				
			}
			if (count==1)
			{
				if (uniqueCh !=null)
				{
                  char[] tem=uniqueCh;
				  uniqueCh=new char[uniqueCh.length+1];
                     for (int j=0;j<tem.length;j++)
                     {
						 uniqueCh[j]=tem[j];
                     }
						 uniqueCh[uniqueCh.length-1]= ch[i];
				}
				else{
					uniqueCh=new char[1];
					uniqueCh[0]=ch[i];
				}
			}
		}
        
		System.out.println(Arrays.toString(uniqueCh));
	}
}
