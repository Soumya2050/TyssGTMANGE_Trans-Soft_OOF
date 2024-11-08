package javaPractice;

import org.testng.annotations.Ignore;

interface intre{
	 void m1();
	 
	 default void m2() {
		 System.out.println("Hiii");
	 }
 }

public class testDemo implements intre{
	
	public static void main(String[] args) {
		testDemo t = new testDemo();
		t.m1();
		t.m2();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hlw");
	}

}
