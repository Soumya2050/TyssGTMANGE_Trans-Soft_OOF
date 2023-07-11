package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	/*Declaration*/
	@FindBy(xpath = "//img[@class='profile-pic']")
	private WebElement profilePage;
	@FindBy(xpath = "//a[@aria-haspopup='true']/following::div/descendant::i")
	private WebElement logout;
	
	/*Intialization*/
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/*Utilization*/
	public WebElement getProfilePage() {
		return profilePage;
	}

	public WebElement getLogout() {
		return logout;
	}
	/*Business Libraries*/
	public void clickProfile() {
		profilePage.click();
	}
	public void clickLogout() {
		logout.click();
	}
}
