package apractice;

import org.testng.annotations.Test;

import com.GTMange.TransSoft.ObjectRepository.AdminDashboardPage;
import com.GTMange.TransSoft.ObjectRepository.UsersPage;
import com.GTMange.TransSoft.genericutility.BaseClass;

public class UpdateUsersModuleTest extends BaseClass {
	@Test
	public void updateUsersModuleTest() throws Throwable {

		String BROWSER = json.getDataFromJSONFile(jSon, "browser");
		String URL = json.getDataFromJSONFile(jSon, "url");
		String USERNAME = json.getDataFromJSONFile(jSon, "username");
		String PASSWORD = json.getDataFromJSONFile(jSon, "password");
		String USERNAME1 = json.getDataFromJSONFile(jSon, "username1");
		String PASSWORD1 = json.getDataFromJSONFile(jSon, "password1");
		
		
		String usernm=eLib.getDataFromExcel(ePath, "users", 1, 2);
		String FirstName=eLib.getDataFromExcel(ePath, "users", 1, 3);
		String LastName=eLib.getDataFromExcel(ePath, "users", 1, 4);
		String Email=eLib.getDataFromExcel(ePath, "users", 1, 5);
		String Password=eLib.getDataFromExcel(ePath, "users", 1, 6);
		String PhNo=eLib.getDataFromExcel(ePath, "users", 1, 7);

		System.out.println(USERNAME + "\t" + PASSWORD);
		/**
		 * This method is used to click the users link
		 */
		AdminDashboardPage adp = new AdminDashboardPage(driver);
		adp.getUsers().click();
		 
		/**
		 * This method is used to click the edit button
		 */
		
		adp.clickOnEdit(driver, USERNAME1);
		/**
		 * This method is used to pass the data in to the Text field
		 */
		adp.updateUsers(usernm, FirstName, LastName, Email, Password, PhNo);
		/*Click on cancel*/
		UsersPage usr = new UsersPage(driver);
		usr.clickonCancel();
	}

}
