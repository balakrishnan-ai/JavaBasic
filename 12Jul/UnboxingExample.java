import java.util.ArrayList;

public class UnboxingExample{
	public static void main(String[] args){
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		int sum=0;
		for(Integer num: numbers){
			sum+=num;
		}
		System.out.println("Sum of numbers: "+sum);
	}
}
