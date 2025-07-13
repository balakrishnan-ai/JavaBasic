import java.util.*;

public class ArrayList1{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Value [ "+i+" ] : ");
			a[i]=inp.nextInt();
		}
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			alist.add(i);
		}
		System.out.println(alist);	
	}
}