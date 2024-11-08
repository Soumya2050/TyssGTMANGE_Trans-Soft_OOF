package naukri;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GTMange.TransSoft.genericutility.WebActionUtility;

public class uploadProfileToNaukriTest {

	@Test
	public void uploadCVonNaukri() throws Throwable {
		WebActionUtility wLib = new WebActionUtility();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/nlogin/login");

		driver.findElement(By.id("usernameField")).sendKeys("soumyaranjanjena2023@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwordField")).sendKeys("Soumya@2050");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(3000);
		WebElement proofile = driver.findElement(By.xpath("//div[@class='view-profile-wrapper']"));
		wLib.waitForElement(driver, proofile).click();

		WebElement update = driver.findElement(By.xpath("//a[.='Update']"));
		wLib.waitForElement(driver, update).click();
		File file = new File("./src/test/resources/Soumyaranjan.pdf");
		driver.findElement(By.xpath("//input[@id='attachCV']"))
				.sendKeys(file.getAbsolutePath());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon-img-wrapper']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
