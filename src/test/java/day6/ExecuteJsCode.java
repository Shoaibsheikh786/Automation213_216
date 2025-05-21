package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJsCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://practice.expandtesting.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='search-input']"));

		// JavaScript
		
		// sendKeys -> value
		// js.executeScript("arguments[0].value='thisisjav'", ele);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,5000);");
        
		Thread.sleep(2000);
		WebElement scU = driver.findElement(By.id("back-to-top"));
	//	scU.click();
		js.executeScript("arguments[0].click()",scU);
		

	}
}
