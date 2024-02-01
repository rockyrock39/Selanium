package com.user2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowswitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
			driver.close();
			System.out.println("Title"+message);
			
			}
			//driver.close();
			
		}
		
		driver.switchTo().window(Currenthandle);
		driver.findElement(By.cssSelector("button[id=\"windowButton\"]")).click();
		
		Set<String> newwindow=driver.getWindowHandles();
		System.out.println("Newwindow"+newwindow);
		for (String handle : newwindow)
		{
			if (handle.trim().equals(Currenthandle.trim()))
			{
				System.out.println("Titlekjqhiuwh" );
			}
			else {
			driver.switchTo().window(handle);
			String message=driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText();
			driver.close();
			System.out.println("Title popup "+message);
			
			}
			//driver.close();
			
		}
		
		driver.switchTo().window(Currenthandle);
		driver.findElement(By.cssSelector("button[id=\"messageWindowButton\"]")).click();
		Set<String> newwindowmsg=driver.getWindowHandles();
		System.out.println("Newwindowmsg"+newwindowmsg);
		
		for (String handle : newwindowmsg)
		{
			if (handle.trim().equals(Currenthandle.trim())) {
				System.out.println("Titlekjqhiuwh");
			} else {
				System.out.println("else" + handle);
				
				driver.switchTo().window(handle);
				Thread.sleep(5000);
			//	System.out.println("message popup " + driver.getPageSource());
				String message=driver.findElement(By.cssSelector("body")).getText();
			//	driver.close();
				 System.out.println("message popup "+message);

			}
			// driver.close();

		}
	}

}
