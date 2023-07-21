package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveDuplicateCharacterUsingMap {
	
	@Test
	public void removeDuplicate() {
		String s = "Kannada";
		String str = s.toLowerCase();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i),count );
			count++;
		}
		for (Entry<Character, Integer> a:map.entrySet()) {
			
			System.err.println(a.getKey()+" : "+a.getValue());
			
		}
	}
}
