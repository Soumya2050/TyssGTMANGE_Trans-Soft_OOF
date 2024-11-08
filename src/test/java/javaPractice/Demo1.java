package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Demo1 {

	public static void main(String[] args) {

		String s = "aaabbbcccddd";

		int n = 3;
		int len = s.length();
		int part = len / n;
		if (len % n == 0) {
			StringBuilder sb = new StringBuilder();
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				sb.append(s.charAt(i));
				count++;

				if (count == part) {
					System.out.println(sb.toString());
					sb.setLength(0);
					count = 0;
				}
			}
		}

	}
	
	@Test
	public void m() {
		String s = "aaabbbcccddd";
		int n=3;
		for(int i=0;i<s.length();) {
			System.out.println(s.substring(i, i+n));
			i+=n;
		}
	}
	
	@Test
	public void m2() {
		String s = "aaabbbcccddd";
		
		LinkedHashMap<Character, Object>map = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), null);
		}
		
		for(Map.Entry m : map.entrySet()) {
			int count=0;
			
			for(int i=0;i<s.length();i++) {
				
				if(m.getKey().equals(s.charAt(i))) {
					count++;
				}
			} 
			if(count>1) {
				System.out.println(m.getKey()+" occurres "+ count);
			} 
		}
		
	}
	
	@Test
	public void expandString() {
		String s = "a2b3c4d2";
		
		for(int i=0;i<s.length();i+=2) {
			char ch = s.charAt(i);
			
			int count=Character.getNumericValue(s.charAt(i+1));
			
			for(int j=0;j<count;j++) {
				System.out.print(ch);				 	 
			}
		}
	}

}
