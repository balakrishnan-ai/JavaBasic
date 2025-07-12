class MyThread extends Thread{
	public void run(){
		System.out.println("This is a thread running!");
	}
}
public class Main{
	public static void main(String[] args){
		MyThread thread=new MyThread();
		thread.start();
	}
}