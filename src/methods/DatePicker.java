package methods;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;



public class DatePicker {

	
	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		
		SimpleDateFormat  sdf=new SimpleDateFormat("M/d/yyyy"); // we can write any format  dd-MM-yyyy HH-mm-ss
		System.out.println(sdf.format(date));
		
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
		LocalDateTime now= LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		
		
		//using Calendar
		
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat  sdf1=new SimpleDateFormat("M/d/yyyy"); // we can write any format  dd-MM-yyyy HH-mm-ss
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
