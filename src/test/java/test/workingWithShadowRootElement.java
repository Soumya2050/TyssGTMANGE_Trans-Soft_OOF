package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithShadowRootElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SearchContext shadow_root = driver.findElement(By.xpath("")).getShadowRoot();
		shadow_root.findElement(By.name("sdnmf")).sendKeys("dfnk");
	}

}
