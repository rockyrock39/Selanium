package page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	JavascriptExecutor js;
	@FindAll(value= @FindBy(css  =  "//div[@class=\"table-responsive\"]/table/tbody/tr"))
	List<WebElement> Textbox1;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Checkout']")
	WebElement addtobutton;

	public ShoppingCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);

	}
	public  boolean isitemSelected()
	{
		if(Textbox1.size()>0)
		{
			return true;
		}else
			return false;
		
	}
	
	public void clickcheckout()
	{
		js.executeScript("arguments[0].click();", addtobutton);
	}

}
