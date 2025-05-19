package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		driver.switchTo().frame("iframeResult");
		WebElement img1=driver.findElement(By.xpath("//img[@alt='Smiley']"));
	  //1.MouseOver action /advanced interactions 
		//1.Actions Class 
		Actions act=new Actions(driver);
		//mouseOver/->moveToElement
		//1. build().perform();
		act.moveToElement(img1).build().perform();
	}

}
