package testNgday1;

import org.testng.annotations.Test;

public class FindMissinNumber {
	
	@Test
	public void findMissingNumber()
	{            // 0 1 2 3
		int arr[]= {1,2,3,5};
		int actSum=0;
		for(int i=0;i<arr.length;i++)
		{
			actSum=actSum+arr[i];
		}
		
			int n=arr[arr.length-1];
			int tSum=n*(n+1)/2;
			
			System.out.println(tSum);
			
			
		
	}

}
