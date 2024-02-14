package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	JavascriptExecutor js;
	/*
	 * @FindAll(value= @FindBy(css = "ul li")) List<WebElement> Textbox1;
	 */
	@FindBy(how = How.XPATH, using = "//a[@class=\"accordion-toggle\"]")
	WebElement checkoutpage;
	/*
	 * @FindBy(how = How.ID, using = "s-name") WebElement name;
	 * 
	 * @FindBy(how = How.ID, using = "s-surname") WebElement surname;
	 * 
	 * @FindBy(how = How.ID, using = "s-address") WebElement address;
	 * 
	 * @FindBy(how = How.ID, using = "s-zipcode") WebElement zipcode;
	 * 
	 * @FindBy(how = How.ID, using = "s-city") WebElement city;
	 * 
	 * @FindBy(how = How.ID, using = "s-company") WebElement company;
	 * 
	 * @FindBy(how = How.ID, using = "asap") WebElement radio;
	 * 
	 * @FindBy(how = How.XPATH, using = "//button[normalize-space()='Buy']")
	 * WebElement buybutton;
	 * 
	 * @FindBy(how = How.XPATH,using = "//div[@id=\"content\"]/h1") WebElement
	 * OrgerConfirkm;
	 * 
	 * @FindBy(how = How.TAG_NAME,using="html") WebElement tagname;
	 */
	
	public checkoutpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	  js= (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);

	}


	public String getchecopageconfirmation()
	{
		return checkoutpage.getText();
	}
	public void backtoNormal()
	{
		js.executeScript("document.body.style.zoom = '1'");
	}
	

}
