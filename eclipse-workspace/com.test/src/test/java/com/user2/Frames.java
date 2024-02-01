package com.user2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriverWait
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement elemwnt = driver.findElement(By.id("frame1"));
		js.executeScript("arguments[0].scrollIntoView();", elemwnt);
		driver.switchTo().frame("frame1");
		//driver.findElement(By.)
		//System.out.println("FrameSource" + driver.getPageSource());

		//driver.findElement(By.cssSelector("button[id=\"tabButton\"]")).click();

	}

}
