package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="F:\\Selenium_Practice\\POMCucumberDatadrivenExtent\\src\\test\\java\\features",
					glue="stepdefinitions",
					tags="@PlaceOrder or @Offerspage",
					monochrome=true,
					plugin= {"pretty","html:target/report.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/failed_scenarios.txt"})
//tags,dryRun,plug-in pretty
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}
