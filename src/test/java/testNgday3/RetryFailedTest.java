package testNgday3;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryFailedTest {
	
	@Test(retryAnalyzer=MyListner2.class)
	public void test1()
	{
		System.out.println("Hello world");
		Assert.fail();
	}

}
