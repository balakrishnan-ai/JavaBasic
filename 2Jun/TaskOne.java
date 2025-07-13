/** Class using java */

import java.util.Scanner;
class ArithmeticCalc{
	Scanner inp=new Scanner(System.in);
	void getInp(){
		System.out.print("Enter the get input: ");
		int e=inp.nextInt();
		int a[]=new int[e];
		for(int i=0;i<e;i++){
			System.out.println("Enter a val [  "+i+" ] ");
			a[i]=inp.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

public class TaskOne{
	public static void main(String args[]){
		ArithmeticCalc obj=new ArithmeticCalc();
		obj.getInp();		
	}
}