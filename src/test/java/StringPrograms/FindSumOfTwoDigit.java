package StringPrograms;

public class FindSumOfTwoDigit {
		
	public static void main(String[] args) {
		
		String s = "a11b12c3";
		int sum=0;
		int temp=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0'&& ch<='9')
			{
				temp = temp*10+(ch-48);
			}else {
				sum = sum+temp;
				temp=0;
			}
		}
		sum=sum+temp;
		System.out.println(sum);
	}
}
