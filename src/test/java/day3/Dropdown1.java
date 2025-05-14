package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		// i want to deal with country dd
		// 1. to check the tag
		// 1. Select
		// we need create an object of Select Class
		// in the constructor we neeed to pass WebElement
		WebElement ele = driver.findElement(By.xpath("//select[@id='country']"));
		Select sel = new Select(ele);
		//1.select by index
	   // sel.selectByIndex(1);
		
		//2. select By text
		//sel.selectByVisibleText("Lebanon");
		
		//3. select By value
		sel.selectByValue("MX");
		
		

	}

}
