package methods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStoring extends ChromeDriverLaunch  {
	
	public void code() throws InterruptedException, IOException {
	
		
		//1. read  file location from pc
		
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
	System.out.println("1st row: "+read.readLine());	//read only one line for 2nd call onesagain
	System.out.println("2nd row: "+read.readLine());	
	System.out.println("3rd row: "+read.readLine());	
	System.out.println("4th row: "+read.readLine());	
  
		
	//to read total file make logic
		//onle one logic run at a time 
	
/*
	while(read.readLine()!=null) {
		System.out.println("row is: "+read.readLine());
		
	}
	*/
	
	read.close();   // erase memory of readLine()
	
	}
	
	
	public static void main(String[] args) throws InterruptedException , IOException{
		

		FileStoring ob=new FileStoring();
	//ob.launchBrowser();
	ob.code();
	}

}
