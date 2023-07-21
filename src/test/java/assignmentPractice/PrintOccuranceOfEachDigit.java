package assignmentPractice;

import java.util.LinkedHashSet;

public class PrintOccuranceOfEachDigit {

	public static void main(String[] args) {

		int[] a = { 5, 3, 1, 1, 2, 5, 6 };

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (Integer integer : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (integer == a[i]) {
					count++;
				}
			}
			System.out.println(integer + ": occures" + count + " times");
		}

	}

}
