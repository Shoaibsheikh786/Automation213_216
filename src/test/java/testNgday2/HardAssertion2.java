package testNgday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion2 {
	
	@Test
	public void validLoginWithvalid()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //we will check, is Logout button displayed or not
	    
	 boolean b=   driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).isDisplayed();
	  
	 //b--> true, false
	// Assert.assertEquals(b, true);
	// Assert.assertTrue(b);
	}
}
