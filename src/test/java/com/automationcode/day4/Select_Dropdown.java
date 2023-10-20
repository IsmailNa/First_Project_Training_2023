package com.automationcode.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {
	
	public static Select select;
	

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("firstname")).sendKeys("Ali");
	    Thread.sleep(1000);
	    driver.findElement(By.name("lastname")).sendKeys("Jack");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("nachite2020@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("nachite2020@gmail.com");
	    
	    
		// May 9 1996
	    
	    // Selection for the month
	    
	    select = new Select(driver.findElement(By.id("month")));
	    select.selectByVisibleText("May");
	    
	    select = new Select(driver.findElement(By.id("day")));
	    select.selectByVisibleText("9");
	    
	    select = new Select(driver.findElement(By.id("year")));
	    select.selectByVisibleText("1996");
	    
	    

	}

}
