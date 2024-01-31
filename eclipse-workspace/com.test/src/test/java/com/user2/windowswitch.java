package com.user2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elemwnt = driver.findElement(By.cssSelector("button[id=\"tabButton\"]"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt);
		driver.findElement(By.cssSelector("button[id=\"tabButton\"]")).click();
		String Currenthandle =driver.getWindowHandle();
		System.out.println("Current handle"+ Currenthandle);
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		
		for (String handle : handles)
		{
			if (handle.trim().equals(Currenthandle.trim()))
			{
				System.out.println("Titlekjqhiuwh" );
			}
			else {
			driver.switchTo().window(handle);
			String message=driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText();

			System.out.println("Title"+message);
			
			}
			//driver.close();
			
		}
		
	}

}
