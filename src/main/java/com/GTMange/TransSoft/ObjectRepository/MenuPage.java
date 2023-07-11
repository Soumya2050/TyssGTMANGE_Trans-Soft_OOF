package com.GTMange.TransSoft.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	@FindBy(xpath = "//span[text()='Menu']")
	private WebElement menu;
	
	@FindBy(xpath = "//span[text()='Menu']/parent::a/following-sibling::ul/descendant::a[text()='All Menues']")
	private WebElement allMenu;
	
	@FindBy(xpath = "//span[text()='Menu']/parent::a/following-sibling::ul/descendant::a[text()='Add Menu']")
	private WebElement addMenu;
	
	@FindBy(className = "card-header")
	private WebElement allMenuHeader;
	
	@FindBy(className = "card-header")
	private WebElement addMenuHeader;
	
	@FindBy(xpath = "//th[text()='Dish']/ancestor::thead/following-sibling::tbody/tr/td[2]")
	private List<WebElement> verifyAllUsers;
	
	@FindBy(name = "d_name")
	private WebElement dishTf;
	
	@FindBy(name = "about")
	private WebElement desTf;
	@FindBy(name = "price")
	private WebElement priceTf;
	@FindBy(name = "file")
	private WebElement fileTf;
	@FindBy(name = "res_name")
	private WebElement resTf;
	@FindBy(name = "submit")
	private WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible fade show']")
	private WebElement message;
	
	/*Intialozation*/
	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*Utilization*/
	public WebElement getMenu() {
		return menu;
	}

	public WebElement getAllMenu() {
		return allMenu;
	}

	public WebElement getAddMenu() {
		return addMenu;
	}

	public WebElement getAllMenuHeader() {
		return allMenuHeader;
	}

	public WebElement getAddMenuHeader() {
		return addMenuHeader;
	}

	public List<WebElement> getVerifyAllUsers() {
		return verifyAllUsers;
	}

	public WebElement getDishTf() {
		return dishTf;
	}

	public WebElement getDesTf() {
		return desTf;
	}

	public WebElement getPriceTf() {
		return priceTf;
	}

	public WebElement getFileTf() {
		return fileTf;
	}

	public WebElement getResTf() {
		return resTf;
	}
	
	/*Bussiness Libraries*/
	public void clickMenu() {
		menu.click();
	}
	public void clickAllMenu() {
		allMenu.click();
	}
	public void clickAddMenu() {
		addMenu.click();
	}
	public WebElement getAllMenuHader() {
		return allMenuHeader;
		
	}
	public WebElement getAddMenuHader() {
		return addMenuHeader;	
	}
	public List<WebElement> usersDetails(){
		return verifyAllUsers;
	}
	public void dishTextField(String dishname) {
		dishTf.sendKeys(dishname);
	}
	public void descriptionTf(String description) {
		desTf.sendKeys(description);
	}
	public void price(String Price) {
		priceTf.sendKeys(Price);
	}
	public void FileTf(String path) {
		fileTf.sendKeys(path);
	}
	public void clickRes() {
		resTf.click();
	}
	public WebElement selectRes() {
		return resTf;		
	}
	public void saveButton() {
		save.click();
	}
	public WebElement messageVeri() {
		return message;
		
	}

}
