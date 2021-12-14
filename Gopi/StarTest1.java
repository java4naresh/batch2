class  StarTest1
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<6;i++){
			if(i<5){
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
		} 
		 
		   
            for(int a=1;a<6;a++){
		       
             for(int b=1;b<6;b++){
		       if(a<=b){
			   System.out.print("*");
		      } else{
			   System.out.print(" ");
		     }
		    
			 }  
           System.out.print("\b");
            for(int c=5;c>0;c--){
              
		     if(a<=c){
			    System.out.print("*");
		       } else{
		      	System.out.print(" ");
		          }
		      }
			   
           System.out.println();
	     }
				
	}
}
