class  StarTest1
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<6;i++){
		for(int j=5;j>0;j--){
		 if(i>=j){
			System.out.print("*");
		 } else{
			System.out.print(" ");
		 }
		}
		
        System.out.print("\b");
		
        for(int k=1;k<6;k++){
		 if(i>=k){
			System.out.print("*");
		 } else{
			System.out.print(" ");
		 }
		}
		System.out.println();
	     }
           //System.out.print(" ");
           
		    //System.out.print("\b");
            for(int a=2;a<6;a++){
		  
             for(int b=2;b<6;b++){
		       if(a<=b){
			   System.out.print("*");
		      } else{
			   System.out.print(" ");
		     }
		    }
           System.out.print("\b");
            for(int c=5;c>1;c--){
		     if(a<=c){
			    System.out.print("*");
		       } else{
		      	System.out.print(" ");
		          }
		      }

           System.out.println();
	     }
          
		//System.out.print(" ");
	}
}
