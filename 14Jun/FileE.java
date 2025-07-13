import java.io.*;

class FileE{
	public static void main(String args[]){
	try{
		FileInputStream fin=new FileInputStream("test.txt");
		FileInputStream fin1=new FileInputStream("test1.txt");
		SequenceInputStream sin=new SequenceInputStream(fin,fin1);
		int i=1;
		while((i=sin.read())!=-1)
		System.out.print((char)i);
	}catch(Exception e){
		System.out.print(e);
	}
}}