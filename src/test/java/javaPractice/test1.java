package javaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class test1 {

	@Test
	public void boubleSort() {

		int a[] = { 1, 4, 8, 7, 12, 25, 14, 145 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	@Test
	public void string() {
		String s = "soumyaranjan";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);

				if (str.length() > 1) {
					System.out.println(str);
				}
			}
		}
	}

	@Test
	public void test() {
		String s = "Swiss".toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character c : set) {
			System.out.print(c);
		}

	}

	@Test
	public void ConsecutiveCharacters() {
		String s = "aaaaaaaaaaaaaaaaaabbcaacddddddddccccccc";
        int maxCount = 1;  // Start maxCount at 1 to handle at least one character
        int currentCount = 1;  // Start currentCount at 1 to count the first character
        char maxChar=s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
        	System.err.println(s.charAt(i-1));
        	
        	System.out.println(s.charAt(i));
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;  // Increase count if the current character matches the previous one
            } else {
                currentCount = 1;  // Reset count if the characters are different
            }
            
            if (currentCount > maxCount) {
                maxCount = currentCount;  // Update maxCount if the currentCount is greater
                maxChar=s.charAt(i);
            }
        }
        
        System.out.println(maxChar+" is occures :- "+maxCount);  // Output the maximum consecutive characters count
    }
	
	@Test
	public void a() {
		
		String s="Hydrabad";
		System.out.println((s.substring(0, 2))+(s.substring(3,5))+(s.substring(6)));
				
	}

}
