package page;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {
	JavascriptExecutor js;
	@FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
	WebElement addtocart;
	@FindBy(how = How.XPATH, using = "//h4/a")
	WebElement itemlisted;
	@FindBy(how = How.XPATH, using = "//a/i[@class='fa fa-shopping-cart']")
	WebElement shoppingcart;
	
	
	

	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);

	}

	public String vewitemsdetails() {
		return itemlisted.getText();
	}

	public boolean isButtonenable() {
		return addtocart.isDisplayed();
	}

	public void clickontheitem()

	{
		itemlisted.click();
	}
	public void addtocart()
	{
		js.executeScript("arguments[0].click();", addtocart);
	}
	public void shoppingcart()
	{
		shoppingcart.click();
	}
	
	public void ZoomOut()
	{
		js.executeScript("document.body.style.zoom = '.7'");
	}
	public void backtoNormal()
	{
		js.executeScript("document.body.style.zoom = '1'");
	}

}
