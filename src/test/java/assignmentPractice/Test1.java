package assignmentPractice;

public class Test1 {

	public static void main(String[] args) {

		String s = " I am a sdet engineer";

		char ch[] = s.replace(" ", "").toCharArray();
		String rev = "";
		int i = 0;
		int j = ch.length - 1;

		while (j >= 0) {
			if (s.charAt(i) == ' ') {
				rev = rev + s.charAt(i);
			} else {
				rev += ch[j];
				j--;
			}
			i++;
		}
		System.out.println(rev);
	}
}
