package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//find forget password link
	//	driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link text
	//	driver.findElement(By.partialLinkText("Forgotten passw")).click();
	}

}
