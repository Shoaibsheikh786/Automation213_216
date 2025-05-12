package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
     //1. Open chrome
		//2.WebDriver --> interface
		//3.ChromeDriver -> class
		WebDriver driver=new ChromeDriver();
     //2. Open facebook.com
		driver.get("https://www.facebook.com/");
		
	//3. i want to find email input field 
		//id of email input box -> email
		
	 WebElement ele=	driver.findElement(By.id("email"));
	 
	 //ele.somecode() --> this code will be applied on which element (Email box)
		 //sendKeys();-> type some data 
	 ele.sendKeys("myemail@gmail.com");
	
	 
	 //4. i want to find password input field
//	 WebElement ele2=  driver.findElement(By.id("pass"));
	  //ele2--> represents password input field
//	 ele2.sendKeys("admin@1234");
	 driver.findElement(By.id("pass")).sendKeys("mypass2@!23");
	 
	 //First we find the weblement ; then action
	 
	 //Action -> sendKeys(_), click();
	 
	 //find login button
	 
	 driver.findElement(By.name("login")).click();
	 
	 //Step to add dependencies
	   //1. create maven project
	   //2. go to pom.xml file
	   //3. write <dependencies> tag </dependencies>
	   //4. go to https://mvnrepository.com/ ,copy selenium webdriver dependcy 
	   //5. paste into the dependencies
	    //example 
	    /*
	     * 
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.32.0</version>
		</dependency>
	</dependencies>
	     * */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
