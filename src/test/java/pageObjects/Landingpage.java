package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	
	public WebDriver driver;
	
	By search = By.xpath("//input[@type='search']");
	By Productname = By.cssSelector("h4.product-name");
	By topdeals = By.linkText("Top Deals");
	By increment = By.cssSelector("a.increment");
	By addTocart = By.cssSelector(".product-action button");
	
	
	public Landingpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void searchItem(String Itemname) 
	{
		driver.findElement(search).sendKeys(Itemname);
	}
	
	public void getSearchText() 
	{
		driver.findElement(search).getText();
	}
	
	public String getProductname() 
	{
		return driver.findElement(Productname).getText();
	}
	
	public void SelectTopDealsPage() 
	{
		driver.findElement(topdeals).click();
	}
	
	public String getLandingpageTitle()
	{
		return driver.getTitle();
	}
	
	public void IncrementQuantity(int quantity)
	{
		int i = quantity-1;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addTocart()
	{
		driver.findElement(addTocart).click();
	}

}
