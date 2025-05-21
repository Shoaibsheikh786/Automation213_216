package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable {

	public static void main(String[] args) {

		// tbody/tr[1]/td[1]
		// tbody/tr[1]/td[2]
		// tbody/tr[1]/td[3]
		// tbody/tr[1]/td[4]

		// tbody/tr[2]/td[1]
		// tbody/tr[2]/td[2]
		// tbody/tr[2]/td[3]
		// tbody/tr[2]/td[4]

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");

		// 1 row -> 1 cell

		// 

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				
				String rc=driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
			//	System.out.print(rc+"  ");
				//if System is there i want to print it is present or else it is not present 
				if(rc.equals("SystemABC"))
				{
					System.out.println("it is present");
				}
			}
			System.out.println();
		}

	}

}
