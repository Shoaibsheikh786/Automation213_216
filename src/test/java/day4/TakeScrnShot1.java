package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScrnShot1 {

	public static void main(String[] args) throws IOException {
  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		//Interface in selenium which will help us to take screenshot
		//1.TakesScreenshto
		//Convert our driver to TakesScreenshot Inteface
		 
		TakesScreenshot tk1=(TakesScreenshot)driver;
       
		//2. in TakesScreenshot there is one method, getScreenshot
		  File file=  tk1.getScreenshotAs(OutputType.FILE);
		//3. Copy the screenshot to C:D;
		  FileUtils.copyFile(file, new File("./myscrn11.png"));
	}

}
