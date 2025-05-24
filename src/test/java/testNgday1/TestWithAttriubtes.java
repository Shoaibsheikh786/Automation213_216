package testNgday1;

import org.testng.annotations.Test;

public class TestWithAttriubtes {
//1. change the order of test
	 //priority 
//2. enabled =false
//3. invocationCount=5
//4. invocationTimeOut=2
//5. dependsOnMethods="loginTest"
	
	@Test()
	public void loginTest() 
	{ 
		
		System.out.println("This is Login Test");
	}

	@Test()
	public void logoutTest()
	{
		System.out.println("This is Logout Test ");
	}

}
