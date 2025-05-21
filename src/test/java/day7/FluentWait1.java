package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		WebElement ele=driver.findElement(By.xpath("//a[@class='btn btn-sut d-lg-inline-block my-2 my-md-0 ms-md-3']"));
	
		FluentWait<WebDriver> wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	}

}
