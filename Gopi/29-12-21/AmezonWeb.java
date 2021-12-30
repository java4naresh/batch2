class  AmezonWeb
{
	public static void main(String[] args) 
	{  
		StorysBook sb = new StorysBook("The Cat in The Hat","red",100,5.4f,30.3f,120);
		Books b = new Books("NOVELS","k Gopinadh",sb);
		System.out.println(b);
	}
}
