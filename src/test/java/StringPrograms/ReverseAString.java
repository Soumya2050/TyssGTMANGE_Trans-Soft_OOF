package StringPrograms;

import org.testng.annotations.Test;

public class ReverseAString {
	@Test
	public void method1(){
		/*method 1*/
		String str = "software";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	@Test
	public void method2() {
		/* method 2*/
		String string = "software";
		String s1 = "";
		for(int i=string.length()-1;i>=0;i--)
		{
			s1+=s1.charAt(i);
		}
		System.out.println(s1);
	}
	@Test
	public void method3() {
		String str = "software";
		char[]ch = str.toCharArray();
		String rev = "";
		for(int i =ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		System.out.println(rev);
	}
	@Test
	public void method4() {
		String str = "software";
		char[]ch = str.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
	@Test
	public void method5() {
		String str = "software";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	@Test
	public void method6() {
		String str = "software";
		String []s = str.split("");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}

}
