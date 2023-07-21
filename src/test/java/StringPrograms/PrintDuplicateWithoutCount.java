package StringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintDuplicateWithoutCount {
	@Test
	public void printDuplicateWithCount() {
		String str = "kanada";
		String s = str.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character == s.charAt(i)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(character + " is present" + count + " times");
			}
		}
	}
}
