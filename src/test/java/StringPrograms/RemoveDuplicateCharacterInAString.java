package StringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateCharacterInAString {
	
	@Test
	public void removeDuplicateInAString() {
		String str = "BALASORE";
		char []ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for (Character character : set) {
			System.out.print(character+" ");
		}
	}
}
