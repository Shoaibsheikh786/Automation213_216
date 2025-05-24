package testNgday2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssserition3 {
	
	@Test
	public void test1()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is "+c);
		
		Assert.assertEquals(c, 30);
		
		System.out.println("hello 1");
		
		Assert.assertEquals(c, 50-10);
		
		System.out.println("code after Assetion ");
	}

}
