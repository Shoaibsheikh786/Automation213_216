package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//dryRun=true
//tags="@tagName"
//reports: html json xml
/**plugin= {"html:./Reports/myhtmlreport.html",
				 "json:./Reports/myjsonReport.json"} */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/addTocart.feature",
		glue="stepDefinition" //[all classes]   
		
		
		)
public class TestRunner {

}
