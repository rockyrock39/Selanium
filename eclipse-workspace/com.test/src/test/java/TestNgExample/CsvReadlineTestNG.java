package TestNgExample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageloader.GoogleSearchPageFactory;
import com.user2.CreateScreenshotelement;

import utilities.CreateScreenshotExample;
import utilities.ReadFromcsvfrTestNg;

public class CsvReadlineTestNG {
	
	WebDriver 	driver;
	
@DataProvider(name="csvfile")
public Object[][] ReadFile() throws IOException {
	// TODO Auto-generated method stub
	ReadFromcsvfrTestNg lReadFromcsvfrTestNg = new ReadFromcsvfrTestNg();
	Object[][] read=lReadFromcsvfrTestNg.readCsvFile("csvfile.csv");
	return read;

}
@Test(dataProvider="csvfile")
public void testCase1 (String name,String email,String l,String la)
{
	GoogleSearchPageFactory search = new GoogleSearchPageFactory(driver);
	CreateScreenshotExample screenshot = new CreateScreenshotExample();
	search.NevigateGooglepage();
	search.typeSearchword(name);
	
	screenshot.getScreenshot(driver,"help");
	
	
}

@BeforeTest
public void setup()
{
driver = new ChromeDriver();	
}

@AfterTest
public void closeBrowser()
{
	driver.quit();
}
}
