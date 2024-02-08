package TestNgExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.CreateScreenshotExample;

public class Screenshot {
	
	@Test
	public void getScreenShot()
	{
		WebDriver driver= new ChromeDriver();
		CreateScreenshotExample.getScreenshot(driver, "photo") ;
		
	}

}
