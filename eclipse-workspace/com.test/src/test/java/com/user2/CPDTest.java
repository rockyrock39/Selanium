package com.user2;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.Put;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CPDTest {
	
	ChromiumDriver driver;
	DevTools devTools;
	
@BeforeMethod
public void setup()
{
	driver = new ChromeDriver();
	devTools = driver.getDevTools();

	devTools.createSession();

}

@Test
public void deviceModeTest()
{
	
	Map deviceMetrics = new HashMap()
	{{
		put("width",414);
		put("height",896);
		put("deviceScaleFactor",50);
		put("mobile",true);

	}};
	
driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
driver.get("https://www.selenium.dev/");
	
}


/**
 * 
 */
// @Test
public void getGeoLocationTest()
{
	Map deviceMetrics = new HashMap()
			{{
				put("latitude",27.664827);
				put("longitude",-81.15755);
				put("accuracy",100);
			}};
			
		driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
		driver.get("https://oldnavy.gap.com/stores");
	}

}
