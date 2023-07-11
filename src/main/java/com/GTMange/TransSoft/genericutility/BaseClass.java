package com.GTMange.TransSoft.genericutility;

import java.io.IOException;
import java.sql.SQLException;
import org.testng.annotations.*;
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

import com.GTMange.TransSoft.ObjectRepository.LoginPage;
import com.GTMange.TransSoft.ObjectRepository.ProfilePage;

public class BaseClass {
	protected static WebDriver sdriver;
	protected WebDriver driver = null;
	protected DataBaseUtility dLib = new DataBaseUtility();
	protected ExcelUtility eLib = new ExcelUtility();
	protected FileUtility fLib = new FileUtility();
	protected JavaUtility jLib = new JavaUtility();
	protected JsonUtility json = new JsonUtility();
	protected WebActionUtility wLib = new WebActionUtility();
	protected String path;/* This is for properties */
	protected String ePath;/* This is for testscript data */
	protected String excelPath;/* This is for excel */
	protected String jSon;

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
	public void lunchTheBrowser(/*String BROWSER*/) throws Throwable {
		path = fLib.getFilePathFromPropertiesFile("PropertiesFilePath");
		ePath = fLib.getFilePathFromPropertiesFile("TestScriptData");
		excelPath = fLib.getFilePathFromPropertiesFile("ExcelFilePath");
		jSon = fLib.getFilePathFromPropertiesFile("JsonFilePath");
		String BROWSER = fLib.getDataFromPropertiesFile(path, "browser");

		String URL = fLib.getDataFromPropertiesFile(path, "url");

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
		driver.get(URL);
		wLib.waitForElementInDOM(driver);
		System.out.println("Browser Is Launched");
	}

	/**
	 * This method is used for login to the application
	 * 
	 * @throws IOException
	 */
	@BeforeMethod(groups = {"smokeTest","regTest"})
	public void loginToApplication() throws IOException {
		String USERNAME = fLib.getDataFromPropertiesFile(path, "username");
		String PASSWORD = fLib.getDataFromPropertiesFile(path, "password");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		LoginPage login = new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		System.out.println("Sucessfully login to the application");
	}

	/**
	 * This method is used for logout the application
	 */
	@AfterMethod(groups = {"smokeTest","regTest"})
	public void logoutFromApplication() {
		ProfilePage pf = new ProfilePage(driver);
		pf.clickProfile();
		pf.clickLogout();
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
