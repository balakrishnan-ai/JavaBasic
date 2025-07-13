import java.util.Scanner;

class Marks{
	int m1,m2,m3,m4,m5,m6,total,per;
	Scanner inp=new Scanner(System.in);
	void getMarks(){
		System.out.println("C# and .Net Program theory : ");
		m1=inp.nextInt();	

		System.out.println("C# and .Net Program lab : ");
		m2=inp.nextInt();

		System.out.println("Project and Viva : ");
		m3=inp.nextInt();

		System.out.println("CyberSecurity : ");
		m4=inp.nextInt();

		System.out.println("Software Testing  : ");
		m5=inp.nextInt();

		System.out.println("Android Studio lab : ");
		m6=inp.nextInt();
	}
	void disp(){

		System.out.println(m1);

		System.out.println(m2);

		System.out.println(m3);

		System.out.println(m4);

		System.out.println(m5);

		System.out.println(m6);
	}

	void calc(){
		total=m1+m2+m3+m4+m5+m6;

		System.out.println("Total : "+total);

		per=total/6;

		System.out.println("Percentage: "+per);
	}
}
class B extends Marks{

	public static void main(String args[]){
		B obj=new B();

		obj.getMarks();
		obj.disp();
		obj.calc();
				
	}
}