package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	
	@Test
	public void fileUp()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.file.io/");
		
		//location  : C:\Users\Admin\OneDrive\Desktop\newFoler\My216Project\AiMl.txt;
	  WebElement ele=driver.findElement(By.id("select-files-input"));
      
	  ele.sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\newFoler\\My216Project\\AiMl.txt");
	}

}
