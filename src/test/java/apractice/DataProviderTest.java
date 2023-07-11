package apractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "bookTkt")
	public void bookTkt(String src,String dest,String price) {
		System.out.println(src+"--->"+dest+"--->"+price);
	}
	
	
	@DataProvider
	public Object[][] bookTkt(){
		Object[][] obj = new Object[3][3];
		obj[0][0]="Bangalore";
		obj[0][1]="Odisha";
		obj[0][2]="5600";
		
		obj[1][0]="Odisha";
		obj[1][1]="Bangalore";
		obj[1][2]="6500";
		
		obj[2][0]="Bangalore";
		obj[2][1]="Mummbai";
		obj[2][2]="6500";
		
		
		return obj;
	}
}
