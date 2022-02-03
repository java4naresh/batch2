package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesExample {

	public static void main(String[] args) {
		
		FilesExample fe = new FilesExample();
		/*try {
		fe.readFile("E:\\batch2\\javasrinu\\srinujava\\src\\files\\simple.txt");
		}catch (IOException e) {
			e.printStackTrace();
		}*/
		try {
			fe.readFile1("E:\\batch2\\javasrinu\\srinujava\\src\\files\\simple.txt");
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void readFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		/*char ch = (char) fr.read();
		System.out.println(ch);*/
		
		int numchar;
		while(( numchar = fr.read()) !=-1) {
			System.out.print((char)numchar);
		}
	
	}
	public void readFile1(String fileName1) throws IOException {
		File file = new File(fileName1);
		FileReader fr = new FileReader(file);
		/*char ch = (char) fr.read();
		System.out.println(ch);*/
		int numchar;
		for (numchar = fr.read(); numchar!= -1; numchar = fr.read())  {
			System.out.print((char)numchar);
		}
	}
}
