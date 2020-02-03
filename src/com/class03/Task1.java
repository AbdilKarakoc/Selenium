package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.name("txtUsername")).sendKeys("sohilaryan");

		driver.findElement(By.id("txtPassword")).sendKeys("Syntax@12");
		driver.findElement(By.name("Submit")).click();
		
		WebElement message=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		System.out.println(message.isDisplayed());
	}

}
