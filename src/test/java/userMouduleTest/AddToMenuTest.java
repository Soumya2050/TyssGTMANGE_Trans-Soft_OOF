package userMouduleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GTMange.TransSoft.ObjectRepository.AdminDashboardPage;
import com.GTMange.TransSoft.ObjectRepository.LoginPage;
import com.GTMange.TransSoft.ObjectRepository.MenuPage;
import com.GTMange.TransSoft.ObjectRepository.ProfilePage;
import com.GTMange.TransSoft.genericutility.BaseClass;
import com.GTMange.TransSoft.genericutility.ExcelUtility;
import com.GTMange.TransSoft.genericutility.FileUtility;
import com.GTMange.TransSoft.genericutility.WebActionUtility;
//@Listeners(com.GTMange.TransSoft.genericutility.ListenerImplementClass.class)
public class AddToMenuTest extends BaseClass {
	
	@Test(groups = {"regTest"}/*,retryAnalyzer = com.GTMange.TransSoft.genericutility.IretryAnalyserImplementation.class*/)
	public void addToMenu() throws Throwable {
		String URL1 = fLib.getDataFromPropertiesFile(path, "url1");
		String USERNAME1=fLib.getDataFromPropertiesFile(path, "username1");
		String PASSWORD1=fLib.getDataFromPropertiesFile(path, "password1");
		
		String dishName=eLib.getDataFromExcel(ePath, "addMenu", 7, 2);
		String descri=eLib.getDataFromExcel(ePath, "addMenu", 7, 3);
		String price = eLib.getDataFromExcel(ePath, "addMenu", 7, 4);
		String img = eLib.getDataFromExcel(ePath, "addMenu", 7, 5);
		System.out.println(dishName);
		/**
		 * This method is used to print the no of dished (1)
		 */
		AdminDashboardPage adp = new AdminDashboardPage(driver);
		WebElement dish1 = adp.dishCount();
		String dishno1 = wLib.waitForElement(driver, dish1).getText();
		System.out.println("The number of dishes are displayed in the dashboard1:- "+dishno1);
		

		MenuPage menu=new MenuPage(driver);
		/**
		 * This method is used to click the menu 
		 */
		menu.clickMenu();
		/**
		 * This method is used to click the add menu
		 */
		menu.clickAddMenu();
		/**
		 * Verify addMenu page
		 */
		String addMenuHd = menu.getAddMenuHader().getText();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(addMenuHd.contains("Add Menu"), addMenuHd+"Header is not verifyed successfully");
		/**
		 * This method is used to Enter the value to the text field
		 */
		menu.dishTextField(dishName);
		menu.descriptionTf(descri);
		menu.price(price);
		menu.FileTf(img);
		menu.clickRes();
		/**
		 * This method is used to select the resturant name
		 */
		WebElement selectRes=menu.selectRes();
		wLib.select(selectRes, 4);
		/**
		 * This method is used to click the save button
		 */
		menu.saveButton();
		/**
		 * This method is used to display the confirmation message
		 */
		WebElement text=menu.messageVeri();
		System.out.println(text.getText());
		/**
		 * This method is used to click the all menu
		 */
		menu.clickAllMenu();
		/**
		 * This method is used to verify the all menu page wheather the added menu display or not
		 */
		List<WebElement>details=menu.usersDetails();
		for(int i=0;i<details.size();i++)
		{
			String text1=details.get(i).getText();
			soft.assertEquals(text1,dishName, text1+"The menu details not dispalyed fail");
			break;
//			if(text1.contains(dishName)) {
//				System.out.println("The menu deatils displayed");
//				break;
//			}
//			else {
//				System.out.println("The menu details not dispalyed fail");
//			}
		}
		/**
		 * This method is used to click the dash board
		 */
		adp.clickDashBoard();
		/**
		 * This method is used to print the dish number (1)
		 */
		WebElement dish2=adp.dishCount();
		String dishno2= wLib.waitForElement(driver, dish2).getText();
		System.out.println("The number of dishes are displayed in the dashboard2:- "+dishno2);
		soft.assertAll();
	}
	@Test
	public void test1() {
		System.out.println("Why the script is getting failuare ");
	}

}
