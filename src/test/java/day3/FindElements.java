package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) {
		
		// we are not searching for one element 
		// multiple webElements 
		
		//FindElement -> single element 
		//FindElements-> list of webElements
		
		//To find how many anchor //a are there in this page
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		
		//how many anchor tags are there
		List <WebElement> li=	driver.findElements(By.tagName("a"));
	//	System.out.println(li.size());
		
//	  WebElement ele=	li.get(0);
//	 String url= ele.getDomAttribute("href");
//	 System.out.println("URL -> "+url);
//	 
//	  WebElement ele2=	li.get(1);
//		 String url2= ele2.getDomAttribute("href");
//		 System.out.println("URL2 -> "+url2);
		
//		for(int i=0;i<li.size();i++)
//		{
//			 WebElement ele=	li.get(i);
//			 String url= ele.getDomAttribute("href");
//			String text= ele.getText();
//			
//			System.out.println(text+"  -> "+url);
//			 
//		}
	  
	}

}
