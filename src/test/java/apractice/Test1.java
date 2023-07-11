package apractice;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GTMange.TransSoft.genericutility.BaseClass;



public class Test1  extends BaseClass{
	@Test
	public void print()throws Throwable {
		
		
/*		String BROWSER=flib.getDataFromPropertiesFile(file, "browser");
		String URL=flib.getDataFromPropertiesFile(file, "url");
		String USERNAME=flib.getDataFromPropertiesFile(file, "username");
		String PASSWORD=flib.getDataFromPropertiesFile(file, "password");
		String URL1=flib.getDataFromPropertiesFile(file, "url1");
		String USERNAME1=flib.getDataFromPropertiesFile(file, "username1");
		String PASSWORD1=flib.getDataFromPropertiesFile(file, "password1");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL1);
		System.out.println(USERNAME1);
		System.out.println(PASSWORD1);
	*/	
		String BROWSER=eLib.getDataFromExcel(excelPath, "Sheet1", 0, 1);
		String URL=eLib.getDataFromExcel(excelPath, "Sheet1", 1, 1);
		String USERNAME=eLib.getDataFromExcel(excelPath, "Sheet1", 2, 1);
		String PASSWORD=eLib.getDataFromExcel(excelPath, "Sheet1", 3, 1);
		String URL1=eLib.getDataFromExcel(excelPath, "Sheet1", 4, 1);
		String USERNAME1=eLib.getDataFromExcel(excelPath, "Sheet1", 5, 1);
		String PASSWORD1=eLib.getDataFromExcel(excelPath, "Sheet1", 6, 1);
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL1);
		System.out.println(USERNAME1);
		System.out.println(PASSWORD1);
		System.out.println("Well come to hello world");
		
		
		
		
		
	}

}
