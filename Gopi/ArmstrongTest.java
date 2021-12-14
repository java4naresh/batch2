class  ArmstrongTest
{
	public static void main(String[] args) 
	{ 
	
	int num = 1;
	 while(num<300){
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
		System.out.println(num+"is armstrong");
	 }
      else {
		System.out.println(num+"is not armstrong");
	  }
	num++;
	}
	}
}
