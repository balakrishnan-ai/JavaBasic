/** Task 1=> Check largest number using Array in Java Programming */

import java.util.Scanner;

public class TaskOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);

		System.out.println("Enter the How many numbers you get: ");
		int p=inp.nextInt();
		
		int a[]=new int[p];

		for(int i=0;i<p;i++){
			System.out.println("Enter the element no ["+i+"] : ");
			a[i]=inp.nextInt();
		}

		int max=a[0];
		
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("Largest number is : "+max);
		inp.close();
		
	}
}
