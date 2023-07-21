package StringPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPalindrome {

	@Test
	public void stringPalindrome() {
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string : ");
			String str = sc.next().toLowerCase();
//		String str = "anna";
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			if (rev.equals(str))
				System.err.println("this is a palindrome string");
			else
				System.err.println("this is not a palindrome string");
		}
	}

}
