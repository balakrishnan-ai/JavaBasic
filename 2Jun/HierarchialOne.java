/** Hierarchial Inheritance using Employee info get in java */

class Employee{
	String name;
	int empid;
	//It is a constructor
	//The first method
	Employee(String name,int empid){
		this.name=name;
		this.empid=empid;
	}
	
	void displayDetails(){
		System.out.println("Employee id: "+empid);
		System.out.println("Name: "+name);
	}
}
class FullTimeEmployee extends Employee{
	double monthlySalary;
	FullTimeEmployee(String name,int empid,double monthlySalary){
		super(name,empid);
		this.monthlySalary=monthlySalary;
	}
	
	void displaySalary(){
		displayDetails();
		System.out.println("Monthly Salary: $"+monthlySalary);
	}
}

class PartTimeEmployee extends Employee{
	int hoursWorked;
	double hourlyWage;
	PartTimeEmployee(String name,int empid,int hoursWorked,double hourlyWage){
		super(name,empid);
		this.hoursWorked=hoursWorked;
		this.hourlyWage=hourlyWage;
	}
	void displayEarnings(){
		displayDetails();
		double earnings=hoursWorked * hourlyWage;
		System.out.println("Total Earnings: $"+earnings);
	}
}	

public class HierarchialOne{
	public static void main(String args[]){
		FullTimeEmployee ft=new FullTimeEmployee("Krishna",101,5000);
		PartTimeEmployee pt=new PartTimeEmployee("Arjun",102,20,15);
		System.out.println("Full-Time Employee Details: ");
		ft.displaySalary();
		System.out.println("\nPart-Time Employee Details: ");
		pt.displayEarnings();		
	}
}
