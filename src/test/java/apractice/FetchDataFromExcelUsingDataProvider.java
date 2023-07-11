package apractice;

import org.testng.annotations.Test;

public class FetchDataFromExcelUsingDataProvider {
	
	@Test(dataProviderClass = ExcelDataProviderTest.class, dataProvider = "readData")
	public void getData(String src ,String dest,String flight,String catagory,String time ) {
		System.out.println(src+"--->"+dest+"--->"+flight+"--->"+catagory+"---->"+time);
	}
}
