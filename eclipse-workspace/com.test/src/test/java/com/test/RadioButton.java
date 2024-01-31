package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demoqa.com/text-box");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement elemwnt10 = driver
				.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
		js.executeScript("arguments[0].scrollIntoView();", elemwnt10);
		elemwnt10.click();
		// driver.findElement(By.xpath("//div[@class='element-list collapse
		// show']//li[@id='item-2']")).click();

		// .click();

		WebElement elemwnt8 = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));

		//js.executeScript("arguments[0].scrollIntoView();", elemwnt8);
//hi
		System.out.println(elemwnt8.isEnabled());
		elemwnt8.click();
		System.out.println(elemwnt8.isEnabled());

		WebElement elemwnt9 = driver.findElement(By.xpath("//label[@for='noRadio']"));

		js.executeScript("arguments[0].scrollIntoView();", elemwnt8);

		System.out.println("Radio Button enable" + elemwnt9.isEnabled());
		elemwnt9.click();

		System.out.println(elemwnt9.isSelected());
		System.out.println(driver.findElement(By.xpath("//p/span[@class='text-success']")).getText());
		
		

	}

}
