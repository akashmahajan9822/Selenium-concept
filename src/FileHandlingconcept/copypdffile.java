package FileHandlingconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copypdffile {

	public static void main(String[] args) throws IOException    {
		

		
		
	//	String path=;
	//	String Copypath="";
	
		
		
	
			// copy pdf
		
		File path=new File("G:\\VELOCITY\\CLASS\\7.Banking Notes\\lect notes\\Investment Banking Short Notes.pdf");
		File Copypath=new File("G:\\VELOCITY\\CLASS\\7.Banking Notes\\lect notes\\Investment Banking Short Notes copy.pdf");
		
		// copy txt file
//		File path=new File("G:\\VELOCITY\\CLASS\\READ ME.txt");
//		File Copypath=new File("G:\\VELOCITY\\CLASS\\READ ME copy.txt");
		
		
		FileInputStream  inputs= null;
		FileOutputStream out=null;
		
		  inputs =new FileInputStream(path);
		  
		  out =new  FileOutputStream(Copypath);
		  
		  int i=0;
		  
			while((i= inputs.read() ) != -1) {
				  
				  out.write(i);
			  }
			
			out.close();
			inputs.close();
			
			
			
			
	}

}
