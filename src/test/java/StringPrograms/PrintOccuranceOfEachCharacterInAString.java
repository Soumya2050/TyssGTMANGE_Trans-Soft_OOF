package StringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintOccuranceOfEachCharacterInAString {
	@Test
	public void OccuranceOfEachCharacterInAString() {
		String str = "KANADA";
		char ch = 'A';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("This " + ch + " is occured " + count + " times in the string");
	}

	@Test
	public void method2() {
		String str = "Kannada";
		String st = str.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}

		for (Character c : set) {
			int count = 0;
			for (int i = 0; i < st.length(); i++) {
				if (c == st.charAt(i)) {
					count++;
				}
			}
			System.out.println("this " + c + " is occured " + count + " in the string");
		}
	}

}
