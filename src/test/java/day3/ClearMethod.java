package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//wait for maximum 10 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailBox = driver.findElement(By.xpath("//input[@id='email']"));
		emailBox.sendKeys("hello@gmail.com");
	    
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
		
	    WebElement logout=	driver.findElement(By.xpath("//button[text()='Logout']"));
		logout.click();
	}

}
