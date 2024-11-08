package stringMethods;

public class CompareTo_Method {

	public static void main(String[] args) {

		String s = "abc";
		String s1 = "";
		/**
		 * compareTo() is basically compare the length and return the integer value
		 */
		int str = s.compareTo(s1);
		/**
		 * compareToIgnoreCase() is basically compare the length and return the integer value
		 */
		int str1 = s.compareToIgnoreCase(s1);
		System.out.println(str+"\n"+str1);
	}

}
