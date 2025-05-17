package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		driver.findElement(By.id("js-confirm")).click();
		Thread.sleep(2000);
		//there will be alert 
		//1. Change the control 
		Alert al=    driver.switchTo().alert();
		al.dismiss();
	}

}
