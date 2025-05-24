package testNgday1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class preConditonPostConditions {

	@BeforeTest
	public void bTest() {
		System.out.println("** BEFORE TEST ** ");
	}

	@BeforeMethod
	public void setup() {
		System.out.println("### BEFORE METHOD ###");
		
	}

	@Test
	public void loginTest1() {
		System.out.println("enter username");
	}

	@Test
	public void loginTest2() {

		System.out.println("enter username abc");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("AFTER METHOD ");
	}

	@AfterTest
	public void afterTEst() {
		System.out.println(" ***After Test ***");
	}

}
