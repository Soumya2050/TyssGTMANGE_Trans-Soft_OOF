package apractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		String win2=driver.switchTo().newWindow(WindowType.TAB).getWindowHandle();
		System.out.println(win2);
		String win3=driver.switchTo().newWindow(WindowType.TAB).getWindowHandle();
		System.out.println(win3);
		
		Set<String> allWin = driver.getWindowHandles();
		
		for (String string : allWin) {
			driver.switchTo().window(win3);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
