import java.io.*;
import java.util.Scanner;
class BasicOne{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		
		try{
			FileOutputStream fout=new FileOutputStream("test.txt");
			String S="hai this is my first";
			byte b[]=S.getBytes();
			fout.write(b);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}