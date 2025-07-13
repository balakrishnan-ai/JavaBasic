/** Hierarchial Inheritance in java */

import java.util.Scanner;

//parent class
class Animal{
	void eat(){
		System.out.println("The animal eats food");
	}
}
//Dog inherits Animal[parent class]
class Dog extends Animal{
	void bark(){
		System.out.println("The dog barks");
	}
}
//Cat inherits Animal[Parent class]
class Cat extends Animal{
	void meow(){
		System.out.println("The cat meows.");
	}
}
//Main class
public class Hierarchial{
	public static void main(String args[]){
		Dog obj1=new Dog();
		obj1.eat();
		obj1.bark();
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
	}
}