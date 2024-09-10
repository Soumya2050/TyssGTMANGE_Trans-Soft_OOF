package apractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4 {

	@Test(dataProvider = "searchedData")
	public void amazon(String data, String data1) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data + "" + data1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Thread.sleep(2000);

		String title = driver.getTitle();
		System.out.println("This " + title + " is for " + data);

		driver.quit();

	}

	@DataProvider
	public Object[] searchedData() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "toy";
		obj[0][1] = "boy";

		obj[1][0] = "Mobile";
		obj[1][1] = "iphone";

		obj[2][0] = "tShirt";
		obj[2][1] = "H&M Shirt";
		return obj;
	}

	@Test
	public void handleMultipleWindow() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentTitle = driver.getTitle();
		String parentwindow = driver.getWindowHandle();
		for (int i = 0; i <= 2; i++) {
			driver.switchTo().newWindow(WindowType.TAB);
		}
//		driver.close();
		Set<String> child = driver.getWindowHandles();
		for (String string : child) {
			driver.switchTo().window(string);
			
			if(!(string.equals(parentwindow))) {
				driver.close();
			}
			
		}

	}

}
