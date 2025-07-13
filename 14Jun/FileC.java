import java.io.*;

class FileC{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("test1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Hi friends welcome";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			fout.flush();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}