package regularExpression;

import java.util.regex.*;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s="my birthday is 00-12-2023";
		Pattern p = Pattern.compile("[0-9-]");
		Matcher m = p.matcher(s);
		
		while(m.find())
		{			
			System.out.print(/*m.start()+"--"+m.end()+"==>"/+*/m.group());
		}

		
	}

}
