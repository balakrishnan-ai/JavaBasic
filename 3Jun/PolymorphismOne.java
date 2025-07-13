/** Polymorphism using java  It is a Method overloading */

import java.util.Scanner;
//Function name is same
public class PolymorphismOne{  //It is a Burger
	//It is a veg Burger
	void go(){
		System.out.println("It is A value");
	}
	//It is a chicken Buger
	void go(int a){
		System.out.println(a);
	}
	//It is a Cheese Burger
	void go(int a,int b){
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	public static void main(String args[]){
		PolymorphismOne obj=new PolymorphismOne();
		obj.go();
		obj.go(25);
		obj.go(30,30);
		
	}
}