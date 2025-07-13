import java.util.*;

public class StackEg1{
	public static void main(String args[]){
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("After pushing elements "+stack);
		System.out.println("Top element "+stack.peek());
		System.out.println("Pop element "+stack.pop());
		System.out.println("Stack after Popping "+stack);
		System.out.println("Its Empty"+stack.isEmpty());
		int position=stack.search(20);
		if(position !=-1){
			System.out.println("Position "+position);
		}
		else{
			System.out.println("20 is not present in stack");
		}
		while(!stack.isEmpty()){
			System.out.println("Pop element "+stack.pop());
		}
		System.out.println("After pop all element"+stack);
		System.out.println("Is stack is empty now"+stack.isEmpty());
	}
}