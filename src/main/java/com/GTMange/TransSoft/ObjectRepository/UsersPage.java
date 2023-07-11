package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	/* Declaration */

	@FindBy(className = "card-header")
	private WebElement usersHeader;
	@FindBy(className = "card-header")private WebElement updateUserHeader;

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElement MousehoverUser;

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement cancelBtn;

	@FindBy(name = "submit")
	private WebElement saveBtn;

	@FindBy(name = "uname")
	private WebElement usernameTf;
	@FindBy(name = "fname")
	private WebElement fnameTf;
	@FindBy(name = "lname")
	private WebElement lnameTf;
	@FindBy(name = "email")
	private WebElement emailTf;
	@FindBy(name = "password")
	private WebElement passwordTf;
	@FindBy(name = "phone")
	private WebElement phoneTf;
	/* Intialization */

	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Utilization */
	
	public WebElement getMousehoverUser() {
		return MousehoverUser;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getUsernameTf() {
		return usernameTf;
	}
	public WebElement getFnameTf() {
		return fnameTf;
	}
	public WebElement getLnameTf() {
		return lnameTf;
	}
	public WebElement getEmailTf() {
		return emailTf;
	}
	public WebElement getPasswordTf() {
		return passwordTf;
	}
	public WebElement getPhoneTf() {
	return phoneTf;
	}
	public WebElement getUsersHeader() {
		return usersHeader;
	}
	

	public WebElement getUpdateUserHeader() {
		return updateUserHeader;
	}

	/* Business Libraries */
	public WebElement getpageHeader() {
		return usersHeader;
	}

	public WebElement mouseHover() {
		return MousehoverUser;
	}

	

	public void clickonCancel() {
		cancelBtn.click();
	}

	public void clickOnSave() {
		saveBtn.click();
	}
	public void updateUsers(String UserNm,String firstName,String lastName,String eMail,String passwordTf,String phNo) {
		usernameTf.sendKeys(UserNm);
		fnameTf.sendKeys(firstName);
		lnameTf.sendKeys(lastName);
		emailTf.sendKeys(eMail);
		this.passwordTf.sendKeys(passwordTf);
		phoneTf.sendKeys(phNo);
	}

}
