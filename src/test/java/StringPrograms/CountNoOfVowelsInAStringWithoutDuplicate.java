package StringPrograms;

import java.util.LinkedHashSet;

public class CountNoOfVowelsInAStringWithoutDuplicate {
	
	public static void main(String[] args) {
		
		String s="India";
		String str = s.toLowerCase();
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(s.charAt(i));
		}
		int count =0;
		for (Character character : set) {
			
				if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u') {
					count++;
					System.err.print(character);
			}
				if(count>1)
					System.out.println(character+" occures "+count);
		}
		System.out.println(count);
		
		
	}
}
