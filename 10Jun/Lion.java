/** Abstracts in java*/
 
abstract class Animal{
	abstract void sound();
}

class Lio extends Animal{
	void sound(){
		System.out.println("Lion");
	}
}
class Tiger extends Animal{
	void sound(){
		System.out.println("Tiger growls");
	}
	
}
public class Lion{
	public static void main(String args[]){
		Lio obj=new Lio();
		obj.sound();
		Tiger obj1=new Tiger();
		obj1.sound();
	}
}