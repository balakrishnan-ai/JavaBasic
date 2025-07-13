/** Task1=> */

import java.util.Scanner;

class Table{
	Scanner inp1=new Scanner(System.in);
	private int tab,start,end,otp;
	void getInput(){
		System.out.println("Enter the Table : ");
		tab=inp1.nextInt();
		System.out.println("Enter the starting point: ");
		start=inp1.nextInt();
		System.out.println("Enter the ending point: ");
		end=inp1.nextInt();
	}
	void disp1(){
		for(int i=start;i<=end;i++){
			otp=i*tab;
			System.out.println(i+" X "+tab+" = "+otp);
		}
	}
}
		

public class TaskOne{
	public static void main(String args[]){
		Table t=new Table();
		t.getInput();
		t.disp1();
	}
}