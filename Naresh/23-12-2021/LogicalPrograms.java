class  LogicalPrograms
{
	public static void main(String[] args) 
	{
      LogicalPrograms lp = new LogicalPrograms();
		//String results = lp.isowel('e');
		//System.out.println(results);
        //String results1 = lp.armstrong(153);
		//System.out.println(results1);
		//String results2 = lp.percentage(75.0f);
		//System.out.println(results2);
		String results3= lp.switchTest(5);
		System.out.println(results3);
		  //lp.star(6);
		
	
		
	} 
public String isowel(char input){
    char word= input;
if(word == 'a' || word=='e' || word =='i' || word=='o' || word=='u'){

return ("owel");

} else{
  return ("not owel");
   }
}

public String armstrong(int input){

    int num = input;
	 int tem = num;
	int rem = tem%10;//0
	 tem = tem/10;//37
	int armstrong = rem*rem*rem;
	while(tem!=0){
	rem = tem%10;//7
	 tem = tem/10;//3
   armstrong = armstrong+(rem*rem*rem);
	}
	
     if( num == armstrong){
		return ("armstrong");
	   }
      else {
		return ("not armstrong");
	  }
	 }
	/*public String percentage(float input){
      float percentage = input;
       String name = "gopinadh";

     if(percentage>70){
      return (name+" "+"got first class");
	 } if(percentage>60 && percentage<70){
           return (name+" "+"got second class");
		 } if(percentage>50 && percentage<60){
            return (name+" "+"got third class");
		   } if(percentage>40 && percentage<50){
               return (name+" "+"got fourth class");
			 } if (percentage<40){
                return (name+" "+"failed");
			   }
	 }*/
    public String switchTest(int input) {
       int num = input;

switch(num){

case 1:
      return ("sunday");
case 2:
      return ("monday");

case 3 :
      return ("TUE day");

case 4 :
      return ("WED day");

case 5 :
      return ("THU day");

case 6 :
      return ("FRI day");

case 7 :
      return ("SAT day");

default:
     return ("invaliti");

}

}
    public void star( int input){
     for(int i=1;i<input;i++) {
		  for(int j=5;j>0;j--) {
		  if(i>=j){
			System.out.print("*");
		  }	else {
			System.out.print(" ");
		  }
		}
          System.out.print("\b");
         for(int k=1;k<6;k++) {
		  if(i>=k){
			System.out.print("*");
		  }	else {
			System.out.print(" ");
		  }
		}

         System.out.println();
	  
     }
  }  

}


