package StringPrograms;

import org.testng.annotations.Test;

public class ReverseAWordInAString {
	
	@Test
	public void reverseWordInaString() {
		String str = "i am a god boy";
		String [] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		
	}
	@Test(priority = 1)
	public void reverseEachwordInAString() {
		
		String str = "i am a god boy";
		String s1 = "";
		String [] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			StringBuilder sb = new StringBuilder(s[i]);
			
			s1+=sb.reverse().toString()+" "	;	
		}
		System.out.println(s1);
	}
	
	@Test(priority = 2)
	public void reverseAwordInAStringMethod2() {
		String str = "I am a software Engineer";
		String[]s = str.split(" ");
		String rev ="";
		for(String string : s) {
			String r="";
			for(int i=string.length()-1;i>=0;i--)
			{
				r= r+string.charAt(i);
			}
			rev = rev+" "+r;
		}
		System.err.print(rev);
	}
	
	@Test(priority = 3)
	public void reverseAwordInAstringWithoutUsingSplit() {
		String str = "mY name is SoumyaRanjan";
		String s="";
		String s1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		System.out.println(s1);
		for(int i=0;i<s.length();i++)
		{
		}
		
		
	}
}
