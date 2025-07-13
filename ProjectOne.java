/** Employee details using Java Program */

import java.util.Scanner;

public class ProjectOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);

		//Display the Heading 
		System.out.println("\n\n\t\t\t\tEmployee Informations");
		for(int i=0;i<=30;i++){
			System.out.print("-");
		}		

		//Get Input the user
		System.out.print("Employee Name : \t");
		String name=inp.nextLine();
	}
}