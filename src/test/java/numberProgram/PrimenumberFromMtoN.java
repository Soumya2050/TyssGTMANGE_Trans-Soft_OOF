package numberProgram;

public class PrimenumberFromMtoN {

	public static void main(String[] args) {
		int m = 1;
		int n = 20;
		for (int i = m; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.err.print(i+" ");
			}
		}
	}
}
