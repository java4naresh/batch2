import java.util.*;
class CharDuplicate
{
 

	public static void main(String[] args) 
	{
		char[] ch={'A','B','C','D','E','F','G','A','B','C'};
              char index=0;
			char[] uniqueCh=new char[ch.length];

			for (int i=0;i<ch.length;i++)
			{
				int chars=0;
				for (int a=0;a<ch.length;a++)
			{
				if (ch[i]==ch[a]) chars++;
			
				
				}if (chars==1)
				{
					uniqueCh[index]=ch[i];
					index++;
				}
			}
	
			System.out.println(Arrays.toString(uniqueCh));
		
	}
}
