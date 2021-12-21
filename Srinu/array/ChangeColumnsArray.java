import java.util.*;
class ChangeColumnsArray
{
	public static void main(String[] args) 
	{ 
		int[][] ch={{1,2,3,4,5,},{6,7,8,9,10},{11,12,13,14,15}};
		System.out.println(Arrays.toString(ch[0]));
		System.out.println(Arrays.toString(ch[1]));
		System.out.println(Arrays.toString(ch[2]));
		System.out.println("=================");
	/*	for (int i=0;i<ch.length;i++)
		{
			for (int a=0;a <ch[i].length;a++)
			{
				if (a==ch[i].length-2)
				{			int tem=0;

					tem=ch[i][a];
					ch[i][a]=ch[i][0];
					ch[i][0]=tem;
				}
		
		     }
			 
		}
    System.out.println(Arrays.toString(ch[0]));
	 System.out.println(Arrays.toString(ch[1]));
	  System.out.println(Arrays.toString(ch[2]));*/
	     for (int i=0;i<ch.length;i++) 
	  {
		  for (int a=0;a<ch[i].length;a++)
		  {
			 if (i==ch.length-1)//   
			  {
				  int tem=ch[i][a];
				  ch[i][a]=ch[0][a];
				  ch[0][a]=tem;


			  }
		  }
	  }
	   System.out.println(Arrays.toString(ch[0]));
	 System.out.println(Arrays.toString(ch[1]));
	  System.out.println(Arrays.toString(ch[2]));
		
	}
}
