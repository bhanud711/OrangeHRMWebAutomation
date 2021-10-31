package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmSubscribe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	    
	     driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	     driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	     driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	     driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	     driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	     driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
	     

	}

}
