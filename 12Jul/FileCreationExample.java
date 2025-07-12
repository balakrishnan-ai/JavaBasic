import java.io.File;

import java.io.IOException;

public class FileCreationExample{
	public static void main(String[] args){
		try{
			File myFile=new File("example.txt");
			if(myFile.exists()){
				System.out.println("File already exists: "+myFile.getName());
			}else{
				if(myFile.createNewFile()){
					System.out.println("File created: "+myFile.getName());
				}else{
					System.out.println("Failed to create the file");
				}
			}
		}catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}