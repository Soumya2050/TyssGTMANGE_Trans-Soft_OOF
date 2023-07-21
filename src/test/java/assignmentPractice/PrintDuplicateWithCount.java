package assignmentPractice;

import java.util.LinkedHashSet;

public class PrintDuplicateWithCount {

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6};

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
			if (count > 1) {
				System.out.println(integer + ": occures" + count + " times");
			}

		}
	}
}
