package testNgday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class UnderstandingListeners extends Base {
	
	

	@Test
	public void validLoginWithInvalid1() {
		check1(10,12);
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username@123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(false);
	}
 
	//behivour -> 1.pass or 2.Fail
//	@Test
//	public void test1()
//	{  
//		Scanner sc=new Scanner(System.in);
//		int a=10;
//		int b=260;
//		int c=a+b;
//		
//		Assert.assertEquals(c, 30);
//		
//		
//	}
	
	

	
	
}
