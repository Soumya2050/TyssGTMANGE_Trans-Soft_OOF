package arrayPrograms;

public class toSortAnArrayInAscendringOrderUsingBBsort {

	public static void main(String[] args) {

		int[] a = { 5, 10, 45, 32, 65, 75 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.err.println("The first max num in array is :" + a[a.length - 1]);
		System.err.println("The first max num in array is :" + a[a.length - 2]);
		System.err.println("The sorted array is");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
