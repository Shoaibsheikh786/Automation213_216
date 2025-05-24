package testNgday1;

import org.testng.annotations.Test;

public class BasicAnononation2 {
  

	@Test(priority=1)
	public void zTestabc()
	{
		System.out.println("This is test Z");
	}
	
	@Test(priority=3)
	public void testabc()
	{
		System.out.println("This is test 1");
	}
	@Test(priority=2)
	public void testxyz()
	{
		System.out.println("This is test 2");
	}
	
	
}
