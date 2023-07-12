package usersPageTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GTMange.TransSoft.genericutility.BaseClass2;
@Listeners(com.GTMange.TransSoft.genericutility.ListenerImplementClass.class)
public class AddToCartTest extends BaseClass2{

	@Test(groups = {"regTest","smokeTest"},retryAnalyzer = com.GTMange.TransSoft.genericutility.IretryAnalyserImplementation.class)
	public void addToCart() throws Throwable {

		String username = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "UserName");
		String firstName = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "FirstName");
		String lastName = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "LastName");
		String emailAddress = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "Email");
		String phoneNumber = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "PhoneNumber");
		String passwordTf = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "Password");
		String conPassword = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "ConfirmPasswordDe");
		String deliveryAddress = eLib.getDataFromExcelBasedTestId(ePath, "users", "tc_04", "DeliveryAddress");

		System.out.println(username);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(emailAddress);
		System.out.println(phoneNumber);
		System.out.println(passwordTf);
		System.out.println(conPassword);
		System.out.println(deliveryAddress);


		/* Scroll down */
		wLib.scrollElement(driver, "window.scrollBy(0,50)");

		/* click on orders now */
		usr.clickOnOrders(driver, "Crispy Chicken Strips");

		/* Scroll down */
		wLib.scrollElement(driver, "window.scrollBy(0,50)");

		/* Click on add to cart */
		usr.clickOnAddToCart();

		/*Scroll down*/
		wLib.scrollElement(driver, "window.scrollBy(0,50)");

		/* Click on check out */
		usr.clickCheckOut();

		/* Scroll down */
		wLib.scrollElement(driver, "window.scrollBy(0,50)");

		/* click on order now */
		usr.clickOnOrderNow();
		/* Handle popup */
		wLib.swithToAlertWindowAndAccpect(driver, "ok");

		/* handle another popup */
		Thread.sleep(3000);
		wLib.swithToAlertWindowAndAccpect(driver, "ok");
		Reporter.log("The popup is handeled successfully");
	}

}
