public class Book{
  String name;
  int price;
// author details
    Author auther;
    public Book(String n,int p,Author aut){
    name = n;
    price=p;
   auther  = aut;
  
  }
  public static void main(String args[]){
  Author a=new Author ("jhon",42,"usa");
  Book b = new Book("java for begginers",800,a );
  System.out.println("book name is :"+ b.name);
  System.out.println("price of book :" + b.price);
  System.out.println("author details is ");
  System.out.println("author name is:"+ b.auther.authorname);
  System.out.println("author age is :"+ b.auther.age);
  System.out.println("author place is :"+ b.auther.place);
  }
}