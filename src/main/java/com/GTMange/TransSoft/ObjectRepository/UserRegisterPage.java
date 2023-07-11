package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegisterPage {
	
	@FindBy(xpath = "//a[text()='Register']")private WebElement register;
	
	@FindBy(name = "username")private WebElement usernameTf;
	
	@FindBy(name = "firstname")private WebElement firstnameTf;
	
	@FindBy(name = "lastname")private WebElement lastnameTf;
	
	@FindBy(name = "email")private WebElement emailTf;
	
	@FindBy(name = "phone")private WebElement phoneTf;
	
	@FindBy(name = "password")private WebElement passwordTf;
	
	@FindBy(name = "cpassword")private WebElement curentPasswordTf;
	
	@FindBy(name = "address")private WebElement addressTf;
	
	@FindBy(name = "submit")private WebElement submitTf;
	
	/*Intialization*/
	
	
	public UserRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	/*Utilization*/

	public WebElement getRegister() {
		return register;
	}

	public WebElement getUsernameTf() {
		return usernameTf;
	}

	public WebElement getFirstnameTf() {
		return firstnameTf;
	}

	public WebElement getLastnameTf() {
		return lastnameTf;
	}

	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPhoneTf() {
		return phoneTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getCurentPasswordTf() {
		return curentPasswordTf;
	}

	public WebElement getAddressTf() {
		return addressTf;
	}

	public WebElement getSubmitTf() {
		return submitTf;
	}
	/*Business Libraries*/
	
	public void clickOnRegister() {
		register.click();
	}
	public void registerPage(String userName,String firsrName,String lastName,String email,String phnoNo,String passwordTf,String conPasswordTf,String addresTf) {
		usernameTf.sendKeys(userName);
		firstnameTf.sendKeys(firsrName);
		lastnameTf.sendKeys(lastName);
		emailTf.sendKeys(email);
		phoneTf.sendKeys(phnoNo);
		this.passwordTf.sendKeys(passwordTf);
		curentPasswordTf.sendKeys(conPasswordTf);
		addressTf.sendKeys(addresTf);
		submitTf.click();
	}

}
