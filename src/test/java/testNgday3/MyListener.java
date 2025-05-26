package testNgday3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//interface -> ITestListner (Provided by testNG)

public class MyListener implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("if Test is passed Execute it");
	}

	

	@Override
	public void onTestFailure(ITestResult result) {
		//To take the screenshot of failed tests cases only
		tkScrnshot();
	}
	
	public void tkScrnshot()
	{
		TakesScreenshot tk=(TakesScreenshot)Base.driver;
		File file=tk.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./myscrnshot1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
