package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/*Declaration*/
	@FindBy( name = "username")
	private WebElement adminUserTf;
	
	@FindBy(name = "password")
	private WebElement adminPswTf;
	
	@FindBy(name = "submit")
	private WebElement adminLoginBtn;
	
	/*Intialization*/
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	/*Utilization*/
	public WebElement getAdminUserTf() {
		return adminUserTf;
	}

	public WebElement getAdminPswTf() {
		return adminPswTf;
	}

	public WebElement getAdminLoginBtn() {
		return adminLoginBtn;
	}
	
	/*Business Libraries*/
	
	public void loginToApp(String username,String password) {
		adminUserTf.sendKeys(username);
		adminPswTf.sendKeys(password);
		adminLoginBtn.click();
	}
	
	
	
	
	
}
