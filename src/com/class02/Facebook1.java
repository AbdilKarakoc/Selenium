package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("abdilkarakoc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Cemalyusuf2009");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();

}
}
