package testNgday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	/* Verify login with invlalid crent..
	 * Open chrome
	 * Enter url https://practice.expandtesting.com/login
	 * Enter username as abc
	 * Enter password as admin123
	 * Click on Login
	 * Exp and Act
	 * User can see Error message "Your password is invalid!"
	 * 
	 * */
	
	@Test
	public void validLoginWithInvalid()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
        //ExpRes ErroMessage: Your password is invalid!
	  String actErrMsg= driver.findElement(By.xpath("//div[@id='flash']/b")).getText();
	  String expErrMsg="Your password is invalid!";
	//  System.out.println(actErrMsg);
	  Assert.assertEquals(actErrMsg,expErrMsg);
	  
	}
	
	
	
	@Test
	public void validLoginWithvalid()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pradctice");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ScuperSecretPassword!");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
       
	    //Exp Title: Secure Page page for Automation Testing Practice
    String actTitle=    driver.getTitle();
    String expTitle= "Secure Page page for Automation Testing Practice";
	Assert.assertEquals(actTitle, expTitle);
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
        
}
