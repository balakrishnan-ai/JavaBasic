import java.util.*;

public class Set1{
	public static void main(String args[]){
		Set<String> set=new Hashset<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");
		System.out.println("Display elements"+set);
		System.out.println("Using Iterator");
		Iterator<String> i=set.iterator();
		while(i.hasNext()){
			String element=i.next();
			System.out.println(element);
		}
		boolean containelements=set.contains("Banana");
		System.out.println("Contains"+containelements);
		set.remove("Orange");
		System.out.println("Removed element"+set);
		int sizecheck=set.size();
		System.out.println("Size of set is"+sizecheck);
		set.clear();
		System.out.println("Remove all element"+set);
	}
}