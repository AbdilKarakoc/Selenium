package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
//TC 2: Mercury Tours Registration: 
	//Open chrome browser
	//Go to “http://newtours.demoaut.com/”
	//Click on Register Link
	//Fill out all required info
	//Click Submit
	//User successfully registered
	//(Create 2 scripts using different locators)
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com ");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Abdil");
		driver.findElement(By.name("lastName")).sendKeys("Karakoc");
		driver.findElement(By.name("phone")).sendKeys("1111111111");
		driver.findElement(By.id("username")).sendKeys("abdilkarakoc@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("3338 stone heather");
		driver.findElement(By.name("city")).sendKeys("Virginia");
		driver.findElement(By.name("state")).sendKeys("Herndon");
		driver.findElement(By.name("postalCode")).sendKeys("20171");
		
		
		
		driver.findElement(By.className("SUBMIT")).click();
	}

}
