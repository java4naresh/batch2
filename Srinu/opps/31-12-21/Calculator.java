class Calculator  
{
	
public int sum(int... nums){//var args
	if (nums != null) 
	{  
		int sum = 0;

		for (int i=0; i<nums.length; i++)
		{ 
            sum = sum+nums[i];

		}
		   return sum;
		}
return 0;
}
public static int sub(int... nums){
	if (nums != null) 
	{  
		int sub = 0;

		for (int i=0; i<nums.length; i++)
		{ 
            sub = nums[0]-nums[1];

		}
		   return sub;
		}
       return 0;

}
public static long multiplicatin(int... nums){
 if (nums !=null)
 {
int mult = 1;
for (int i=0;i<nums.length;i++)
{
	mult = mult*nums[i];
}
return mult;
 }	


return 0;

}
public  int multi(int... nums){
 if (nums !=null)
 {
int mult = 1;
for (int i=0;i<nums.length;i++)
{
	mult = mult*nums[i];
}
return mult;
 }	


return 0;

}

}
