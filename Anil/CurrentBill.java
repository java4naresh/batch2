class CurrentBill{
  public static void main(String args []){
   
    int units = 250;
    double billpay =0;
    if (units<100){

     billpay =units*1.50;
     }
     else if (units >100){

     billpay = 100*1.50+(units-100)*2.50;
      }

      else if (units <300){
      billpay =100*1.50+200*2.50+(units-300)*3.50;
        }

      
       System.out.println(billpay +" " + "billpay is" );
      

      }
}


     
  