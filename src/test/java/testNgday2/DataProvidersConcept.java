package testNgday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersConcept {
	@Test(dataProvider="userdata",dataProviderClass=MydataProviders.class)
	public void validLoginWithInvalid1(String user,String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	


	
}
