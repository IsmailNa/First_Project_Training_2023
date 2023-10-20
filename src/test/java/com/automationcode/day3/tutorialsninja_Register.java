package com.automationcode.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialsninja_Register {

	

	public static void main(String[] args) throws Exception {
		
		
	    // tnRegister();
	      facebookCreateNewAccount ();
	      
	
	}
	
	public static void tnRegister()  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.partialLinkText("Regist")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ismail");
		driver.findElement(By.name("lastname")).sendKeys("Nachite");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("inachit2021@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("5716229889");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("inachit1993");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("inachit1993");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
		

	}

	public static void facebookCreateNewAccount () throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Kamal");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("inachit3333@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("inachit3333@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("inachit3333");
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
		
		
		
	}
	
	
	
}
