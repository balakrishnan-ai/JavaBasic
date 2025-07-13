class BankAccount{
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountHolder, String accountNumber, double initialBalance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=initialBalance;
	}
	public String getAccountHolder(){
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder){
		this.accountHolder=accountHolder;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount){
		if(amount>0){
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}else{
			System.out.println("Invalid deposit amount");
		}
	}

	public void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance-=amount;
			System.out.println("Withdrawn: "+amount);
		}else{
			System.out.println("Invalid withdrawal amount");
		}
	}
}

public class TaskTwo{
	public static void main(String args[]){
		BankAccount account=new BankAccount("Krishna","12345678",1000);
		System.out.println("Account Holder: "+account.getAccountHolder());
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Current Balance: "+account.getBalance());
		account.deposit(500);
		System.out.println("Balance after deposit: "+account.getBalance());
		account.withdraw(300);
		System.out.println("Balance after withdrawal: "+account.getBalance());
	}
}