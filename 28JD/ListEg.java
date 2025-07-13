import java.util.*;

public class ListEg{
	public static void main(String[] args){
		List<String> names=new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Alice");
		
		System.out.println("Names: "+names);
		System.out.println("First name: "+names.get(0));
	}
}