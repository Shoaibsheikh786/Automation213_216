package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingWithCalanders {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebElement m;
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		// value of m should oct
		String month = m.getText();
		while (month ==("October")) {  
			//==  .equals()
			//!=  !.equa                                                                                                                        ls()
			WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}

		
		// select the day

	}

}
