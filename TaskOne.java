/** ForLoop using java */

import java.util.Scanner;

public class TaskOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the start point of year: ");
		int start=inp.nextInt();
		System.out.println("Enter the End point of year: ");
		int end=inp.nextInt();
		
		System.out.println("\n\nIt is a leap year");
		for(int i=start;i<=end;i++){
			if(i%4==0){
				System.out.println(i);
			}
		}
		System.out.println("\n\nIt is a not leap year");
		for(int i=start;i<=end;i++){
			if(i%4!=0){
				System.out.println(i);
			}
		}

	}
}