/** Symbols using Arithmetic calculator using java program */

import java.util.Scanner;

public class DoubtTwo{
	public static void main(String args[]){
		 Scanner inp=new Scanner(System.in);
		/*System.out.println("Choice [+, -, *, /, %] \n Enter any symbols : ");		
		char c=inp.next().charAt(); */
		
		int c=inp.nextInt();
		System.out.println(c%10);
		
	}
}