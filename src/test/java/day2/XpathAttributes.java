package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttributes {

	public static void main(String[] args) {
		// 1.open chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement emailBox = driver.findElement(By.xpath("//input[@id='email']"));
		emailBox.sendKeys("hello@gmail.com");
		
		WebElement passwordBox=driver.findElement(By.xpath("//input[@type='password']"));
	    passwordBox.sendKeys("abceADim");
	}

}
