package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		//Here my control is on the main page
		
		driver.switchTo().frame("mce_0_ifr");
		
		//1.Webelemnt is inside the iframe
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Hello world");
	
	    //2. find some webelment which is not inside the iframe
		//switch my control back to the main page
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='About']")).click();
	}

}
