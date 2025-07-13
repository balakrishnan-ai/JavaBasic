/** Swaping any two number using java program */

import java.util.Scanner;

public class SwapNumber{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter A value : ");
		int a=inp.nextInt();
		
		System.out.println("Enter B value : ");
		int b=inp.nextInt();
		int temp;
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		
	}
}