package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String win1=driver.getWindowHandle();
		System.out.println("Window1 Address  "+win1);
		
		Set<String> allWin=driver.getWindowHandles();
		//How to get data from set
		List<String> li=new ArrayList<>(allWin);
		
		String w2=li.get(1);
		System.out.println("Window2 Address "+w2);
		
		String title=driver.getTitle();
		System.out.println(title);
		//1. swith the control from 1 window to another i need address
		driver.switchTo().window(w2); //control ---> another page
		
		String t2=driver.getTitle();
		System.out.println(t2);
		
		//driver.close()
		//driver.quit();
		Thread.sleep(2000);
//		driver.close();
		driver.switchTo().window(win1);
		
		
		           
		
	}

}
