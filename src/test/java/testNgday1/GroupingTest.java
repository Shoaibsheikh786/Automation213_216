package testNgday1;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingTest {
	
	@BeforeGroups(groups="reg")
	public void befReg()
	{
		System.out.println("Before code for RegRession");
	}
	
	@Test(groups="smoke")
	public void loginTest() 
	{ 
		
		System.out.println("Smoke Test");
	}

	@Test(groups="reg")
	public void logoutTest()
	{
		System.out.println("Regression Test");
	}

	@Test(groups="reg")
	public void addToCart()
	{
		System.out.println("Regression Test");
	}

}
