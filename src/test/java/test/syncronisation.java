package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncronisation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().maximize();;
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele = driver.findElement(By.xpath("//a[.=' Electronics ']"));
//		String title = driver.getTitle();
//		System.out.println(title);
//		wait.until(ExpectedConditions.titleContains(title));
//		wait.until(ExpectedConditions.titleIs(title));
//		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
//		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
//		System.out.println(element.getText());
		WebElement drp = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s = new Select(drp);
//		s.selectByVisibleText("Beauty");
//		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
//		s.selectByValue("search-alias=beauty");
//		Thread.sleep(3000);
		
//		driver.close();
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("dgf");
		driver.switchTo().alert().getText();



	}

}
