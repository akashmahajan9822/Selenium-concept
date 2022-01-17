package ClassLecPrac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class ExcelReader {
	
	public static  String readData(int row,int col) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData2.xlsx";		
		
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		String value=sheet.getRow(row).getCell(col).getStringCellValue();
		
		// getNumericCellValue(); 
		
// int sheetValue=(int)sheet.getRow(row).getCell(col).getNumericCellValue();
		
	//	String value1=String.valueOf(sheetValue);  // convert int into string
	// or
	
	//	String  value2=Integer.toString(sheetValue);
		System.out.println(value);
	//	System.out.println(value1);
	//	System.out.println(value2);
		
		
		
		
		
		
		// getLastRowNum()  getLastCellNum()
		
		
		 System.out.println(sheet.getLastRowNum());
		 
		 System.out.println(sheet.getRow(0).getLastCellNum());
		 wb.close();   // close workbook

		
		return value;
		
		// verify cell value is numeric or not 
		
		
	
	
	}
	
	
	
	// write into excel
	
public static void writeData(int row,int col, String value) throws IOException {


	String path=System.getProperty("user.dir")+"\\TestData3.xlsx";	
	
	File file =new File(path);
	
	FileInputStream fis=new FileInputStream(file);
	
	XSSFWorkbook wb=new XSSFWorkbook (fis);
	
	XSSFSheet sheet=wb.getSheetAt(0);
	sheet.createRow(row).createCell(col).setCellValue(value);
	
	// write into excel
	
	FileOutputStream fos=new FileOutputStream(file);
	
	wb.write(fos);  //write into workbook
	
	wb.close();   // close workbook




}		

	public static void main(String[] args) throws IOException {
		
		
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromeDriverfor96.0\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys(readData(0,0));
		
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys(readData(0,1));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		writeData(0,0,title);
		 writeData(1,0,"akash");
		 writeData(1,1,"mahajan");
	}

}
