package createdFile;

import java.io.File;

public class CreatFolder extends RuntimeException {

	public  CreatFolder(String getMessage) {
		super(getMessage);
	}
	
	public void getName(String name) {
		if(name != null && !name.equals("gopinadh") ) throw new CreatFolder("name is not gopinadh") ;
			System.out.println(name);
		
	}
	
	
	public static void main(String[] args) {
		
		 CreatFolder cf = new  CreatFolder("Srinu");
		 cf.getName("Krishna");

	}

}
