package numberProgram;

import org.testng.annotations.Test;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		
		int n=121;
		int rem=0,sum=0,temp=n;
		
		while(n>0)
		{
//			rem=rem*10+n%10;
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("This is number palindrome ");
		}else {
			System.out.println("This is not number palindrome ");
		}
	}
	@Test
	public void t() {
		
		String s="abc";
		String s1="456";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			s2+=s.charAt(i)+""+s1.charAt(i);
		}
		System.out.println(s2);
	}

}
