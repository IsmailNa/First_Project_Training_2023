package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Introduction {

	public static void main(String[] args) {
		
		// What is Xpath ?
		// Address of a WebElement 
		
		// Type of Xpath ?
		// 1. Absolute Xpath
        // 2. Relative Xpath
		
		// Which Xpath is more accurate ?
		// Absolute is more accurate
		
		// Which Xptah is safe to use ?
		// Relative Xpath
		
		// How to customize Xpath ?
		// Basic mistakes committed while designing Xpath
		// Relative/Dynamic/Customized Xpath 

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class ='signinbtn']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
