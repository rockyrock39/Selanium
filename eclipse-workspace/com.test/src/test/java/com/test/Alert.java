package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demoqa.com/alerts");
		WebElement elemwnt = driver.findElement(By.cssSelector("button[id=\"promtButton\"]"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt);
		driver.findElement(By.cssSelector("button[id=\"promtButton\"]")).click();
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.sendKeys("You are ok");
System.out.println(alert.getText());
alert.accept();
		
	}

}
