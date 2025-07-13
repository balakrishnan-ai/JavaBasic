import java.io.*;

class ClassOne{
	public static void main(String args[]){
	try{
		FileOutputStream fout=new FileOutputStream("test.txt");
		String s="Hi friends";
		byte b[]=s.getBytes();
		fout.write(b);
	}catch(Exception e){
		System.out.println(e);
	}
	}
}