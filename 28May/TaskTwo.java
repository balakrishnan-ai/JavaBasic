import java.util.Scanner;

public class TaskTwo{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);

		String name=inp.nextLine();
		System.out.println("name= "+name);

		int count=0;
		
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			if(ch>='A' && ch<='Z'){
				//count=count+1;
				//System.out.println(count);
				System.out.println(ch);
			}
		}
	}
}