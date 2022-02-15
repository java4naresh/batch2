package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
	    stack.push("srinu");
	    stack.push("java");
	    stack.push("phython");
	    stack.add(1, "gopi");
        System.out.println(stack);   
        String course1  = stack.peek();
        System.out.println(course1);
        stack.pop();
        System.out.println(stack);
        stack.add("anil");
        System.out.println(stack);
        stack.get(0);
        System.out.println(stack.get(2));
       String firstElement =  stack.firstElement();
       System.out.println(firstElement);
       String lastElement = stack.lastElement();
       System.out.println(lastElement);
       Iterator<String> itr = stack.iterator();
       while(itr.hasNext()) {
    	   itr.next();
    	  System.out.println( itr.next());
       }
       
       
       
	}
	

}
