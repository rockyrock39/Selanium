package com.pageloader;

import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class GoogleSearchPageFactory {
	WebDriver driver;

	public GoogleSearchPageFactory(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using ="q")
	WebElement serachelement;

	public void NevigateGooglepage() {
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	
	public void typeSearchword(String keyword)
	{
		serachelement.click();
		serachelement.sendKeys(keyword);
		serachelement.sendKeys(Keys.ENTER);
	}

}
