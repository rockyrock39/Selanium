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

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("src")).click();
		
		driver.findElement(By.id("src")).sendKeys("c");
		driver.findElement(By.id("src")).sendKeys("h");
		driver.findElement(By.id("src")).sendKeys("e");
		//Thread.slpp
		driver.findElement(By.id("src")).sendKeys("n");
		driver.findElement(By.id("src")).sendKeys("n");
		driver.findElement(By.id("src")).sendKeys("a");
		driver.findElement(By.id("src")).sendKeys("i");
		//driver.findElement(By.id("src")).wait(3000);

		driver.findElement(By.id("src")).sendKeys(Keys.SPACE);

		//js.executeScript("arguments[0].scrollIntoView();", Element);
		//Element.click();
		//Element.sendKeys("chennai");
		//Element.sendKeys(Keys.ARROW_DOWN);
		
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li[2]")));
		
		element2.click();
			
		driver.findElement(By.id("dest")).click();
		driver.findElement(By.id("dest")).sendKeys("b");
		driver.findElement(By.id("dest")).sendKeys("a");
		driver.findElement(By.id("dest")).sendKeys("n");
		driver.findElement(By.id("dest")).sendKeys("g");
		//driver.findElement(By.id("src")).wait(3000);
		driver.findElement(By.id("dest")).sendKeys("l");
		driver.findElement(By.id("dest")).sendKeys("o");
		driver.findElement(By.id("dest")).sendKeys("r");
		driver.findElement(By.id("dest")).sendKeys("e");
		driver.findElement(By.id("dest")).sendKeys(Keys.SPACE);
		
		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li[2]")));
		
		element3.click();
		
	}

}
