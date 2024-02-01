package com.user2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();

		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		Alert alrtcanok=driver.switchTo().alert();
		
		System.out.println(alrtcanok.getText());
		//System.out.println(alrtcanok.notify());
		//alrtcanok.notify();
		
		alrtcanok.dismiss();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		
		Alert alrttextbox=driver.switchTo().alert();
		System.out.println(alrttextbox.getText());
		Thread.sleep(9000);
		//driver.switchTo().alert().sendKeys("you are doing ok");
		alrttextbox.sendKeys(Keys.DELETE.toString());
		alrttextbox.sendKeys("you are doing ok");
		alrttextbox.accept();
		//System.out.println(alrtcanok.notify());
		//alrttextbox.notify();
		System.out.println("done");
	}

}
