package StringPrograms;

import org.testng.annotations.Test;

public class PrintPositionOfEachCharacterWithDuplicate {
	
	@Test
	public void positionOfCharacter() {
		
		String str = "KANADA";
		String s = str.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			System.err.println(s.charAt(i)+" Position is "+ (i+1));
		}
	}
}
