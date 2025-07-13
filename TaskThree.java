/** Task 3 => Multiplication Table using Java Programming */

import java.util.Scanner;

public class TaskThree{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the table number: ");
		int tab=inp.nextInt();
		
		System.out.println("Enter the starting point: ");
		int start=inp.nextInt();
		
		System.out.println("Enter the ending point: ");
		int end=inp.nextInt();
		
		/*Using for Loop
		for(int i=start;i<=end;i++){
			int n=i*tab;
			System.out.println(i+" X "+tab+" = "+n);
		}	*/
		
		/*Using While Lssssoop
		int i=start;
		while(i<=end){
			System.out.println(i+" X "+tab+" = "+i*tab);
			i++;
		}	*/
		
		/*Using Do While Loop */
		int i=start;
		do{
			System.out.println(i+" X "+tab+" = "+i*tab);
			i++;
		}while(i<=end);
	}
}