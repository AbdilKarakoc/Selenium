package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("Chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		boolean AfterTextEnter = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		if(AfterTextEnter) {
			System.out.println("Good Job!");
		}else {
			System.out.println("Bad Job!");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
