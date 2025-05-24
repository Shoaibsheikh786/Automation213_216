package testNgday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {

	@Test
	public void test1() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("myemail@gmail.com");
		driver.close();
	}

	@Test
	public void test2() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("myemail@gmail.com");
		driver.close();
	}

	@Test
	public void test3() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("myemail@gmail.com");
		driver.close();
	}

	@Test
	public void test4() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("myemail@gmail.com");
		driver.close();
	}
}
