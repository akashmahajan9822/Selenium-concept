package FileHandlingconcept;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreatFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
//String path="G:\\VELOCITY\\new file.txt";
		//or
		
String path="G:\\VELOCITY\\new file.xlsx";
		
		File file =new File(path); 
		boolean fileCreated= file.createNewFile();   // create file return boolean

		
	//	if file is already awailable it not create  new file and it return false
		System.out.println(fileCreated);
		
	
		
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		// 2.using fileoutputStram
		
		Scanner  scan=new  Scanner(System.in) ;
		
		System.out.println("enter file name with location");
		  String fileName=scan.nextLine();
		  
		  FileOutputStream  fos =new FileOutputStream(fileName ,true);
		  System.out.println("enter file content");
		  
		  String content=scan.nextLine();
		  
		  
		  byte b[] =content.getBytes();
		  fos.write(b);
		  fos.close(); 
		scan.close();
		
	}   
 
}
