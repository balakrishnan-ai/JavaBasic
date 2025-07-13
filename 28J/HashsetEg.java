import java.util.*;

public class HashsetEg{
	public static void main(String args[]){
		HashSet<String> set=new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple");
		for(String fruit:set){
			System.out.println(fruit);
		}
	}
}