import java.io.*;
import java.net.*;
public class MyClient1{
	public static void main(String args[]){
		try{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Welcome");
			dout.flush();
			dout.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}