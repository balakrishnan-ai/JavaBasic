
/** Task -1 => Interfaces in java*/


interface A{
	void go();
}

class TaskOne implements A{
	/* It use a public key word and to access easily*/
	public void go(){
		System.out.println("go");
	}
}
public class B{
	public static void main(String args[]){
		TaskOne obj=new TaskOne();
		obj.go();
	}
}