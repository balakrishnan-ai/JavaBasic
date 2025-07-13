/** Task One => BMI calculation */

import java.util.Scanner;

public class TaskOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		//Display the Heading
		System.out.println("\t\t\t\t\tBMI");
		
		//Get input from user
		System.out.println("Enter your Weight: ");
		int w=inp.nextInt();
	
		System.out.println("Enter your Height: ");
		int h=inp.nextInt();

		//Calculation of BMI 
		int bmi=w/((h/100)^2);
		
		//Check and give your body health related
		if(bmi<18.5){
			System.out.println(bmi+" your weight is under weight");
		}else if(18.5<24.5){
			System.out.println(bmi+" your weight is NORMAL");
		}else if(24.5<27.5){
			System.out.println(bmi+" your weight is Over Weight");
		}else{
			System.out.println(bmi+" your weight is obesity");
		}
	}
}