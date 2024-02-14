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
	@FindBy(how = How.CSS, using = "input[placeholder=\"Search\"]")
	WebElement searchbar;
	@FindBy(how = How.CSS, using = "button[class=\"btn btn-default btn-lg\"]")
	WebElement searchbutton;
	@FindAll(@FindBy(how = How.XPATH, using = "//form/div/table/tbody/tr/td[@class=\"text-left\"]/a"))
	List<WebElement> list;
	
	
	

	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);

	}

	public List<WebElement> vewitemsdetails() {
		return list;
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
	public void sendSearchData(String name) {
		if (!name.isEmpty()) {
			searchbar.clear();
			searchbar.sendKeys(name);

		}
	}

	public void searchbutton() {

		searchbutton.click();

	}

}
