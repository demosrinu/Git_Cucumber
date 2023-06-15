package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerspage {
	
	public WebDriver driver;
	
	By search = By.xpath("//input[@type='search']");
	By Productname = By.cssSelector("tr td:nth-child(1)");
	By searching = By.xpath("//input[@type='search']");//dummy
	
	//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 - git token
	public Offerspage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchItem(String Itemname) {
		driver.findElement(search).sendKeys(Itemname);
	}
	
	public String getProductname() {
		return driver.findElement(Productname).getText();
	}

}
