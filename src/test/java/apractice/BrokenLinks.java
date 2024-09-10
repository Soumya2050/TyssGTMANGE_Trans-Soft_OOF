package apractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	@Test
	public void brokenLinks() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));//ancor tag
		ArrayList<Object> brokenList = new ArrayList<Object>();
		for(int i=0;i<links.size();i++)
		{
			String allLinks = links.get(i).getAttribute("href");
			
			URL url;
			int statusCode = 0;
			try {
				url = new URL(allLinks);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpconnection = (HttpURLConnection)connection;
				statusCode = httpconnection.getResponseCode();
				if(statusCode>=400) {
					brokenList.add(allLinks+"------>"+ statusCode);
				}
			} catch (IOException e) {}
			
			System.out.println(brokenList);
			driver.quit();
			
		}
	}

}
