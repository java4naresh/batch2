import java.util.*;
class ChangeColumnsChar 
{
	public static void main(String[] args) 
	{
		char[][] ch={{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
		 for (int i=0;i<ch.length;i++)
		 {
			 for (int j=0;j<ch[i].length;j++)
			 {if (j==ch[i].length-2)
			 {
			 
				 char tem=ch[i][j];
				 ch[i][j]=ch[i][0];
				 ch[i][0]=tem;
			 }
		 }
		 }
		System.out.println(Arrays.toString(ch[0]));
		System.out.println(Arrays.toString(ch[1]));
		System.out.println(Arrays.toString(ch[2]));
	}
}
