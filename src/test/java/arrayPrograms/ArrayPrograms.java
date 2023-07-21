package arrayPrograms;

import org.testng.annotations.Test;
/**
 * ArrayPrograms
 * @author srjen
 *
 */
public class ArrayPrograms {
/**
 * toSortAnArrayInAscendringOrderUsingBBsort
 */
	@Test(priority = 1)
	public void toSortAnArrayInAscendringOrderUsingBBsort() {
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
			System.err.println(a[i]);
		}
		System.out.println();
	}
/**
 * toSortAnArrayInDescendringOrderUsingBBsort
 */
	@Test(priority = 2)
	public void toSortAnArrayInDescendringOrderUsingBBsort() {
		int[] a = { 5, 10, 45, 32, 65, 75 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.err.println("The first min num in array is :" + a[a.length - 1]);
		System.err.println("The first min num in array is :" + a[a.length - 2]);
		System.err.println("The sorted array in Descendring order is: ");
		for (int i = 0; i < a.length; i++) {
			System.err.println(a[i]);
		}
		System.out.println();
	}
/**
 * sumOf1St3MaxNumberIs
 */
	@Test(priority = 3)
	public void sumOf1St3MaxNumberIs() {
		int[] a = { 5, 10, 45, 32, 65, 75 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += a[i];
		}
		System.err.println("The sum of 3 max number is " + sum);
		System.out.println();
	}
/**
 * sumOf3MinNumberInAnArray
 */
	@Test(priority = 4)
	public void sumOf3MinNumberInAnArray() {
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
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.err.println(a[i]);
			sum += a[i];
		}
		System.err.println("The sum of 3  min number is " + sum);
		System.out.println();
	}
/**
 * MulOf3MinNumberInAnArray
 */
	@Test(priority = 5)
	public void MulOf3MinNumberInAnArray() {
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
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			System.err.println(a[i]);
			mul *= a[i];
		}
		System.err.println("The mul of 3  max number is " + mul);
		System.out.println();
	}
/**
 * MulOf3MaxNumberInAnArray
 */
	@Test(priority = 6)
	public void MulOf3MaxNumberInAnArray() {
		int[] a = { 5, 10, 45, 32, 65, 75 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int mul = 0;
		for (int i = 0; i < 3; i++) {
			System.err.println(a[i]);
			mul += a[i];
		}
		System.err.println("The mul of 3  min number is " + mul);
		System.out.println();
	}
/**
 * print1StMaxNumberInAnArryWithoutBBsort
 */
	@Test(priority = 7)
	public void print1StMaxNumberInAnArryWithoutBBsort() {
		int[] a = { 5, 10, 145, 32, 65, 75 };
		int asc = a[0];
		for (int i = 0; i < a.length; i++) {
			if (asc < a[i]) {
				asc = a[i];
			}
		}
		System.err.println(asc);
		System.out.println();
	}
/**
 * print1StminNumberInAnArryWithoutBBsort
 */
	@Test(priority = 8)
	public void print1StminNumberInAnArryWithoutBBsort() {
		int[] a = { 5, 10, 145, 32, 65, 75 };
		int desc = a[0];
		for (int i = 0; i < a.length; i++) {
			if (desc > a[i]) {
				desc = a[i];
			}
		}
		System.err.println(desc);
		System.out.println();
	}
/**
 * FirstAnd2NdMinNumberInAnArry
 */
	@Test(priority = 9)
	public void FirstAnd2NdMinNumberInAnArry() {
		int a[] = { 5, 2, 1, 3, 0, 4 };
		int fMin = a[0];
		int sMin = a[1];
		for (int i = 0; i < a.length; i++) {
			if (fMin > a[i]) {
				sMin = fMin;
				fMin = a[i];
			} else if (sMin > a[i] && a[i] != fMin) {
				sMin = a[i];
			}
		}
		System.err.println(fMin + "   " + sMin);
		System.out.println();
	}
/**
 * FirstAnd2NdMaxNumberInAnArry
 */
	@Test(priority = 10)
	public void FirstAnd2NdMaxNumberInAnArry() {
		int a[] = { 5, 2, 1, 3, 0, 4 };// 521304
		int fMax = a[0];// 5,
		int sMax = a[1];// 2,3,4
		for (int i = 0; i < a.length; i++)// i=0,i=1,2,3,4,5
		{
			if (fMax < a[i]) {// 5<5,5<2,5<1,5<3,5<3f,5<0,5<4
				sMax = fMax;
				fMax = a[i];
			} else if (sMax < a[i] && a[i] != fMax) {// 2<5f &&5!5f,2<2&&2!=5f,2<1&&1!=5f,2<3&&3!=5t,3<0&&0!=3f,3<4
														// &&4!=5t
				sMax = a[i];
			}
		}
		System.err.println(fMax + "   " + sMax);
		System.out.println();
	}
	/**
	 * append0SAtLast
	 * output = 4 6 1 0 0 0
	 */
	@Test(priority = 11)
	public void append0SAtLast() {
		int a[] = { 0, 4, 0, 6, 0, 1 };
		int b[] = new int[a.length];
		int m = 0;
		int n = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[m] = a[i];
				m++;
			} else {
				b[n] = a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.err.println(b[i]);
		}
		System.out.println();
	}

	/**
	 * printlnCombinationOfTwoNumber
	 * input = { 9, 7, 8, 5, 2, 4, 3, 6 } errput=9 2,7 4,8 3,5 6
	 */
	@Test(priority = 12)
	public void printlnCombinationOfTwoNumber() {
		int[] a = { 9, 7, 8, 5, 2, 4, 3, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == 11) {
					System.err.println(a[i] + " " + a[j]);
				}
			}
		}
		System.out.println();
	}

	/**
	 * additionOfTwoArray
	 */
	@Test(priority = 13)
	public void additionOfTwoArray() {
		int[] a = { 4, 2, 5, 1, 3 };
		int b[] = { 3, 1, 6, 4 };
		int length = a.length;
		if (a.length < b.length) {
			length = b.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.err.println(a[i] + b[i] + " ");
			} catch (Exception e) {
				if (a.length < b.length) {
					System.err.println(b[i] + " ");
				} else
					System.err.println(a[i] + " ");
			}
		}
	}

	/**
	 * output = 1 3 7 15 31 63
	 */
	@Test(priority = 14)
	public void a() {
		int result = 0;
		for (int i = 1; i <= 6; i++) {
			System.out.println(result);
			result = result * 2 + 1;
		}
	}
}
