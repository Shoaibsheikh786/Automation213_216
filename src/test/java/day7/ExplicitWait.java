package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
   
		//Wait -> static wait
		
		//Dynamic wait-> 10
		//implicitwait
		
		//ExplicitWait--> particular weblement
		
		//extent version --> FluentWait+additional 
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		
		//Explicit -> No keyword 
		//1. We need to create an object: WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Conditions: is element visible, is element clickable , loaded 
		WebElement ele=driver.findElement(By.xpath("//a[@class='btn btn-sut d-lg-inline-block my-2 my-md-0 ms-md-3']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
	//	Actions act=new Actions(); //97%  3%
		
	//practice [constructor chaining, methods, inheritance, Encapsulation]
		
		//important Topic pending : Page Object Model
	}

}
