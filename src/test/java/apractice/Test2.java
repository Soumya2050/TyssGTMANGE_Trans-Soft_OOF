package apractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeSuite
	public void test1() {
		System.out.println("Before suite");
	}
	@BeforeTest
	public void test2() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void test3() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void test4() {
		System.out.println("before method");
	}
	@BeforeMethod
	public void test4_0() {
		System.out.println("before method_1");
	}
	@Test
	public void test5() {
		System.out.println("Odisha");
	}
	@Test
	public void test10() {
		System.out.println("Bangalore");
	}
	@AfterMethod
	public void test6() {
		System.out.println("After method");
	}
	@AfterMethod
	public void test6_0() {
		System.out.println("After method_1");
	}
	@AfterMethod
	public void test6_1() {
		System.out.println("After method2S");
	}


	@AfterClass
	public void test7() {
		System.out.println("After Class");
	}
	@AfterTest
	public void test8() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void test9() {
		System.out.println("@AfterSuite");
	}

}
