/** While Loop in Java program */

import java.util.Scanner;

public class WhileLoop1{
	public static void main(String args[]){
			Scanner inp=new Scanner(System.in);
			System.out.println("Enter a starting val: ");
			int start=inp.nextInt();
			
			System.out.println("Enter a Ending val: ");
			int end=inp.nextInt();

			int a=start;
			while(a<=end){
			System.out.println(a);
			a++;
		}	
	}
}