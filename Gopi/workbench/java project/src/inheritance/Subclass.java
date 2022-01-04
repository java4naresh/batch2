package inheritance;

public class Subclass extends  LogicalPrograms  {
	public int multifiction(int...nums){
		if(nums!= null){
		int mul = 1;
		for(int i=0;i<nums.length;i++){
			mul = mul*nums[i];
		}
		 return mul;
		}
		return  0;
	 }
	 public void doMulAndPrint(int...nums){
		
		 if(nums!= null){
		int mul = 1;
		for(int i=0;i<nums.length;i++){
			mul = mul*nums[i];
		}
		 System.out.println( mul);
		}
		
		}
	 
    

}
