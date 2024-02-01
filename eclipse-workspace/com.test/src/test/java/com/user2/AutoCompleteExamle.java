package com.user2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompleteExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("src")).sendKeys("chennai");
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		//Element.click();
		//Element.sendKeys("chennai");
		//Element.sendKeys(Keys.ARROW_DOWN);
		
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li[2]")));
		
		element2.click();
			
		driver.findElement(By.id("dest")).sendKeys("banglore");
		
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li[2]")));
		
		element3.click();
		
	}

}
