package dataStructures;
import java.util.Stack;

import org.openjdk.jol.info.ClassLayout;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack1 = new Stack();
		
		
		for(int i=0; i<20; i++) {
			stack1.push(i); //pushes into the stack
			
		}

		System.out.println(stack1);
		
		for(int i =0; i<stack1.size(); i++) {
			
		}
		
		System.out.println(stack1.pop()); // returns the top element of stack and removing it in the process
		System.out.println(stack1.empty());// checks if the stack is empty
		System.out.println(stack1.peek());//returns the top element
		System.out.println(stack1.search(18));// searches the element in stack. if found index returned or -1 returned
		
	}

}
