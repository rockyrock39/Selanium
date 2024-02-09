package com.user2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.collections4.Put;
//import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.log.Log;
import org.openqa.selenium.devtools.v118.network.model.RequestWillBeSent;
import org.openqa.selenium.devtools.v118.log.model.LogEntry;
import org.openqa.selenium.devtools.v118.network.Network;
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

// @Test
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

// @Test
public void enableNetwork()
{
    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
    devTools.addListener(Network.requestWillBeSent(), new Consumer<RequestWillBeSent>() {

		@Override
		public void accept(RequestWillBeSent t) {
			// TODO Auto-generated method stub
			System.out.println("URL" + t.getRequest().getUrl()+t.getRequest().getMethod());
			t.getRequest().getMethod();
		}
	
    });
driver.get("https://www.selenium.dev/");
devTools.send(Network.disable());
}
/**
 * 
 */
@Test
public void captureconsolelogsTest()
{
	devTools.send(Log.enable());
	devTools.addListener(Log.entryAdded(), new Consumer<LogEntry>() {

		@Override
		public void accept(LogEntry t) {
			// TODO Auto-generated method stub

			System.out.println("Log" + t.getText());
			System.out.println("Level" + t.getLevel());

		}
	});

	driver.get("https://www.selenium.dev/");

}
@Test
public void basicAuth()
{
	

    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
    Map<String,Object> headers = new HashMap<>();
    String strUsr="admin";
    String strpwd="admin";
    String basicAuth = "Basic " + new String(new Base64().encode(String.format("%s:%s", strUsr,strpwd)))

	
}




}
