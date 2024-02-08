package TestNgExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.pageloader.GoogleSearchPageFactory;
import com.user2.CreateScreenshotelement;

import utilities.CreateScreenshotExample;
import utilities.ReadFromcsvfrTestNg;

public class ExtentReportTestNG {
	
	WebDriver 	driver;
	ExtentTest test;
	ExtentReports extent;
@Test
public void testCase1 ()
{
test= extent.createTest("Google test","Verify Serach functionallity");
	driver.get("https://google.com");
	String Title= driver.getTitle();
	Assert.assertEquals(Title, "google111");
	//screenshot.getScreenshot(driver,"help");
	
	
}

@AfterMethod
public void testListeners(ITestResult result) throws IOException
{
	if (result.getStatus()==ITestResult.FAILURE)
	{
		String Screenshot = CreateScreenshotExample.getScreenshot(driver, result.getName());
		test.fail("Details",MediaEntityBuilder.createScreenCaptureFromPath(Screenshot).build());
		
	}else if (result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "Test SKIP");

	}else
	{
		test.log(Status.PASS, "Test pass");
	}
	driver.quit();
	
}

@BeforeTest
public void setup()
{
	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("googletest.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlreporter);
    driver = new ChromeDriver();	
}

@AfterTest
public void FlushReport()
{
	extent.flush();
}
}
