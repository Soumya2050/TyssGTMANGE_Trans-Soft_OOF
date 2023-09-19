package apractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void test1() throws EncryptedDocumentException, IOException   {
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--headless");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet");
		
		for(int i=0;i<allLinks.size();i++)
		{
			String link = allLinks.get(i).getAttribute("href");
			sh.createRow(i).createCell(0).setCellValue(link);
		}
		 FileOutputStream fos;
		try {
			fos = new FileOutputStream("./src/test/resources/commonData.xlsx");
			 wb.write(fos);
		} catch (FileNotFoundException e) {
			 wb.close();
		}
		
		
	}

}
