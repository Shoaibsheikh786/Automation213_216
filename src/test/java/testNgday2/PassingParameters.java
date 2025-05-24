package testNgday2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameters {

	@Test
	@Parameters("browser")
	public void test1(String b) 
	{
		System.out.println("This is my browser  "+b);
	}
}
