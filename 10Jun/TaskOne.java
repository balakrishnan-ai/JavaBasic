/** Abstracts in java*/
 
abstract class Animal{
	abstract void sound();
}

class Lion extends Animal{
	void sound(){
		System.out.println("Lion");
	}
}
class Tiger extends Animal{
	void sound(){
		System.out.println("Tiger growls");
	}
	public static void main(String args[]){
		Lion obj=new Lion();
		obj.sound();
		Tiger obj1=new Tiger();
		obj1.sound();
	}
}