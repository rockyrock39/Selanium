package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	

	    @Before("@first")
	    public void setupDriver()
	    
	    {
	    	TestBase.initiateDiver();;
	    }
	    
	    @After
	    public void TearDown(Scenario scenerio)
	    
	    { 
	    	if (scenerio.isFailed())
	    	{
	    		TakesScreenshot screen = (TakesScreenshot)TestBase.getDriver();
	    		byte [] image = screen.getScreenshotAs(OutputType.BYTES);
	    		scenerio.attach(image, "image/png", "screenImage");
	    		
	    	}
	    	
	    }
	    
		/*
		 * @AfterAll public static void after_all() { TestBase.close(); }
		 */
}
