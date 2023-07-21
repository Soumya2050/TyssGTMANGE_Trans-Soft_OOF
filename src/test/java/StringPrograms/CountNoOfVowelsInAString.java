package StringPrograms;

public class CountNoOfVowelsInAString {
	
	public static void main(String[] args) {
		
		String s="India";
		String str = s.toLowerCase();
		char[] ch = str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
		}
		System.out.println("number of vowels present in a string: "+count);
	}

}
