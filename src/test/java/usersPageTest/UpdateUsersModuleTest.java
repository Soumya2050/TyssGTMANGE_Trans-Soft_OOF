package usersPageTest;

import static org.junit.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GTMange.TransSoft.ObjectRepository.AdminDashboardPage;
import com.GTMange.TransSoft.ObjectRepository.UsersPage;
import com.GTMange.TransSoft.genericutility.BaseClass;
@Listeners(com.GTMange.TransSoft.genericutility.ListenerImplementClass.class)
public class UpdateUsersModuleTest extends BaseClass {
	@Test(groups = { "smokeTest", "regTest" },retryAnalyzer = com.GTMange.TransSoft.genericutility.IretryAnalyserImplementation.class)
	public void updateUsersModuleTest() throws Throwable {

		String BROWSER = json.getDataFromJSONFile(jSon, "browser");
		String URL = json.getDataFromJSONFile(jSon, "url");
		String USERNAME = json.getDataFromJSONFile(jSon, "username");
		String PASSWORD = json.getDataFromJSONFile(jSon, "password");
		String USERNAME1 = json.getDataFromJSONFile(jSon, "username1");
		String PASSWORD1 = json.getDataFromJSONFile(jSon, "password1");

		String usernm = eLib.getDataFromExcel(ePath, "users", 1, 2);
		String FirstName = eLib.getDataFromExcel(ePath, "users", 1, 3);
		String LastName = eLib.getDataFromExcel(ePath, "users", 1, 4);
		String Email = eLib.getDataFromExcel(ePath, "users", 1, 5);
		String Password = eLib.getDataFromExcel(ePath, "users", 1, 6);
		String PhNo = eLib.getDataFromExcel(ePath, "users", 1, 7);

		System.out.println(USERNAME + "\t" + PASSWORD);
		/**
		 * This method is used to click the users link
		 */
		AdminDashboardPage adp = new AdminDashboardPage(driver);
		adp.getUsers().click();
		/**
		 * This method is used to verify the Users Header
		 */
		SoftAssert soft = new SoftAssert();
		UsersPage usr = new UsersPage(driver);
		String usHd = usr.getUsersHeader().getText();
		soft.assertTrue(usHd.contains("All Users"), usHd + "Header is not verified ");
		/**
		 * This method is used to click the edit button
		 */

		adp.clickOnEdit(driver, USERNAME1);
		/**
		 * This method is used to verify the update users page
		 */
		String upDateUserHeader = usr.getUpdateUserHeader().getText();
		soft.assertTrue(upDateUserHeader.contains("Update Users"), upDateUserHeader + "The header is not displayed");
		/**
		 * This method is used to pass the data into the update users text field
		 */
		adp.updateUsers(usernm, FirstName, LastName, Email, Password, PhNo);
		/* Click on cancel */
		usr.clickonCancel();
		soft.assertAll();
	}

}
