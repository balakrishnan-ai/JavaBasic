import java.util.*;

public class HashsetEg1{
	public static void main(String args[]){
		HashSet<String> set=new HashSet<>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		System.out.println("Initial HashSet: "+set);
		System.out.println("Fetch elements from HashSet");
		for(String fruit:set){
			System.out.println(fruit);
		}
		String elementToFetch="Banana";
		if(set.contains(elementToFetch)){
			System.out.println(elementToFetch+" is in HashSet");
		}
		else{
			System.out.println(elementToFetch+" is not in HashSet");
		}
		String elementToUpdate="Orange";
		if(set.contains(elementToUpdate)){
			set.remove(elementToUpdate);
			set.add("Grapes");
			System.out.println("Updated 'Orange' to 'Grapes' : "+set);
		}

		else{
			System.out.println(elementToUpdate+" is not found to Update");
		}
	
		String elementToDelete="Banana";
		if(set.remove(elementToDelete)){
			System.out.println(elementToDelete+" removed from HashSet");
		}
		else{
			System.out.println(elementToDelete+" not found in HashSet");
		}
		System.out.println("Final HashSet"+set);
	}
}