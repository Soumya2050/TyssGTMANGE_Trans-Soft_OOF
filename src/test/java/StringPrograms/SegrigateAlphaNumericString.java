package StringPrograms;

public class SegrigateAlphaNumericString {

	public static void main(String[] args) {

		String s = "1b2%a3(t";
		String num = "";
		String spe = "";
		String cha = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				num = num + ch[i];
			} else if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
				cha = cha + ch[i];
			} else {
				spe = spe + ch[i];
			}
		}
		System.err.println(num + " " + cha + " " + spe);
	}
}
