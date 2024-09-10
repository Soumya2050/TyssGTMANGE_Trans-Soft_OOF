package numberProgram;

import java.util.*;;

public class FibonanciSerieseUsingRecursion {

	static int n, n1 = 0, n2 = 1, i = 1, sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		n = sc.nextInt();
		System.out.println(n1+"\n"+n2);
		m1();
	}
	public static void m1() {
		if (i <= n) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
			i++;
			m1();
		}
	}

}
