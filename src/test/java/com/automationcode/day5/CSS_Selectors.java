package com.automationcode.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		// //html[@attribute = 'value' ]  -> Xpath basic syntax
		// html[@attribute = value]  -> cssSelector basic syntax
		/* 
		   whenever there is an id attribute
	           html#idvalue
	           imput#idlogin1 
		*/
		 /*  whenever there is a class attribute
	            html.classvalue1
		 */
		/*   if it is a compound class
                html.value(1).value(2).value(n)
         */
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();       // 
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		

	}

}
