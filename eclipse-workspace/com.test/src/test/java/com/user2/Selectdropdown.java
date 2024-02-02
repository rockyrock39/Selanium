package com.user2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();;
		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement dropdown= driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]"));

		Select dropdownmenu = new Select(dropdown);
		//dropdownmenu.selectByValue("Content Managment");
		dropdownmenu.selectByVisibleText("Content Managment");
		//WebElement Skill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value=\"Content Managment\"]")));

//		Skill.click();
		driver.findElement(By.xpath("//html")).click();
	}

}
