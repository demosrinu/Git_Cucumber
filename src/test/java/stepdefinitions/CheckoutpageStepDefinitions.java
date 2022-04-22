package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import TestUtil.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.Checkoutpage;

public class CheckoutpageStepDefinitions {
	
	public WebDriver driver;
	public String OfferpageProductname;
	public String LandingpageProductname;
	TestContextSetup testContextSetup;
	public Checkoutpage checkoutPage;
	
	public CheckoutpageStepDefinitions(TestContextSetup testContextSetup) 
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutpage();
	}
	
	@Then("verify user has the ability to enter promo code and place the order")
	public void verify_user_has_the_ability_to_enter_promo_code_and_place_the_order()
	{
		Assert.assertTrue(checkoutPage.VerifypromoBtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}
	
	@Then("^user proceeds to checkout  and validate the (.+) items in checkoutpage$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkoutpage(String name)
	{
		checkoutPage.CheckoutItems();
	}

}
