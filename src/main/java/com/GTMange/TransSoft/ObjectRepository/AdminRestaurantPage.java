package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminRestaurantPage {
	
	
	/* Declaration */
	@FindBy(xpath = "//span[text()='Restaurant']")
	private WebElement adminRestaurant;

	@FindBy(xpath = "//a[text()='All Restaurant']")
	private WebElement allRestaurant;

	@FindBy(xpath = "//a[text()='Add Category']")
	private WebElement addCatagory;

	@FindBy(xpath = "//a[text()='Add Restaurant']")
	private WebElement addRestaurant;

	@FindBy(className = "card-header")
	private WebElement allRestaurantHeader;

	@FindBy(className = "card-header")
	private WebElement addCatagoryHeader;

	@FindBy(className = "card-header")
	private WebElement addRestaurantHeader;
	/* AddCatagory */
	@FindBy(name = "c_name")
	private WebElement catagoryTf;
	@FindBy(name = "submit")
	private WebElement catagorySubmit;
	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement catagoryCancel;
	/* AddRestaurant */
	@FindBy(name = "res_name")
	private WebElement restaurantTf;
	@FindBy(name = "email")
	private WebElement bussinessEmailTf;
	@FindBy(name = "phone")
	private WebElement phoneNoTF;
	@FindBy(name = "url")
	private WebElement urlTf;
	@FindBy(name = "o_hr")
	private WebElement openHourTf;
	@FindBy(name = "c_hr")
	private WebElement closeHourTf;
	@FindBy(name = "o_days")
	private WebElement openDaysTf;
	@FindBy(name = "file")
	private WebElement imageFileTf;
	@FindBy(name = "c_name")
	private WebElement selectCatagoryTf;
	@FindBy(name = "address")
	private WebElement restaurantAddressTf;
	@FindBy(name = "submit")
	private WebElement addResSaveTf;
	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement addResCancelTf;

	/* Intialiazation */
	public AdminRestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Utilization */
	public WebElement getAdminRestaurant() {
		return adminRestaurant;
	}

	public WebElement getAllRestaurant() {
		return allRestaurant;
	}

	public WebElement getAddCatagory() {
		return addCatagory;
	}

	public WebElement getAddRestaurant() {
		return addRestaurant;
	}

	public WebElement getAllRestaurantHeader() {
		return allRestaurantHeader;
	}

	public WebElement getAddCatagoryHeader() {
		return addCatagoryHeader;
	}

	public WebElement getAddRestaurantHeader() {
		return addRestaurantHeader;
	}

	public WebElement getCatagoryTf() {
		return catagoryTf;
	}

	public WebElement getCatagorySubmit() {
		return catagorySubmit;
	}

	public WebElement getCatagoryCancel() {
		return catagoryCancel;
	}

	public WebElement getRestaurantTf() {
		return restaurantTf;
	}

	public WebElement getBussinessEmailTf() {
		return bussinessEmailTf;
	}

	public WebElement getPhoneNoTF() {
		return phoneNoTF;
	}

	public WebElement getUrlTf() {
		return urlTf;
	}

	public WebElement getOpenHourTf() {
		return openHourTf;
	}

	public WebElement getCloseHourTf() {
		return closeHourTf;
	}

	public WebElement getOpenDaysTf() {
		return openDaysTf;
	}

	public WebElement getImageFileTf() {
		return imageFileTf;
	}

	public WebElement getSelectCatagoryTf() {
		return selectCatagoryTf;
	}

	public WebElement getRestaurantAddressTf() {
		return restaurantAddressTf;
	}

	public WebElement getAddResSaveTf() {
		return addResSaveTf;
	}

	public WebElement getAddResCancelTf() {
		return addResCancelTf;
	}
	
	/*Bussiness Library*/
	public void clickOnRestaurant() {
		adminRestaurant.click();
	}
	public void clickOnEdit(WebDriver driver,String catagory) {
		driver.findElement(By.xpath("//td[text()='"+catagory+"']/following-sibling::td/descendant::i[@class='fa fa-edit']")).click();
	}
	public void clickOnDelete(WebDriver driver,String catagory) {
		driver.findElement(By.xpath("//td[text()='"+catagory+"']/following-sibling::td/descendant::i[@class='fa fa-trash-o']")).click();
	}
	public void catagoryTextField(String data) {
		catagoryTf.sendKeys(data);
	}
	public void clickOnSaveCatagory() {
		catagorySubmit.click();
	}
	public void clickOnCancelCatagory() {
		catagoryCancel.click();
	}
	public void clickOnCatagoryDelete(WebDriver driver,int id) {
		driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/descendant::i[@class='fa fa-trash-o']")).click();
	}
	public void clickOnCatagoryEdit(WebDriver driver,int id) {
		driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/descendant::i[@class='fa fa-edit']")).click();
	}
	public void clickOnAddRestaurant() {
		addRestaurant.click();
	}
	
	
}
