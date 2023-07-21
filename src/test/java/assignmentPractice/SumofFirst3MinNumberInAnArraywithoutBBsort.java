package assignmentPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SumofFirst3MinNumberInAnArraywithoutBBsort {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5,6};
		
		int fMin =a[0];
		int sMin = a[1];
		int tMin = a[2];
		
		for(int i=1;i<a.length;i++)
		{
			if(fMin>a[i]) {
				tMin= sMin;
				sMin=fMin;
				fMin=a[i];				
			}
			else if(sMin>a[i]|| sMin==a[i]) {
				tMin=sMin;
				sMin=a[i];
			}
			else if(tMin>a[i]||tMin==a[i]) {
				tMin=a[i];
			}
		}
		System.out.println(fMin +" "+sMin+" "+tMin);
		System.out.println(fMin+sMin+tMin);
	}
	@Test
	public void sort() {
//		int [] a= {5,8,3,6,7,12,54};
//		int[]a= {58,69,138,276,39,13,41,12};
		int []a = {5,4,3,2,1,0};
		Arrays.sort(a);
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
