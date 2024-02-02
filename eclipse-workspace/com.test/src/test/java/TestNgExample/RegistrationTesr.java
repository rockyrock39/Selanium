package TestNgExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class RegistrationTesr {
	WebDriver driver;
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		 driver = new ChromeDriver();
	}
	@Test
	private void validatename() {
		// TODO Auto-generated method stub
		SoftAssert softAsset =new SoftAssert();
		WebElement name =driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		name.sendKeys("Rahul");
		System.out.println(name.getAttribute("value"));
		//Assert.assertEquals(name.getAttribute("value"), "Rahulq");
		softAsset.assertEquals(name.getAttribute("value"), "Rahulq");
		//System.out.println("Hello");
		//to make it fail in case of soft assert 
		softAsset.assertAll("Error in comparing value");
		softAsset.assertAll();
		
	}
	@Test
	public void Validatepage() {
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
