package StringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class RemoveDuplicateWordsInAString {
		@Test(priority = -1)
		public void removeDuplicateInAString() {
		String s = "i am a am a software engineer engineer";

		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) {

			set.add(str[i]);
		}
		for (String string : set) {
			System.err.print(string+" ");
		}

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Test(priority = 1)
	public void removeDuplicateWordInAString() {
		String s = "i am a am a software engineer engineer";
		String[] str = s.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i], i);
		}
		for (Entry<String, Integer> m : map.entrySet()) {
			System.err.print(m.getKey()+" ");
		}
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Test(priority = 2)
	public void countOccuranceOfWord() {
		String s = "i am a am a software                  engineer engineer";
		String[] str = s.split("\\s+");
		LinkedHashSet<String> set =new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for (String string : set) {
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(string.equals(str[i])) {
					count++;
				}
			}
			System.err.println(string+" Occures "+count+" Times");
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	}
	@Test(priority = 3)
	public void occuranceOfWordUsingMap() {
		String s = "i am a am a software     software             engineer engineer";
		String[] str = s.split("\\s+");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i],i );
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(m.getKey().equals(str[i])) {
					count++;
				}
			}
			System.err.println(m.getKey()+" Occures "+count+" times");
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Test(priority = 4)
	public void positionOfWordInAString() {
		String s = "i am a am a software                  engineer engineer";
		String[] str = s.split("\\s+");
		LinkedHashSet<String> set =new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for (String string : set) {
			
			for(int i=0;i<str.length;i++)
			{
				if(string.equals(str[i])) {
					System.err.println(string+" position of the word is: "+(i+1));
					break;
				}
			}
			
		}System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
	}
	@Test(priority = 5)
	public void positionOfWordInAStringUsingMap() {
		String s = "i am a am a software     software             engineer engineer";
		String[] str = s.split("\\s+");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i],i );
		}
		for(Entry<String, Integer> m:map.entrySet()) {
			for(int i=0;i<str.length;i++)
			{
				if(m.getKey().equals(str[i])) {
					System.err.println(m.getKey()+" position of the word is: "+(i+1));
					break;
				}
			}
			
		}
	}
	@Test
	public void test1() {
		
		String s ="shiba";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		for(int i=0;i<2;i++)
		{
			System.out.println(s1.charAt(i));
		}
	}
}
