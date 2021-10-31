package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmMoveEle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	    
	     driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	     driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	     driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	     driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	     driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
			  WebElement a0 = driver.findElement(By.xpath("//b[text()='Leave']")); 
			  WebElement a1 =driver.findElement(By.xpath("//a[text()='Entitlements']")); 
			  WebElement a2 =driver.findElement(By.xpath("//a[text()='Add Entitlements']")); 
			  Actions action = new Actions(driver);
			  action.moveToElement(a0).moveToElement(a1).moveToElement(a2).click().build().perform();
			 

	}
	

}
