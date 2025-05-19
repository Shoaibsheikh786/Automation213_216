package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
	  WebElement r1=  driver.findElement(By.xpath("//div[@class='red']"));
	  WebElement t= driver.findElement(By.xpath("//div[@id='target']"));
	  
	  //1.Actions class 
	  Actions act=new Actions(driver);
	  //2.To drag n drop -> dragndrop
	  act.dragAndDrop(r1, t).build().perform();
	}

}
