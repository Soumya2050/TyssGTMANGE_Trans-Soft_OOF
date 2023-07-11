package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersLoginPage {
	/*DEclaration*/
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement userLogin;
	@FindBy(name = "username")
	private WebElement userPageUnTf;
	@FindBy(name = "password")
	private WebElement userPswTf;
	@FindBy(name = "submit")
	private WebElement userSaveTf;
	
	@FindBy(xpath = "//input[@type='submit']")private WebElement addToCart;
	
	@FindBy(xpath = "//a[text()='Checkout']")private WebElement checkOut;
	@FindBy(name = "submit")private WebElement orderNow;
	@FindBy(className = "nav-item")private WebElement logout;
	/*intialiazation*/
	public UsersLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*Utilization*/
	public WebElement getUserLogin() {
		return userLogin;
	}
	public WebElement getUserPageUnTf() {
		return userPageUnTf;
	}
	public WebElement getUserPswTf() {
		return userPswTf;
	}
	public WebElement getUserSaveTf() {
		return userSaveTf;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getOrderNow() {
		return orderNow;
	}
	public WebElement getLogout() {
		return logout;
	}
	/*Business Librariry*/
	public void clickOnlogin() {
		userLogin.click();
	}
	
	public void loginToUserApp(String usrName,String usrPsw) {
		userPageUnTf.sendKeys(usrName);
		userPswTf.sendKeys(usrPsw);
		userSaveTf.click();
	}
	public void clickOnOrders(WebDriver driver,String dishName) {
		driver.findElement(By.xpath("//a[text()='"+dishName+"']/../following-sibling::div/descendant::a")).click();
	}
	public void clickOnAddToCart() {
		addToCart.click();
	}
	public void clickCheckOut() {
		checkOut.click();
	}
	public void clickOnOrderNow() {
		orderNow.click();
	}
	public void clickOnLogout() {
		logout.click();
	}
}
