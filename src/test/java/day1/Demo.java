package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		//1. Open the browser: chrome, firefox, edge
		   //cnt shift o
		
		 //ChromeDriver()
		 //FirefoxDriver()
		//EdgeDriver()
		
		//WebDriver Methods 
		
		WebDriver driver=new ChromeDriver();
		
		//methods to deal with the browser
		//.get(url) -> Type that url 
		driver.get("https://www.facebook.com");
		
		//To maximise the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);   //wait for 2 sec
	    driver.navigate().refresh();
	    Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	    Thread.sleep(2000); //wait for 2 sec
	//	driver.close();  //close the current tab
		driver.quit();   //close the browser, all the tabs
		
		
		
		
		
		
	}

}
