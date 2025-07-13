import java.util.Scanner;

class Odd{
	Scanner inp=new Scanner(System.in);
	int oe;
	void check(){
		System.out.println("Enter any value: ");
		oe=inp.nextInt();
		if(oe%2==0){
			System.out.println("It is Even number and its number is "+oe);
		}else{
			System.out.println("It is Odd number and its number is "+oe);
		}
	}
}
class TaskTwo extends Odd{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		TaskTwo obj=new TaskTwo();
		
		System.out.println("Enter your choice: ");
		int ch=in.nextInt();
		switch(ch){
			case 1:
				obj.check();
			default:
				System.out.println("It is invalid input");
		}
	}
}