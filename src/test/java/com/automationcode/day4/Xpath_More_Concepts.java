package com.automationcode.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_More_Concepts {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	
		tutorialsninjaslow1 ();
		mycarhelplineCalculator();
		
	}
		
	private static void tutorialsninjaslow1() {
		
		
	}

	public static void tutorialsninjaslow () throws Exception {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("john");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id, 'input-lastname')]")).sendKeys("smith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("5713216657");
		
     	

	}

	public static void mycarhelplineCalculator() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mycarhelpline.com");
		driver.findElement(By.xpath("//li[@class ='item-72']/child::a")).click();
		driver.findElement(By.xpath("//div[@id ='bodycontainer-innerpage']/descendant::img[3]")).click();
		
		
		
	}
	
	
	
}
