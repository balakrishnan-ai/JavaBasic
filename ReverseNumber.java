/** Reverse Number in Java Program */

import java.util.Scanner;

public class ReverseNumber{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any number: ");
		long num=inp.nextLong();
		long sum=0;
		
		while(num>0){
			long ld=num%10;
			
			sum=sum+ld;
			
			num/=10;
			
		}
		System.out.println(sum);
	}
}