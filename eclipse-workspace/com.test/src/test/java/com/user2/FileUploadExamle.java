package com.user2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();;
		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demo.automationtesting.in/Register.html");
		String path ="C:\\Users\\Administrator\\Desktop\\download.png";
		driver.findElement(By.id("imagesrc")).sendKeys(path);
		
		driver.quit();
	}

}
