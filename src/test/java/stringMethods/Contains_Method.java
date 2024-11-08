package stringMethods;

public class Contains_Method {
	
	public static void main(String[] args) {
		
		String s1="abc";
		String s2="abc";
		/**
		 * contains() is basically used to compare the two string and returns the boolean result
		 */
		if(s1.contains(s2)) {
			System.out.println("String are same");
		}else {
			System.out.println("String are not same");
		}
		System.out.println(s1.contains("d"));
		/**
		 * contentEquals() is basically used to compare the two string and character and that returns the boolean result
		 */
		System.out.println(s2.contentEquals("d"));
	}

}
