import java.io.*;
import java.util.Scanner;

class FileA{
	Scanner inp=new Scanner(System.in);
	String s=inp.nextLine();
	void createFile(){
	try{
		FileOutputStream fout=new FileOutputStream("test1.txt");
		byte b[]=s.getBytes();
		fout.write(b);
	}catch(Exception e){
		System.out.println(e);
	}}
}	

class FileB extends FileA{
	void readFile(){
	try{
		FileInputStream fin=new FileInputStream("test1.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
	}catch(Exception e){
		System.out.println(e);
	}}
}

public class FileH{
	public static void main(String args[]){
		FileB F=new FileB();
		F.createFile();
		F.readFile();			
	}
}