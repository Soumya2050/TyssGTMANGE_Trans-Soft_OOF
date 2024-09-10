package test;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class workingWithkeyboardAction {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.id("small-searchterms"));
		
		act.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).perform();
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		

	}

}
