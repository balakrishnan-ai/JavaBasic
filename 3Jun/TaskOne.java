/** ATM Machine using java Polymorphism Method overriding */

import java.util.Scanner;

class Start{
	byte lang;
	short pinNo;
	long amt,acNo;
	long totalAmt,bal;
	Scanner inp=new Scanner(System.in);
	void insert(){
		System.out.println("Enter your account number: ");
		acNo=inp.nextLong();
		if(acNo==1234567890){
			System.out.println("\n\n\tHi, BalaKrishnan K");
			System.out.println("Your account number is "+acNo);
			totalAmt=200000;
		}else{
			System.out.println("\t\t\t\tIncorrect Account Number");
			System.exit(0);
		}
	}

	void tamil(){
		System.out.println("Tamil Language");
	}
	void english(){
		System.out.println("English Language");
	}
	void hindi(){
		System.out.println("Hindi Language");
	}

	void Language(){
		System.out.println("\t\t\t\t\t\t\t\t\t1. Tamil\n\n");
		System.out.println("\t\t\t\t\t\t\t\t\t2. English\n\n");
		System.out.println("\t\t\t\t\t\t\t\t\t3. Hindi\n\n");
		System.out.println("Please Enter the language: ");
		lang=inp.nextByte();
		switch(lang){
			case 1:
				tamil();
				break;
			case 2:
				english();
				break;
			case 3:
				hindi();
				break;
			default:
				System.out.println("Please enter the correct choice");
				break;
		}
	}
				
	
	void Pin(){
		System.out.println("Insert a Pin code: ");
		pinNo=inp.nextShort();
		
	}
	void Choice(){
		//this.pinNo=pinNo;
		if(pinNo==1234){
			System.out.println("1.Withdraw money");
			System.out.println("2.Account Balance");
			System.out.println("3.Withdraw and check Balance");
			System.out.println("4.Exit");
		}else{
			System.out.println("It is incorrect PinNo");
			System.exit(0);
		}
	}
	
	void withDraw(){
		System.out.println("Enter amount: ");
		amt=inp.nextLong();
		if(amt>1 && amt<=180000){
			System.out.println("\t\t\t\tWithdraw Your ammount and get your amount ");
			System.out.println("\t\t\t\t\t\t\t\t"+amt);
		}else{
			System.out.println("you doesn't enter amount");
		}
	}

	void balanceCheck(){
		System.out.println("\t\t\t\tDear Customer your Balance");
		bal=totalAmt-amt;
		System.out.println("\t\t\t\t\t\t\t\t"+bal);
	}
	
	/*void exit(){
		System.out.println("You are exited and your account is safe in my Bank");
		System.out.println("\t\t\t\t\t\t\tCome Back");
	}*/
	void chInput(){
		System.out.println("Enter your choice: ");
		byte ch=inp.nextByte();
		switch(ch){
			case 1:
				System.out.println("\t\t\t\t\twithdraw amount");
				withDraw();
				balanceCheck();
				break;
			case 2:
				System.out.println("\t\t\t\t\tAccount Balance");
				balanceCheck();
				break;
			case 3:
				System.out.println("Both the withdraw and to check the Balance");
				withDraw();
				balanceCheck();
				break;			
			case 4:
				System.out.println("\t\t\t\t\tExit");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
	}
}


public class TaskOne{
	public static void main(String args[]){
		Start obj=new Start();
		obj.insert();
		obj.Language();
		obj.Pin();
		obj.Choice();
		obj.chInput();
	}
}