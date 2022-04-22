package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public Landingpage landingpage;
	public Offerspage offerspage;
	public Checkoutpage checkoutPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public Landingpage getLandingpage() 
	{
		landingpage= new Landingpage(driver);
		return landingpage;
	}
	
	public Offerspage getOfferpage() 
	{
		offerspage = new Offerspage(driver);
		return offerspage;
	}
	
	public Checkoutpage getCheckoutpage()
	{
		checkoutPage = new Checkoutpage(driver);
		return checkoutPage;
	}

}
