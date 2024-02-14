package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	private static TestBase testbase;
	private static WebDriver driver;
	

	private TestBase(String browser) {
		// TODO Auto-generated constructor stub
		String Browser = "chrome";
		if (Browser == "chrome") {
			driver = new ChromeDriver();

		}else if (Browser == "edge") {
			driver = new EdgeDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
	}
	
	public static void initiateDiver()
	{
		if (testbase==null)
		{
			testbase = new TestBase("chrome");
		}
		
		
	}
	
	public static WebDriver getDriver()
	{
	  return driver;	
	}
	
	public static void getUrl(String Url)
	{
		if (!Url.isEmpty())
		{
		driver.get(Url);
		}
		
	}
	
	public static void close()
	{
		if (driver != null)
		{
			driver.close();
			driver.quit();
		}
		testbase=null;
	}

}
