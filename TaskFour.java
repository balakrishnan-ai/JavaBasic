/** Task 3 => Fibonacci Series using Java Programming */

import java.util.Scanner;

public class TaskFour{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any number and its give the fibonnacci series: ");
		int num=inp.nextInt();
		int sum=1;
		
		
		/*Using for loop
		for(int i=0;i<=num;i++){
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("It is a fibonacci "+sum);*/
		
		
		/*Using While Loop*/
		int i=0;
		while(i<=num){
			sum*=i;
			i++;
		}
		System.out.println(sum);

		/*Using Do-While Loop
		int i=0;
		do{
			sum+=i;
			i++;
		}while(i<=num);
		System.out.println(sum);*/
	}
}