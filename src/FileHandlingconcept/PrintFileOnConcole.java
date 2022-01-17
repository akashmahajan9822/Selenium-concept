package FileHandlingconcept;

import java.io.File;
import java.util.Arrays;

public class PrintFileOnConcole {

	public static void main(String[] args) {
		
		
		
	//	read folder name and print on concole
		
		
		String path="C:\\Users\\Admin\\Downloads";
		
		File file =new File(path); 
		
		File totaldownloadDir[] = file.listFiles() ;   // return array 
		
		Arrays.sort(totaldownloadDir );   // sort all file
		
		for(File e:totaldownloadDir)
			if (e.isFile()) {
				
				System.out.println("file : "+ e.getName());
			}

			else if(e.isDirectory()) {
				System.out.println("Directory : "+ e.getName());
			}
			
			else {
				
				System.out.println("unknown file : "+ e.getName());
			}
				
				
				
	}

}
