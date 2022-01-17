package TestNggroup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderParameter {
	
	
	@BeforeTest
	public void beforeMethod() {
		
	System.out.println("Before Test ");
		
	}
	  
	 
	  @DataProvider(name="TestData")
	  public String[][] getData() throws IOException{
		  
		  String path=System.getProperty("user.dir")+"\\TestData2.xlsx";		
			
			File file=new File(path);
			
			FileInputStream fis=new FileInputStream(file);
			
			//Apache poi
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			XSSFSheet sheet=wb.getSheetAt(0);
			
			//from which row to start
			int row=sheet.getPhysicalNumberOfRows();  //get no of row 
			System.out.println(row);
		
			int col= sheet.getRow(0).getLastCellNum();
			System.out.println(col);			
			
			String [][]data=new String[row][col]; // define size of data array 2 dimension array
		
			for (int i=0; i<row;i++) {
				
				 for (int j=0; j<col;j++) {
			
				String excelValue=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j]=excelValue;
			}
			}
			wb.close();
			return data;
		  }

	  
	
	  @Test (dataProvider="TestData")
	   public void login(String username,String password) {
		  
		  System.out.println("Login test TestClass3 " + "DataProvider Value :" + username);
		  System.out.println("Login test TestClass3 " + "DataProvider Value :" + password);
	  }
	  
	  
	  
}
