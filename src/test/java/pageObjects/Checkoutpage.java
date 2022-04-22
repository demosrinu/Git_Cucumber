package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	
	public WebDriver driver;
	
	public Checkoutpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By CartBag = By.cssSelector("[alt='Cart']");
	By CheckoutBtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void CheckoutItems()
	{
		driver.findElement(CartBag).click();
		driver.findElement(CheckoutBtn).click();
	}
	
	public boolean VerifypromoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder() 
	{
		return driver.findElement(placeOrder).isDisplayed();	
	}
}
