public class TaskOne{
	public static void main(String args[]){
		try{
			int a[]=new int[4];
			System.out.println("Access element three : "+a[3]);
		}catch(Exception e){
			System.out.println("Ans: Exception thrown: "+e);
		}
		System.out.println("Out of the block");
	}
}