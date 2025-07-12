class BankAccount{
	private int balance=1000;
	public synchronized void withdraw(String name,int amount){
		if(balance>=amount){
			System.out.pr‌intln(name+" is withdrawing "+amount);
			balance-=amount;
			System.out.println(name+" completed withdrawal.Remaining balance : "+balance);
		}else{
			System.out.println(name=" tried to wihtdraw "+amount+" but insufficient balance.");
		}
	}
	public synchronized void deposit(String name, int amount){
		System.out.println(name+" is depositing "+amount);
		balance+=amount;
		System.out.println(name+" completed deposit.Name Balance : "+balance);
	}
}
class BankingThread extends Thread{
	private BankAccount account;
	private String name;
	private boolean isDeposit;
	private int amount;
	public BankingThread(BankAccount account,String name,boolean isDeposit,int amount){
		this.account=account;
		this.name=name;
		this.isDeposit=isDeposit;
		this.amount=amount;
	}
	public void run(){
		if(isDeposit){
			account.deposit(name,amount);
		}else{
			account.withdraw(name,amount);
		}
	}
}
public class Main5{
	public static void main(String[] args){
		BankAccount account=new BankAccount();
		BankingThread user1=new BankingThread(account,"User1",false,700);
		BankingThread user2=new BankingThread(account,"User2",true,500);
		BankingThread user3=new BankingThread(account,"User3",false,1200);
		user1.start();
		user2.start();
		user3.start();
	}
}