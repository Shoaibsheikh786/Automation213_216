package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkoboxed1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		//Find Checkbox 1
		
		WebElement c1=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		//other methods of WebElements
		
//		boolean c1isSel=c1.isSelected();
//		System.out.println(c1isSel);         //false
//		Thread.sleep(2000);
//		c1.click();
//		System.out.println(c1.isSelected());;
		
		String val=c1.getDomAttribute("id");
		System.out.println(val);
		
	
		
		
	}

}
