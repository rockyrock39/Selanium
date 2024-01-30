package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Githuburltest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage");
		driver.get("https://demoqa.com/text-box");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rahul Sarma");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("rahu.sarma@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Gurgaon ,india pin: 1221001");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Gurgaon ,india pin: 1221001");
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		WebElement elemwnt = driver.findElement(By.id("submit"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		WebElement elemwnt1 =driver.findElement(By.xpath("//p[@id=\"name\"]"));
		System.out.println(elemwnt1.getText());
		WebElement elemwnt2 =driver.findElement(By.xpath("//p[@id=\"email\"]"));
		System.out.println(elemwnt2.getText());
		WebElement elemwnt3 =driver.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
		System.out.println(elemwnt3.getText());
		WebElement elemwnt4 =driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]"));
		System.out.println(elemwnt3.getText());
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
		;
		WebElement elemwnt5 = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt5);
		//driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//div[@class='check-box-tree-wrapper']/div/div/button[@class='rct-option rct-option-expand-all']")).click();
		Thread.sleep(10000);
		
		//WebElement elemwnt6 = driver.findElement(By.xpath("//ol/li[@class='rct-node rct-node-leaf'][1]/span/label[@for='tree-node-notes']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", elemwnt6);
		driver.findElement(By.xpath("//ol/li[@class='rct-node rct-node-leaf'][1]/span/label[@for='tree-node-notes']")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-react']")).click();
		WebElement elemwnt6 = driver.findElement(By.xpath("//label[@for='tree-node-office']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt6);
		System.out.println("is office dispayed" +elemwnt6.isDisplayed());
		System.out.println("is office ebabled"+elemwnt6.isEnabled());
		System.out.println(elemwnt6.isSelected());
		elemwnt6.click();
		//Thread.sleep(10000);
		System.out.println(elemwnt6.isSelected());

		//driver.findElement(By.xpath("//label[@for='tree-node-office']")).click();
		WebElement elemwnt7= driver.findElement(By.xpath("//span[@class='text-success']"));
		//System.out.println(elemwnt7);
		
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']")).click();

		//.click();
	
		
		WebElement elemwnt8 = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", elemwnt8);
		
		System.out.println(elemwnt8.isEnabled());
		elemwnt8.click();
		System.out.println(elemwnt8.isEnabled());
	}

}
