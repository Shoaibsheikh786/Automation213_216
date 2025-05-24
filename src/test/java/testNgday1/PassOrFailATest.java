package testNgday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PassOrFailATest {
  
	//How to validate a test
	//Assertions 
	
	@Test
	public void checkFbPage() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    
	    //Error message i am expecting
	    /*
	     * The email address or mobile number you entered 
	     * isn't connected to an account. Find your account and log in.*/
	 //Assertions
	    
     /*int a=0, 1,1,2,3
      *int b=1, 1,2,3,5
      * c= 1  , 2,3,5,8
      * 
      * a=b;
      * b=c
      * 
      **/
	}
}
