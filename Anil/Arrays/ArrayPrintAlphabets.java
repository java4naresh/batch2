

class ArrayPrintAlphabets{
public static void main(String args[]){
char []chars= new char[26];
		int index = 0;
		for (int i=65+25;i>64;i--) {
			chars[index]=  (char )i;
			System.out.println(chars[index]+ " ");
			index++;
}
}
}