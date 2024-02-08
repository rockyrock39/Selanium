package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class CreateScreenshotExample {

	public static String getScreenshot(WebDriver driver , String Name)  {
		// TODO Auto-generated method stub
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//WebElement elemet = driver.findElement(By.id("APjFqb"));
		
		//elemet.sendKeys("Rahul");
		//elemet.sendKeys(Keys.ENTER);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Destination = "./Screenshot/"+Name+"_"+timestamp+".png";
		try {
			FileUtils.copyFile(file, new File(Destination));
		} catch (IOException e) {
			e.printStackTrace();
		} //
		 /* TODO Auto-generated catch block e.printStackTrace(); }
		 */
		//driver.quit();
		return Destination;
	}
	
	public static String getScreenshot(WebElement element , String Name)  {
		// TODO Auto-generated method stub
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		//WebElement elemet =driver.findElement(By.id("APjFqb"));
		element.sendKeys("Rahul");
		//elemet.sendKeys(Keys.ENTER);
		//element.sendKeys(Keys.ENTER);
		File file=element.getScreenshotAs(OutputType.FILE);
		String Destination = "./Screenshot/"+Name+"_"+timestamp+".png";
		try {
			FileUtils.copyFile(file, new File("google.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Destination;
	}

}
