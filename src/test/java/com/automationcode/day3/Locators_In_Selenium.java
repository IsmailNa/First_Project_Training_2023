package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_Selenium {

	public static void main(String[] args) {
		
		// id
		// class
		// name
		// linkText
		// partiallinkText
		// xpath
		// cssSelector
		// tagname   (Not very much used)

		// Locator 1 - id 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		*/
    
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Selenium@123");
		
		// driver.findElement(By.className("btn btn-primary")).click(); -> this will give an error, because it's a compound class
		
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		
		
		
	}

}
