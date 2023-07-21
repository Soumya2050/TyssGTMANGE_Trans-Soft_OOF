package StringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class PrintPositionOfCharacterWithoutDuplicate {
	
	@Test
	public void PositionOfCharacterWithoutDuplicate() {
		String str = "Kannada";
		String st = str.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}

		for (Character c : set) {
			for (int i = 0; i < st.length(); i++) {
				if (c == st.charAt(i)) {
					System.err.println(st.charAt(i)+" Position is "+ (i+1));
					break;
				}
			}			
		}
	}
	@Test
	public void positionOfEachCharacterWithoutDuplicate() {
		
		String s = "kannada";
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			for(int i=s.length()-1;i>=0;i--)
			{
				if(character==s.charAt(i))
				{
					System.err.println(s.charAt(i)+" Position is "+ (i+1));
					break;
				}
			}
		}
	}
	
	@Test
	public void occuranceOfEachCharacterUsingMap() {
		
		String s = "KaNnAdA";
		String str = s.toLowerCase();
		
		LinkedHashMap<Character,Object> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), i);
		}
		for( Entry<Character, Object> m : map.entrySet()) {
			int count = 0;
			for(int i=0;i<str.length();i++)
			{
				if(m.getKey() == str.charAt(i)) {
					count++;
				}
			}
			System.err.println(m.getKey()+" is occures "+count+" times");
		}
	}
}
