package orderModuleTest;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GTMange.TransSoft.ObjectRepository.AdminDashboardPage;
import com.GTMange.TransSoft.genericutility.BaseClass;
//@Listeners(com.GTMange.TransSoft.genericutility.ListenerImplementClass.class)
public class UpdateOrderStatusTest extends BaseClass{
	@Test(groups = {"regTest","smokeTest"}/*,retryAnalyzer = com.GTMange.TransSoft.genericutility.IretryAnalyserImplementation.class*/)
	public void updateOrderStatusTest() throws Throwable {
		String URL1 = fLib.getDataFromPropertiesFile(path, "url1");
		String USERNAME1 = fLib.getDataFromPropertiesFile(path, "username1");
		String PASSWORD1 = fLib.getDataFromPropertiesFile(path, "password1");
		
		AdminDashboardPage adb = new AdminDashboardPage(driver);
		adb.clickOrders();
		/**
		 * Verify all orders page
		 */
		String allOrders =adb.allOrdersHeader().getText();
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(allOrders.contains("All Orders"), allOrders+"All orders page is not Displayed");
//		if (allOrders.contains("All Orders")) {
//			System.out.println("All Orders page is Displayed");
//		} else {
//			System.out.println("All orders page is not Displayed");
//		}
		/**
		 * Click on edit link
		 */
		adb.clickOnEdit(driver, USERNAME1);
		/**
		 * Click on update order status
		 */
		adb.clickOnUpdateOrderStatus();
		/**
		 * Handle the window
		 */
		wLib.swithToWindowBasedOnURL(driver, "login.php");
		/**
		 * Enter data into user module username text field
		 */
//		UsersLoginPage ulp = new UsersLoginPage(driver);
		adb.loginToUserApp(USERNAME1, PASSWORD1);
		/**
		 * Swich back to the window
		 */
		wLib.swithToWindowBasedOnURL(driver, "view_order.php");
		/**
		 * Click on update orders page
		 */
		adb.clickOnUpdateOrderStatus();

		/**
		 * Switch to the window and handle it
		 */
		wLib.swithToWindowBasedOnURL(driver, "form_id=273");
		/**
		 * click on select and select the dropdown
		 */
		WebElement select = adb.getStatus();
		
		wLib.waitForElement(driver, select).click();
		wLib.select(select, 2);
		/**
		 * Enter the data into the description text field
		 */
		adb.orderDescRemark("The order details updated sucessfully");
		/**
		 * click on submit
		 */
		adb.clickOnSubmit();
		/**
		 * It is used to handle the alert popup and print the message
		 */
		wLib.swithToAlertWindowAndAccpect(driver,"ok");
		/**
		 * switch back to the window
		 */

		wLib.swithToWindowBasedOnURL(driver, "admin");
		
		soft.assertAll();
	}
	@Test
	public void test1() {
		System.out.println("Hii Welcome to the Tyss");
	}

}
