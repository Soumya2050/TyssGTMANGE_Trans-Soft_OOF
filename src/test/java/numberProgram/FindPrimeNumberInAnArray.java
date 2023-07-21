package numberProgram;

public class FindPrimeNumberInAnArray {
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4, 5, 7 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 1; j <=a[i]; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.err.print(a[i] + " ");
			}

		}
	}

}
