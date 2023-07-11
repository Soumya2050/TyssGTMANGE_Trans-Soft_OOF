package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantPage {
	
	@FindBy(xpath = "//a[contains(.,'Restaurants')]")private WebElement restaurant;
	
	public void cliclOnViewMenu(WebDriver driver,String resturant) {
		driver.findElement(By.xpath("//a[.='"+resturant+"']/ancestor::div/following-sibling::div[1]//a[.='View Menu']")).click();
	}

}
