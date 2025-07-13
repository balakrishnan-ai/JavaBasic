import java.util.Scanner;

class UtilScanner{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Scanner using input get");
		
		String choice=inp.nextLine();
		switch(choice){
			case "Byte":
				System.out.println("Enter Byte value: ");
				byte B=inp.nextByte();
				System.out.println("It is a Byte Data Type : "+B);
				break;
			case "Boolean":
				System.out.println("Enter Boolean value: ");
				boolean b1=true;
				System.out.println("It is a Boolean Data Type : "+b1);
				break;
			case "Char":
				System.out.println("Enter Char value: ");
				char c=inp.next.charAt();
		}
		
	}
}