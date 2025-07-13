/** Do While Loop in Java Program */

import java.util.Scanner;

public class DoWhileLoop1{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter start val: ");
		int start=inp.nextInt();
			
		System.out.println("Enter end val: ");
		int end=inp.nextInt();
	
		int a=start;
		int b=end;
		do{
			System.out.println(a);
			a--;
		}while(a<=b);	
	}
}