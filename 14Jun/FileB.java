import java.io.*;

class FileB{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("test.txt");
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i );
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}