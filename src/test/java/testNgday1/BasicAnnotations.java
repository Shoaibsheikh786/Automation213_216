package testNgday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
   WebDriver driver;
   @BeforeMethod()
   public void setup()
   {
	 driver=new ChromeDriver(); 
   }
	@Test
	public void checkRadioButton()
	{
		
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.findElement(By.xpath("//input[@id='red']")).click();
	}
	
	@Test
	public void checkCheckbox()
	{
	
		driver.get("https://practice.expandtesting.com/checkboxes");
		
		WebElement c1=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		c1.click();
	}
}
