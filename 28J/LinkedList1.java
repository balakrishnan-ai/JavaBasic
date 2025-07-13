import java.util.*;

public class LinkedList1{
	public static void main(String args[]){
		LinkedList<String> linkedlist=new LinkedList<>();
		linkedlist.add("Java");
		linkedlist.add("Python");	
		linkedlist.add("C");
		System.out.println("Display elements"+linkedlist);
		linkedlist.add(1,"JavaScript");
		linkedlist.addFirst("C#");
		System.out.println("Display elements"+linkedlist);
		linkedlist.remove("Python");
		linkedlist.removeFirst();
		System.out.println("Display elements"+linkedlist);
		String access1=linkedlist.get(1);
		System.out.println("Access Result"+access1);
		boolean containelements=linkedlist.contains("C++");
		System.out.println("Contain elements"+containelements);
	}
}