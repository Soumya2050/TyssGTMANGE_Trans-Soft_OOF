package assignmentPractice;

import java.util.LinkedHashSet;

public class PrintPositionOfEachDigit {

	public static void main(String[] args) {
		
		int [] a= {5,3,1,1,2,5,6};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer integer : set) {
			for(int i=0;i<a.length;i++)
			{
				if(integer==a[i]) {
					System.out.println(integer+": position is "+(i+1));
					break;
				}
			}
		}

	}

}
