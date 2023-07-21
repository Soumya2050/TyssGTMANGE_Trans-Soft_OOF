package assignmentPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInAnArray {

	public static void main(String[] args) {
		
		int [] a= {5,3,1,1,2,5,6};
		
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
		}
		System.out.println(list);
	}
	
}
