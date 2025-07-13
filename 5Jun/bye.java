/** Task -1 => Interfaces in java*/

import java.util.Scanner;

interface A{
	void go();
}

class TaskOne implements A{
	void go(){
		System.out.println("go");
	}
	public static void main(String args[]){
		TaskOne obj=new TaskOne();
		obj.go();
	}
}