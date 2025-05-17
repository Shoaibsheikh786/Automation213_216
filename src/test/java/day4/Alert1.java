package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		
		driver.findElement(By.id("js-alert")).click();
		
		Thread.sleep(2000);
		//Alert will be there
		
		//Switch our control to alert
		Alert al=driver.switchTo().alert();
		al.accept();
	}

}
