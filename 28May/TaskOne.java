import java.util.Scanner;

public class TaskOne{
	public static void main(String args[]){
		/*String name="Bala";

		int count=0;
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(1);
			System.out.println(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count=count+1;
			}System.out.println(count);
		}*/


		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any words: ");
		String name=inp.nextLine();
	
		System.out.println(name);

		int count=0;
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'){
				//break;
			/*}else{*/
				count=count+1;
	
				System.out.println(count);
				System.out.println(ch);
			}
		}
	}
}