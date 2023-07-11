package apractice;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderTest {
	
	@Test(dataProviderClass = ExcelDataProviderTest.class, dataProvider = "readData")
	public void getData(String src ,String dest,String flight,String catagory,String time,String price) {
		System.out.println(src+"--->"+dest+"--->"+flight+"--->"+catagory+"---->"+time+"---->"+price);
	}
	
	
	@DataProvider
	public Object[][] readData() throws Throwable{
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("data");
		int lastRowNum = sh.getLastRowNum()+1;
		int lastCellNum = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRowNum][lastCellNum];
		
		
		for(int i=0;i<lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
			
		}
		return obj;
	}
	
	

}
