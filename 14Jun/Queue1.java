import java.util.*;

public class Queue{
	public static void main(String args[]){
		Queue<Integer> q=new LinkedList<>();
		q.add(30);
		q.add(3);
		q.add(5);
		q.add(10);
		System.out.println("The elements are "+q);
		System.out.println("First element "+q.peek());
		System.out.println("Remove element "+q.remove());
		System.out.println("First element "+q.peek());
		System.out.println("Poll element "+q.poll());
		System.out.println("Size of Queue "+q.size());
	}
}