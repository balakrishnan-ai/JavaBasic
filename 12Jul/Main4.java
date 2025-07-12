class DepositTask extends Thread{
	public void run(){
		System.out.println("Depositing money with priority: "+getPriority());
	}
}
class ReportTask extends Thread{
	public void run(){
		System.out.println("Generating repot with priority: "+getPriority());
	}
}
public class Main4{
	public static void main(String[] args){
		DepositTask depositTask=new DepositTask();
		ReportTask reportTask=new ReportTask();
		depositTask.setPriority(Thread.MAX_PRIORITY);
		reportTask.setPriority(Thread.MIN_PRIORITY);
		depositTask.start();
		reportTask.start();
	}
}