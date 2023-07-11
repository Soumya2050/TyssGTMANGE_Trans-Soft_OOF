package com.GTMange.TransSoft.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
	
	
	
	@FindBy(xpath = "//div[@class='card-header']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//span[.='Users']")
	private WebElement users;
	
	@FindBy(xpath = "//p[text()='Restaurants']/preceding-sibling::h2")
	private WebElement restaurantCount;
	
	@FindBy(xpath = "//p[text()='Dishes']/preceding-sibling::h2")
	private WebElement dishCount;
	
	@FindBy(xpath = "//p[text()='Total Orders']/preceding-sibling::h2")
	private WebElement totalOrdersCount;
	
	@FindBy(xpath = "//p[text()='Restro Categories']/preceding-sibling::h2")
	private WebElement restroCategoriesCount;
	
	@FindBy(xpath = "//p[text()='Processing Orders']/preceding-sibling::h2")
	private WebElement processingOrdersCount;
	
	@FindBy(xpath = "//p[text()='Delivered Orders']/preceding-sibling::h2")
	private WebElement deliveredOrdersCount;
	
	@FindBy(xpath = "//p[text()='Cancelled Orders']/preceding-sibling::h2")
	private WebElement CancelledOrdersCount;
	
	@FindBy(xpath = "//p[text()='Total Earnings']/preceding-sibling::h2")
	private WebElement totalEarningCount;
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashBoard;
	
	//<------------------------------------->
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
	//<------------------------------>
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement ordersPage;
	
	@FindBy(xpath = "//div[@class='card-header']")
	private WebElement allOrdersHeader;
	
	@FindBy(xpath = "//button[text()='Update Order Status']")
	private WebElement updateOrderStatus;
	
	@FindBy(xpath = "//select[@name='status']")
	private WebElement status;
	
	@FindBy(xpath = "//textarea[@name='remark']")
	private WebElement orderDescription;
	
	
	@FindBy(name = "username")
	private WebElement userPageUnTf;
	@FindBy(name = "password")
	private WebElement userPswTf;
	@FindBy(name = "submit")
	private WebElement userSaveTf;
	
	@FindBy(name = "update")private WebElement submit;
	/*Intialization*/
	
	

	public AdminDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Utilization*/
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public WebElement getUsers() {
		return users;
	}

	public WebElement getRestaurantCount() {
		return restaurantCount;
	}

	public WebElement getDishCount() {
		return dishCount;
	}

	public WebElement getTotalOrdersCount() {
		return totalOrdersCount;
	}

	public WebElement getRestroCategoriesCount() {
		return restroCategoriesCount;
	}
	
	public WebElement getProcessingOrdersCount() {
		return processingOrdersCount;
	}

	public WebElement getDeliveredOrdersCount() {
		return deliveredOrdersCount;
	}

	public WebElement getCancelledOrdersCount() {
		return CancelledOrdersCount;
	}

	public WebElement getTotalEarningCount() {
		return totalEarningCount;
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
	
	public WebElement getDashBoard() {
		return dashBoard;
	}

	public WebElement getOrdersPage() {
		return ordersPage;
	}

	public WebElement getAllOrdersHeader() {
		return allOrdersHeader;
	}

	public WebElement getUpdateOrderStatus() {
		return updateOrderStatus;
	}

	public WebElement getStatus() {
		return status;
	}
	public WebElement getOrderDescription() {
		return orderDescription;
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
	
	/*Bussiness Libraries*/
	

	public WebElement pageHeader() {
		return pageHeader;
	}
	
	public WebElement restaurantCount() {
		return restaurantCount;
	}
	public WebElement dishCount() {
		return dishCount;
	}
	public WebElement totalOrdersCount() {
		return totalOrdersCount;
	}
	
	public WebElement restroCategoriesCount() {
		return restroCategoriesCount;
	}
	public WebElement processingOrdersCount() {
		return processingOrdersCount;
	}
	public WebElement deliveredOrdersCount() {
		return deliveredOrdersCount;
	}
	public WebElement CancelledOrdersCount() {
		return CancelledOrdersCount;
	}
	public WebElement totalEarningCount() {
		return totalEarningCount;
	}
	public void clickDashBoard() {
		dashBoard.click();
	}
	public void clickUsers() {
		users.click();
	}
	public void clickOnEdit(WebDriver driver,String Username) {
		driver.findElement(By.xpath("//td[text()='"+Username+"']/following-sibling::td/descendant::i[@class='fa fa-edit']")).click();
	}
	public void updateUsers(String UserNm,String firstName,String lastName,String eMail,String passwordTf,String phNo) {
		usernameTf.sendKeys(UserNm);
		fnameTf.sendKeys(firstName);
		lnameTf.sendKeys(lastName);
		emailTf.sendKeys(eMail);
		this.passwordTf.sendKeys(passwordTf);
		phoneTf.sendKeys(phNo);
	}
	public void clickOrders() {
		ordersPage.click();
	}
	public WebElement allOrdersHeader() {
		return allOrdersHeader;
		
	}

	public void clickOnUpdateOrderStatus() {
		updateOrderStatus.click();
	}
	public void clickStatus() {
		status.click();
	}
	
	public void orderDescRemark(String remark) {
		orderDescription.sendKeys(remark);
	}
	public void loginToUserApp(String usrName,String usrPsw) {
		userPageUnTf.sendKeys(usrName);
		userPswTf.sendKeys(usrPsw);
		userSaveTf.click();
	}
	public void clickOnSubmit() {
		submit.click();
	}

}
