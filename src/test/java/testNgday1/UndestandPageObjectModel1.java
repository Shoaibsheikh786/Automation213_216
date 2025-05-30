package testNgday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UndestandPageObjectModel1 {

	@Test
	public void checkRadioButton() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");	
		WebElement ele=driver.findElement(By.xpath("//input[@id='username']"));
	    ele.sendKeys("practice");
		WebElement ele2=driver.findElement(By.xpath("//input[@id='password']"));
		ele2.sendKeys("SuperSecretPassword!");
	   WebElement btn= driver.findElement(By.xpath("//button[@type='submit']"));
	   btn.click();
	}

}
