/** Task 2=> Factorial n number using Java Program */

import java.util.Scanner;

public class TaskTwo{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=inp.nextInt();
		/*int sum=1;
		while(n<=5){
			sum=sum*n;
		}
		System.out.println(sum);
		*/
		System.out.println(n*n);	
	}
}