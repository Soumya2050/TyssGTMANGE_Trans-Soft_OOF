package apractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FetchDataIntoExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		/* Convert physical file to java readable file*/ 
		FileInputStream fis=new FileInputStream("C:\\Users\\srjen\\OneDrive\\Desktop\\Contract Requests - Status Transition Report_20240418.xlsx");
		/*Open the workBook*/
		Workbook wb= WorkbookFactory.create(fis);
		/*Get the control over sheet*/
		Sheet sh=wb.getSheet("Sheet1");
		/*Get the control over Row*/
		Row r=sh.getRow(0);
		/*Get the control over cell*/
		Cell c=r.getCell(0);
		/*close the workbook*/
		wb.close();
		String BROWSER=wb.getSheet("Data").getRow(0).getCell(1).getStringCellValue();
		String URL= wb.getSheet("Data").getRow(1).getCell(1).getStringCellValue();
		String USERNAME=wb.getSheet("Data").getRow(2).getCell(1).getStringCellValue();
		String PASSWORD= wb.getSheet("Data").getRow(3).getCell(1).getStringCellValue();
		String URL1 = wb.getSheet("Data").getRow(4).getCell(1).getStringCellValue();
		String USERNAME1=wb.getSheet("Data").getRow(5).getCell(1).getStringCellValue();
		String PASSWORD1= wb.getSheet("Data").getRow(6).getCell(1).getStringCellValue();
		
		System.out.println(BROWSER+"\n"+URL+"\n"+USERNAME+"\n"+PASSWORD+"\n"+URL1+"\n"+USERNAME1+"\n"+PASSWORD1);
		/*close the workbook*/
		wb.close();
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the user details to be updated:- ");
//		String user="Soumya2050";
//		WebDriver driver=null;
//		if(BROWSER.equals("chrome"))
//		{
//			 driver = new ChromeDriver();
//		}
//		else if(BROWSER.equals("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else if(BROWSER.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			driver = new ChromeDriver();
//		}
//		driver.manage().window().maximize();
//		driver.get(URL);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		/**
//		 * Enter the data into the username text field
//		 */
//		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(USERNAME);
//		/**
//		 * Enter the data into the password text field
//		 */
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(PASSWORD);
//		/**
//		 * click on login button
//		 */
//		WebElement loginButtin=driver.findElement(By.xpath("//input[@name='submit']"));
//		loginButtin.click();
//		/**
//		 * Click on orders 
//		 */
//		WebElement orders=driver.findElement(By.xpath("//span[text()='Orders']"));
//		orders.click();
//		/**
//		 * Verify all orders page
//		 */
//		String allOrders=driver.findElement(By.xpath("//div[@class='card-header']")).getText();
//		if(allOrders.contains("All Orders")) {
//			System.out.println("All Orders page is Displayed");
//		}
//		else {
//			System.out.println("All orders page is not Displayed");
//			
//		}
//		/**
//		 * Click on edit link
//		 */
//		WebElement edit=driver.findElement(By.xpath("(//tbody/tr/td[text()='"+user+"'])[position()=1]/following-sibling::td/descendant::i[@class='fa fa-edit']"));
//		edit.click();
//		/**
//		 * Click on update order status
//		 */
//		WebElement updateOrderSts=driver.findElement(By.xpath("//button[text()='Update Order Status']"));
//		updateOrderSts.click();
//		/**
//		 * Handle the window
//		 */
//		String parentid=driver.getWindowHandle();
//		Set<String> windowsid=driver.getWindowHandles();
//		
//		for (String string : windowsid) {
//			
//			driver.switchTo().window(string);
//		}
//		/**
//		 * Enter data into user module username text field
//		 */
//		WebElement usernameUser=driver.findElement(By.xpath("//input[@name='username']"));
//		usernameUser.sendKeys(USERNAME1);
//		/**
//		 * Enter the data into the user module password text field
//		 */
//		WebElement passwordUser=driver.findElement(By.xpath("//input[@name='password']"));
//		passwordUser.sendKeys(PASSWORD1);
//		/**
//		 * click on login button
//		 */
//		WebElement loginUser=driver.findElement(By.xpath("//input[@name='submit']"));
//		loginUser.click();
//		/**
//		 * Swich back to the window
//		 */
//		driver.switchTo().window(parentid);
//		/**
//		 * Click on update orders page
//		 */
//		updateOrderSts.click();
//		
//		/**
//		 * Switch to the window and handle it
//		 */
//		
//		String parentid1=driver.getWindowHandle();
//		Set<String> windowsid1=driver.getWindowHandles();
//		
//		for (String string1 : windowsid1) {
//			
//			driver.switchTo().window(string1);
//		}
//		/**
//		 * click on select and select the dropdown
//		 */
//		WebElement select=driver.findElement(By.xpath("//select[@name='status']"));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(select));
//		Select s=new Select(select);
//		s.selectByIndex(3);
//		/**
//		 * Enter the data into the description text field
//		 */
//		WebElement des=driver.findElement(By.xpath("//textarea[@name='remark']"));
//		des.sendKeys("The order details updated successfully");
//		/**
//		 * click on submit
//		 */
//		WebElement sub=driver.findElement(By.name("update"));
//		sub.click();
//		/**
//		 * It is used to handle the alert popup and print the message
//		 */
//		Alert al=driver.switchTo().alert();
//		System.out.println(al.getText());
//		al.accept();
//		/**
//		 * switch back to the window
//		 */
//		
//		driver.switchTo().window(parentid1);
//		/**
//		 * This is used to navigate to the admin profile  logo
//		 */
//		
//		WebElement img = driver.findElement(By.xpath("//img[@class='profile-pic']"));
//		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait1.until(ExpectedConditions.visibilityOf(img)).click();
//		/**
//		 * This methos is used to click the logout button
//		 */
//		driver.findElement(By.xpath("//a[@aria-haspopup='true']/following::div/descendant::i")).click();
//		
//		
//		driver.quit();
	}

}
