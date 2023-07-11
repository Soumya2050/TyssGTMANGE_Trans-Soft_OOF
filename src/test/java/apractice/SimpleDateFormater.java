 package apractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class SimpleDateFormater {
	@Test(priority = 1)
	public void dateFormater() {
		
		Date date=new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String result=sdf.format(date);
		System.out.println("Today date is :-----> "+result);
	}
	@Test(priority = -1)
	public void  dateFormaterNext() {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -30);
		Date date=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String result=sdf.format(date);
		System.out.println(" The next date :----> "+result);
	}
	
}
