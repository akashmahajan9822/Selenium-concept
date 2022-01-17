package FileHandlingconcept;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStoring   {
	
	public void code() throws InterruptedException, IOException {
	
		
		//1. read  file location from pc  using bufferader  on console
		
	//File file=new File("G:\\VELOCITY\\CLASS\\READ ME.txt");  //absolute path
	//realatiy we can define path as above example bz if we share project 
	//then path of project have diffenrnt path
		// we used following method 
	
		File file=new File("G:\\VELOCITY\\CLASS\\READ ME.txt");  ////absolute path
		System.out.println(file.getAbsolutePath());
		
	//	or
		File file1=new File("\\roughfolder\\practice site.txt");
		System.out.println(file1.getAbsolutePath());
	
		          //or
		File file2=new File(System.getProperty("user.dir")+"\\roughfolder\\practice site.txt");
		System.out.println(file2.getAbsolutePath());
	
		
		if(file.exists()) {
		
		System.out.println("file available");
		System.out.println(file.getAbsolutePath());
	}
	else {
		System.out.println("file not available");
	}	
		
		
		
		//2. read file  buffer reader class 
		FileReader fr=new  FileReader(file2);
		
		BufferedReader  read=new BufferedReader(fr);

//		System.out.println("1st row: "+read.readLine());	//read only one line for 2nd call onesagain
//	System.out.println("2nd row: "+read.readLine());	
//	System.out.println("3rd row: "+read.readLine());	
//	System.out.println("4th row: "+read.readLine());	
  
		
	//to read total file make logic
		//onle one logic run at a time 
	

	while(read.readLine()!=null) {
		System.out.println("row is: "+read.readLine());
		
	}
	
	
	read.close();   // erase memory of readLine()
	
	}
	
	public void code1() throws InterruptedException, IOException {
	
	//  open  file direct by going to desktop
		
		
    String path="G:\\VELOCITY\\CLASS\\READ ME.txt";
		
		File file =new File(path); 
		if(!Desktop.isDesktopSupported()) {
			
			System.out.println("desktopnot supported ");
			
			return;
				}
		
	Desktop desk= Desktop.getDesktop();
	
	if(file.exists()) {
		desk.open(file);
	}
		
	}
	
	public void code2() throws InterruptedException, IOException {
		
		// open file and read on console direct 
			
			
	    String path="G:\\VELOCITY\\CLASS\\READ ME.txt";
			
			File file =new File(path); 
			FileInputStream fis=new FileInputStream(file); 
			int c=0;
			
			// read until total file read  and when nothing to read it show -1
			 
			while((c=fis.read()) !=-1) {
				
				System.out.print((char)c);  // convert ascii into char
				
			}
			fis.close();
			
		}
	
	
	
	public static void main(String[] args) throws InterruptedException , IOException{
		

		FileStoring ob=new FileStoring();
	
	ob.code();
		//ob.code1();
	
	//ob.code2();
	
	}

}
