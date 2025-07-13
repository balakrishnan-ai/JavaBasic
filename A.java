import java.util.Scanner;

class A{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Greater Number");
		
		System.out.print("Enter A value: ");
		int a=inp.nextInt();

		System.out.print("Enter B value: ");
		int b=inp.nextInt();

		System.out.print("Enter C value: ");
		int c=inp.nextInt();

		if(a>b && a>c){
			System.out.println("A is greatest number and it's value is "+a);
		}
		else if(b>a && b>c){
			System.out.println("B is greatest number and it's value is "+b);
		}
		else{
			System.out.println("C is greatest number and it's value is "+c);
		}
		
	}
}