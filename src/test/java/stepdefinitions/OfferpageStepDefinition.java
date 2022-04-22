package stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestUtil.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.Landingpage;
import pageObjects.Offerspage;

public class OfferpageStepDefinition {
	
	public WebDriver driver;
	public String OfferpageProductname;
	public String LandingpageProductname;
	TestContextSetup testContextSetup;
	public Landingpage landingpage;
	public Offerspage offerspage;
	
	public OfferpageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
		
	@Then("^user searched for (.+) shortname in offerspage$")
	public void user_searched_for_shortname_in_offerspage(String shortName) {
	    
		switchToOfferspage();
		offerspage = testContextSetup.pageObjectManager.getOfferpage();
		offerspage.searchItem(shortName);
		OfferpageProductname = offerspage.getProductname();
		
	}
	
	public void switchToOfferspage() {
		
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		landingpage = testContextSetup.pageObjectManager.getLandingpage();
		landingpage.SelectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
	}
	

	@Then("validate productname in offerspage matches with landingpage")
	public void validate_productname_in_offerspage_matches_with_landingpage() {
		
		Assert.assertEquals(OfferpageProductname, testContextSetup.LandingpageProductname);
		
	}
}
