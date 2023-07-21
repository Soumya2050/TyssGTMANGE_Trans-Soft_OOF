package StringPrograms;

import org.testng.annotations.Test;

public class FindMinLengthInAString {

	public static void main(String[] args) {

		String[] s = { "ab", "abc", "bd", "abcd", "abcde", "cd" };

		for (int i = 0; i < s.length; i++) {
			if (s[i].length() <= 2) {
				System.err.println(s[i]);

			}
		}
	}

	@Test
	public void FindMinLengthInAStringMethod2() {
		
		String[] s = { "ab", "abc", "bd", "abcd", "abcde", "cd" };
		String min_Length = s[0];
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min_Length.length()) {
				min_Length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length() == min_Length.length()) {
				System.out.println(s[i]+" ");
			}
		}
	}
}
