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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement Element = driver.findElement(By.xpath("//div[@class='auto-complete__control css-yk16xz-control']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		Element.sendKeys("Re");
		Element.sendKeys(Keys.ARROW_DOWN);
		
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='auto-complete__menu css-2313qy-menu']")));
		
		//element2.click();
			
		
	}

}
