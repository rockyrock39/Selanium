package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.domsnapshot.model.TextBoxSnapshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(how = How.XPATH, using = "//input[@name='search']")
	WebElement Textbox1;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default btn-lg']")
	WebElement searchbutton;

	
	
	

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	public void sendSearchData(String name) {
		if (!name.isEmpty()) {
			Textbox1.sendKeys(name);

		}
	}

	public void searchbutton() {

		searchbutton.click();

	}
	
}
