package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadAsProject {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("./config.properties");
		FileInputStream fis=new FileInputStream(file);
	    Properties pr=new Properties();
	    pr.load(fis);
	    
	    String b=pr.getProperty("browser");
	    System.out.println(b);
	    
	    if(b.equals("chrome"))
	    {
	    	WebDriver driver=new ChromeDriver();
	    
	    }
	    else if(b.equals("firefox"))
	    {
	    	WebDriver driver=new FirefoxDriver();
	    }
	    else if (b.equals("Edge"))
	    {
	    	WebDriver driver=new EdgeDriver();
	    }
	    else
	    {
	    	System.out.println("Browser not found "+b);
	    }
	    
	}

}
