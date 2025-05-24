package testNgday2;

import org.testng.annotations.DataProvider;

public class MydataProviders {
	
	@DataProvider
	public String[][] userdata()
	{
		String arr[][]=
			{
					{"admin1","pass2"},
					{"admin2","pass2"},
					{"admin3","pass3"}
			};
		
		return arr;
	}

}
