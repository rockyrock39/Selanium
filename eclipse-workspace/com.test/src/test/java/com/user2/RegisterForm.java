package com.user2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();;
		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Sarma");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Gurgaon delhi 1221001");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9999999999");
		WebElement gender =driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		System.out.println("is gender Clikable"+ gender.isEnabled());
		gender.click();
		System.out.println("is gender Clikable"+ gender.isSelected());
		
		WebElement hobbies =driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
		System.out.println("is gender Clikable"+ hobbies.isEnabled());
		hobbies.click();
		System.out.println("is gender Clikable"+ hobbies.isSelected());
		
		driver.findElement(By.id("msdd")).click();

		WebElement language = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"English\"]")));

		language.click();
		
		//language.submit();
		driver.findElement(By.xpath("//html")).click();
		
		driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]")).click();

		WebElement Skill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value=\"Content Managment\"]")));

		Skill.click();
		driver.findElement(By.xpath("//html")).click();


	}

}
