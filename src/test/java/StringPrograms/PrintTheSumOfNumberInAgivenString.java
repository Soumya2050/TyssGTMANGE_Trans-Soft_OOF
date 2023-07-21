package StringPrograms;

import org.testng.annotations.Test;

public class PrintTheSumOfNumberInAgivenString {

	@Test
	public void sumOfNumberInAstring() {
		String str = "K1N2a3D7a";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println("The sum of digit in a string is:= " + sum);
	}

	@Test
	public void method2() {
		String str = "K1N2a3D7a";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + (ch - 48);
			}
		}
		System.out.println(sum);
	}
}
