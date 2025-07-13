/** Task Two is => Swaping numbers using Java Programming */

import java.util.Scanner;

public class TaskTwo{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a=inp.nextInt();
		
		System.out.println("Enter B value: ");
		int b=inp.nextInt();
	
		/*a=b;
		b=a;*/
		System.out.println(a=b);
		System.out.println(b=a);
	}
}