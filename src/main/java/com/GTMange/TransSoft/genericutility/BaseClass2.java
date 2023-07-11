package com.GTMange.TransSoft.genericutility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.GTMange.TransSoft.ObjectRepository.UsersLoginPage;

public class BaseClass2 {
	protected static WebDriver sdriver;
	protected WebDriver driver = null;
	protected DataBaseUtility dLib = new DataBaseUtility();
	protected ExcelUtility eLib = new ExcelUtility();
	protected FileUtility fLib = new FileUtility();
	protected JavaUtility jLib = new JavaUtility();
	protected JsonUtility json = new JsonUtility();
	protected WebActionUtility wLib = new WebActionUtility();
	protected String path;/* This is for properties */
	protected String ePath;/* This is for excel */
	protected String pathE;
	protected String eFile;
	protected UsersLoginPage usr;

	/**
	 * This method is used for connect to the data base
	 * 
	 * @throws SQLException
	 */
	@BeforeSuite(groups = {"smokeTest","regTest"})
	public void connectToDataBase() throws SQLException {
		dLib.connectDB();
		System.out.println("Data Base is connected ");
	}

	/**
	 * This method is used to launch the browser
	 * 
	 * @throws Throwable
	 */
//	@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","regTest"})
	public void lunchTheBrowser(/*@Optional String BROWSER*/) throws Throwable {
		path = fLib.getFilePathFromPropertiesFile("PropertiesFilePath");
		ePath = fLib.getFilePathFromPropertiesFile("TestScriptData");
		String BROWSER = fLib.getDataFromPropertiesFile(path, "browser");

		String URL1 = fLib.getDataFromPropertiesFile(path, "url1");

		switch (BROWSER) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new ChromeDriver();
		}
		sdriver = driver;
		wLib.maxiMizeTheWindow(driver);
		driver.get(URL1);
		wLib.waitForElementInDOM(driver);
		System.out.println("Browser Is Launched successfully");
	}

	/**
	 * This method is used for login to the application
	 * 
	 * @throws IOException
	 */
	@BeforeMethod(groups = {"smokeTest","regTest"})
	public void loginToApplication() throws IOException {
		String USERNAME1 = fLib.getDataFromPropertiesFile(path, "username1");
		String PASSWORD1 = fLib.getDataFromPropertiesFile(path, "password1");
		usr = new UsersLoginPage(driver);
		usr.clickOnlogin();
		usr.loginToUserApp(USERNAME1, PASSWORD1);
		System.out.println("Sucessfully login to the application");
	}

	/**
	 * This method is used for logout the application
	 */
	@AfterMethod(groups = {"smokeTest","regTest"})
	public void logoutFromApplication() {
		usr = new UsersLoginPage(driver);
		usr.clickOnLogout();
		System.out.println("successfully loggedout the application");
	}

	/**
	 * This method is used to close the browser
	 */
	@AfterClass(groups = {"smokeTest","regTest"})
	public void closeTheBrowser() {
		wLib.quitWindow(driver);
		System.out.println("Window is successfully closed");
	}

	@AfterSuite(groups = {"smokeTest","regTest"})
	public void closeDataBase() throws SQLException {
		dLib.closeDB();
		System.out.println("Data Base is successfully closed");
	}

}
