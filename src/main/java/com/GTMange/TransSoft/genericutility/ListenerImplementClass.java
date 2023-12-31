package com.GTMange.TransSoft.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methosName = result.getMethod().getMethodName();
		test = report.createTest(methosName);
		Reporter.log(methosName + "-----> Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName + "------>PASSED");
		Reporter.log(methodName + "------->Test Execution is SuccessFully ");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		WebActionUtility webActionUtility = new WebActionUtility();
		try {
			webActionUtility.getScreenShot(BaseClass.sdriver, result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(Status.FAIL, result.getThrowable());
		Reporter.log("Test Execution is failed ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName + "----> Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log("Test Execution is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		Random r= new Random();
		int num=r.nextInt(1000);
		ExtentSparkReporter htmirepo = new ExtentSparkReporter("./ExtentReport/report"+num);
		htmirepo.config().setDocumentTitle("TestExecution --> report");
		htmirepo.config().setTheme(Theme.DARK);
		htmirepo.config().setReportName("TYSS_project");

		report = new ExtentReports();
		report.attachReporter(htmirepo);
		report.setSystemInfo("base_browser", "chrome");
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("Reporter_name", "Soumya");
		report.setSystemInfo("Reviewed by","abc@abc");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
