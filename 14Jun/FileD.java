import java.io.*;

class FileD{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("test.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i=0;
			while((i=fin.read())!=-1)
			System.out.println((char)i);
			bin.close();
			fin.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}