package testNgday2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertin1 {
	//1. for Hard Assertion we dont need any object 
        // Soft Assertion we need to create an object of SoftAssert class
	
	//2. In HardAssertion :if one assertion is getting falied the rest of code will not be 
	  //    exectued .
	    //reverse of it 
	
	@Test
	public void test1()
	{
		SoftAssert sf=new SoftAssert();
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is "+c);
		
	//	Assert.assertEquals(c, 30);
		sf.assertEquals(c, 30);
		System.out.println("hello 1");
		
	//	Assert.assertEquals(c, 50-10);
		sf.assertEquals(c, 50-10);
		System.out.println("code after Assetion ");
		
		//asertAll();
		sf.assertAll();
	}
}
