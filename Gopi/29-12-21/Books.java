class  Books
{
	String Types;
	String publishers;
	StorysBook sb;

	public Books(String Types,String publishers,StorysBook sb){
	this.Types = Types;
	this.publishers = publishers;
	this.sb = sb;
	}

	public String toString(){
		return "book[Types="+Types+",publishers="+publishers+",sb="+sb+"]";

	}
	
}
