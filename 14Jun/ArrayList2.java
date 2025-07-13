import java.util.*;

public class ArrayList2{
	public static void main(String args[]){
		int a[]=new int[2];
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			alist.add(i);
		}
		System.out.println(alist);
		System.out.println(alist.get(5));
		alist.set(0,100);
		System.out.println("Update"+alist);
		for(int i:alist)
		System.out.println("Display"+i);
		Iterator<Integer> i=alist.iterator();
		System.out.println("Using Iterator");
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println("Using while loop");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		ArrayList slist=new ArrayList();
		slist.add("Krishna");
		slist.add(1);
		slist.add(5.6);
		System.out.println(slist);
	}
}