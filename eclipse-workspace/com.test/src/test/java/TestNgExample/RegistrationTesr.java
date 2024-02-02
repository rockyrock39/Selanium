package TestNgExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.Assert;

public class RegistrationTesr {
	WebDriver driver;
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		 driver = new ChromeDriver();
	}
	@Test
	public void validatepage() {
		// TODO Auto-generated method stub
		//driver = new ChromeDriver();
		driver.manage().window().maximize();;
		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		String expectedtitle="Register";
		Assert.assertEquals(driver.getTitle(), expectedtitle);
	}
	@AfterClass
	public void BrowserClose() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	

}
