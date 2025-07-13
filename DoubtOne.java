/** Traffic signal colors in check the action on the road using java program */

import java.util.Scanner;

public class DoubtOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Traffic color name and must using lowercase :  ");	
		String color=inp.nextLine();
		
		if(color=="red"){
			System.out.println(color+" is a stop action");
		}else if(color=="yellow"){
			System.out.println(color+" is a ready action");
		}else if(color=="green"){
			System.out.println(color+" is a go action");
		}else{
			System.out.println(color+" is a incorrect query");
		}
	}
}