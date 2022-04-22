package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestUtil.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Landingpage;

public class LandingpageStepdefinition {
	
	public WebDriver driver;
	public String OfferpageProductname;
	public String LandingpageProductname;
	TestContextSetup testContextSetup;
	public Landingpage landingpage;
	
	public LandingpageStepdefinition(TestContextSetup testContextSetup) 
	{
		this.testContextSetup=testContextSetup;
		this.landingpage = testContextSetup.pageObjectManager.getLandingpage();
	}
	
	@Given("user is on Greenkart landingpage")
	public void user_is_on_greenkart_landingpage() 
	{
		Assert.assertTrue(landingpage.getLandingpageTitle().contains("GreenKart"));
	}
	
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws Exception 
	{
		landingpage.searchItem(shortname);
	    Thread.sleep(2000 );
		testContextSetup.LandingpageProductname = landingpage.getProductname().split("-")[0].trim();
		System.out.println(testContextSetup.LandingpageProductname+" is extracted from Homepage");
	}
	
	@And("Added {string} items to the selected product to cart")
	public void Added_items_to_the_selected_product_to_cart(String quantity)
	{
		landingpage.IncrementQuantity(Integer.parseInt(quantity));
		landingpage.addTocart();
	}
	

	
	
}
