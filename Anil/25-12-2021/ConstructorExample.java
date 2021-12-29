class ConstructorExample{
  int number;
   String name;
   float percentage; 
   char r;
   ConstructorExample(int num, String na,float p,char R){

    number = num;
    name= na;
    percentage = p;
      r = R;
}
    public static void main(String args[]){
      ConstructorExample ce= new ConstructorExample(56,"anil",5.66f, 'm');
          System.out.println(ce.name +" " +ce.number +" "+ ce.percentage + " "+ce.r);
    }
   }