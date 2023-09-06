package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Code_Practice {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	    driver.findElement(By.id("email")).sendKeys("7.ismail");
	    driver.findElement(By.name("pass")).sendKeys("0633080408");
	    driver.findElement(By.name("login")).click();
	   

		
		
		
	}

}
