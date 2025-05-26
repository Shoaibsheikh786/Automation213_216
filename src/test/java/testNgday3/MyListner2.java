package testNgday3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListner2 implements IRetryAnalyzer{
	int t=3;
	int i=0;
	@Override
	public boolean retry(ITestResult result) {
	
		if(i<t)
		{
			i++; //2
			return true;
		}
		return false;
	}

}
