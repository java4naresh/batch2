import java.util.*;
class IntDuplicate 
{
	public static void main(String[] args) 
	{
		int[] ch={1,2,3,4,5,1,2,3,6,7};
       int index=0;
	    int uniqueCh[]=new int [ch.length];
	
		for (int i=0;i<ch.length;i++ )
		{  
			int count=0;
			for (int a=0;a<ch.length;a++)
			{
		     if (ch[i]==ch[a]) count++;
			}
			if (count==1)
			{
				uniqueCh[index]=ch[i];
				index++;
			}
			
			}
        System.out.println(Arrays.toString(uniqueCh));

			

			}
			
		}
		
	



