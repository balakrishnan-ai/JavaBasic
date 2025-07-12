class MyTask implements Runnable{
	public void run(){
		System.out.println("Task is running!");
	}
}
public class Main2{
	public static void main(String[] args){
		Thread thread=new Thread(new MyTask());
		thread.start();
	}
}