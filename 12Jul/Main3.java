class MyThread extends Thread{
	public void run(){
		System.out.println("Thread is running");
		try{
			Thread.sleep(2000000);
		}catch(InterruptedException e){
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread is finished");
	}
}
public class Main3{
	public static void main(String[] args){
		MyThread thread=new MyThread();
		System.out.println("Thread state: "+thread.getState());
		thread.start();
		System.out.println("Thread state: "+thread.getState());
		try{
			Thread.sleep(1000);
			System.out.println("Thread state: "+thread.getState());
			thread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread state: "+thread.getState());
	}
}