/** Method overriding using java It a type of Polymorphism */

import java.util.Scanner;

class A{
	Scanner inp=new Scanner(System.in);
	void add(){
		System.out.println("Enter the how many times you run: ");
		int e=inp.nextInt();
		for(int i=0;i<e;i++){
			System.out.println("Enter the A val: ");
			long a=inp.nextLong();
			System.out.println("Enter the B val: ");
			long b=inp.nextLong();
			long c=a+b;
			System.out.println("Total: "+c);
		}//System.out.println(c);
	}
}

class B extends A{
	void add(){
		System.out.println("It is your answer");
	}
}

public class PolyTwo{
	public static void main(String args[]){
		A obj=new A();
		obj.add();
		B obj1=new B();
		obj1.add();
	}
}