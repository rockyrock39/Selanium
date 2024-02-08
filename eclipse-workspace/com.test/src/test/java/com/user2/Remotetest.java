package com.user2;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Remotetest {

	@Test
	public void getRemote() {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(option.CAPABILITY, option);
		WebDriver driver = null;

		try {
			driver = new RemoteWebDriver(URI.create("http://localhost:4444/").toURL(), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to("https://google.com");
		WebElement element = driver.findElement(By.name("q"));

		System.out.println(element.isDisplayed());

	}

}
