public class WrapperInMethods{
	public static void main(String[] args){
		int number=25;
		printNumber(number);
		Integer num=42;
		int result=doubleValue(num);
		System.out.println("Double of "+num+" is "+result);
	}
	public static void printNumber(Integer num){
		System.out.println("The number is : "+num);
	}
	public static int doubleValue(Integer value){
		return value*2;
	}
}