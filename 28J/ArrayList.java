import java.util.*;

public class ArrayLst{
	public static void main(String args[]){
		int a[]=new int[5];
		ArrayList<Integer>alist=new ArrayList<>();
		for(int i=1;i<=10;i++){
			alist.add(i);
		}
		System.out.println(alist);
	}
}